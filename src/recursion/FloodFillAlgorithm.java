package recursion;

import java.util.Scanner;

public class FloodFillAlgorithm {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			
			int M= scan.nextInt();
			int N= scan.nextInt();
			
			int screen[][] = new int[M][N];
			for(int a=0;a<M;a++) {
				for(int b=0;b<N;b++) {
					screen[a][b]= scan.nextInt();
				}
			}
			
			
			int x= scan.nextInt();
			int y= scan.nextInt();
			int newC= scan.nextInt();
			
			
			floodFill(x, y, newC, M, N, screen);
			
			for(int a=0;a<M;a++) {
				System.out.println();
				for(int b=0;b<N;b++) {
					
					System.out.print(screen[a][b]);
				}
			}
		}
		scan.close();
	}
	
	static void floodFillUtil(int x, int y, int newC, int prevC, int M, int N, int screen[][]) {
		
		if (x < 0 || x >= M || y < 0 || y >= N) 
	        return; 
		
		if(screen[x][y] != prevC)
			return;
		else
		screen[x][y]= newC;
		
		floodFillUtil(x+1, y, newC, prevC, M, N, screen);
		floodFillUtil(x-1, y, newC, prevC, M, N, screen);
		floodFillUtil(x, y+1, newC, prevC, M, N, screen);
		floodFillUtil(x, y-1, newC, prevC, M, N, screen);
		
	}
	
	static void floodFill(int x, int y, int newC, int M, int N, int[][] screen) 
	{ 
	    int prevC = screen[x][y];
	    floodFillUtil( x, y, newC, prevC, M, N, screen); 
	}
}
