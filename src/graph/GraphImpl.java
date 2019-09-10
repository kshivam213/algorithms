package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphImpl {

		List<ArrayList<Integer>> graph;
		int vertex;
		
		GraphImpl(int vertex){
			this.graph =  new ArrayList<ArrayList<Integer>>();
			this.vertex = vertex;
			
			for(int i=0;i<vertex;i++) {
				graph.add(new ArrayList<Integer>());
			}
		}
		
	   public void addEdge(int u, int v) {
		   
		   graph.get(u).add(v);
		   graph.get(v).add(u);
	   }
	   
	   public void printGraph() {
		   
		   for (int i = 0; i < graph.size(); i++) {
	            System.out.println("\nAdjacency list of vertex" + i);
	            for (int j = 0; j < graph.get(i).size(); j++) {
	                 System.out.print(" -> "+graph.get(i).get(j));
	            }
	            System.out.println();
	        }
	   }
	   
	   public void BFS() {
		   
		   boolean visited[] = new boolean[vertex];
		   for(int i=0;i<vertex;i++) {
			   visited[i] = false;
		   }
		   
		   Queue<Integer> q = new LinkedList<Integer>();
		   q.add(0);
		   
		   while(!q.isEmpty()) {
			   
			   int s = q.poll();
			   System.out.println(s);
			   for(int i=0;i<graph.get(s).size(); i++) {
				   
				   int node = graph.get(s).get(i);
				   if(!visited[node]) {
					   visited[node] = true;
					   q.add(node);
				   }
			   }
		   }
	   }
	   
	   
	   public void DFS(int stPoint) {
		   
		   boolean visited[] = new boolean[vertex];
		   findDFS(stPoint, visited);
	   }
	   
	   public void findDFS(int v, boolean[] visited) {
		   
		   visited[v] = true;
		   System.out.println(v+ " ");
		   
		   ArrayList<Integer> list = graph.get(v);
		   for(Integer i: list) {
			   
			   if(!visited[i]){
				   findDFS(i, visited);
			   }
		   }
	   }
}
