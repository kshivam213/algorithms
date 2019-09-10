package graph;

public class GraphTest {

	public static void main(String args[]) {
		
		GraphImpl impl = new GraphImpl(5);
		
		impl.addEdge(0, 1);
		impl.addEdge(0, 4);
		impl.addEdge(1, 2);
		impl.addEdge(1, 3);
		impl.addEdge(1, 4);
		impl.addEdge(2, 3);
		
		impl.DFS(2);
	}
}
