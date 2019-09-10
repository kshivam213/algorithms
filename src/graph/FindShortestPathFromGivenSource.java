package graph;

public class FindShortestPathFromGivenSource {
	
	static final int V= 9;
	
	public int minDistance(int[] dist, boolean[] visited) {
		
		int min = Integer.MAX_VALUE, min_index = 0;
		
		for(int v=0;v<V;v++) {
			if(!visited[v]  && dist[v] < min) {
				min = dist[v];
				min_index = v;
			}
		}
		
		return min_index;
	}
	
	void printSolution(int dist[], int n) 
    { 
        System.out.println("Vertex   Distance from Source"); 
        for (int i = 0; i < V; i++) 
            System.out.println(i + " tt " + dist[i]); 
    } 
	
	public void dijkstra(int[][] graph, int src) {
			
		int dist[] = new int[V];
		boolean visited[] = new boolean[V];
		
		for(int i=0;i<V;i++) {
			dist[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		
		dist[src] = 0;
		
		for(int i=0;i<V;i++) {
			
			int u = minDistance(dist, visited);
			
			visited[u] = true;
			
			for(int j= 0;j<V;j++) {
				
				if(!visited[j] && graph[u][j] != 0 && dist[u]!= Integer.MAX_VALUE && dist[u] + graph[u][j] < dist[j]) {
					dist[j]= dist[u] + graph[u][j];
				}
			}
		}
		
		printSolution(dist, V); 
	}
	
	public static void main(String[] args) 
    { 
        /* Let us create the example graph discussed above */
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 
        FindShortestPathFromGivenSource t = new FindShortestPathFromGivenSource(); 
        t.dijkstra(graph, 0); 
    } 
}
