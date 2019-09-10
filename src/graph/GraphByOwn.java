package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphByOwn {

	List<ArrayList<Integer>> graph;
	int vertex;
	
	
	GraphByOwn(int vertex){
		graph = new ArrayList<ArrayList<Integer>>();
		this.vertex = vertex;
		
		for(int i=0;i<=vertex;i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
	
	GraphByOwn(){
	}
	
	void addEdge(int u, int v) {
		
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	void bfs() {
		
		int s = 1;
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(s);
		
		boolean visited[] = new boolean[vertex+1];
		Arrays.fill(visited, false);
		
		visited[s] = true;
		
		while(q.size() != 0) {
			
			int node = q.poll();
			System.out.println(node);
			
			for(int i=0;i<graph.get(node).size();i++) {
				
				int nd = graph.get(node).get(i);
				if(!visited[nd]) {
					q.add(nd);
					visited[nd] = true;
				}
			}
		} 
	}
	
	void dfs(int st) {
		
		boolean visited[] = new boolean[vertex+1];
		
		dfsUtil(st, visited);
	}
	
	void dfsUtil(int st, boolean[] visited) {
		
		visited[st]= true;
		System.out.print(st +" ");
		ArrayList<Integer> list = graph.get(st);
		for(Integer node : list) {
			if(!visited[node])
				dfsUtil(node, visited);
		}
	}

	public static void main(String args[]) {
		
		GraphByOwn ownGraph = new GraphByOwn(6);
		ownGraph.addEdge(1, 2);
		ownGraph.addEdge(1, 3);
		ownGraph.addEdge(2, 4);
		ownGraph.addEdge(2, 5);
		ownGraph.addEdge(3, 5); 
		ownGraph.addEdge(4, 5);
		ownGraph.addEdge(4, 6);
		ownGraph.addEdge(5, 6);
		
		ownGraph.bfs();
		ownGraph.dfs(2);
	}
}
