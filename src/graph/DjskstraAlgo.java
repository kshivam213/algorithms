package graph;

import java.util.Arrays;

public class DjskstraAlgo {

	public static final int V=9;
	
	public void printSolution(int dist[]) {
		for(int i=0;i<V;i++) {
			System.out.println(i +" -> "+dist[i]);
		}
	}
	
	public int minDistance(int[] dist, boolean spSet[]) {
		
		int min= Integer.MAX_VALUE, min_index = 0;
		
		for(int i=0;i<V;i++) {
			if(!spSet[i] && dist[i] < min) {
				min = dist[i];
				min_index= i;
			}
		}
		
		return min_index;
	}
	
	public void dijkstra(int[][] graph, int src) {
		
		int[] dist = new int[V];
		boolean spSet[] = new boolean[V];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		Arrays.fill(spSet, false);
		
		dist[src] = 0;
		for(int i=0; i<V;i++) {
			
			int u = minDistance(dist, spSet);
			
			spSet[u] = true;
			
			for(int j=0;j<V;j++) {
				
				if(!spSet[j] && graph[u][j] !=0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][j] < dist[j]) {
					dist[j] = dist[u] + graph[u][j];
				}
			}
		}
		
		printSolution(dist);
	}
	
	public static void main(String args[]) {
		
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 
            DjskstraAlgo t = new DjskstraAlgo(); 
            t.dijkstra(graph, 0); 
	}
}
