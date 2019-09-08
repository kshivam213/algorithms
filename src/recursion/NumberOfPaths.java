package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Find the all way to reach from starting to ending point
 * Having contraint that from each cell you can either move to right or down.
 * @author Shivam kumar
 */

public class NumberOfPaths {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int N = scan.nextInt();
			
		List<String> possiblePath = new ArrayList<String>();
		String buffer = new String();
			
		int[][] intArr= new int[M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				intArr[i][j] = scan.nextInt();
			}
	    }
			
		findPossiblePath(0, 0, M, N, possiblePath, buffer, intArr);
			
		System.out.println(possiblePath);
	
		scan.close();
	}
	public static void findPossiblePath(int i, int j, int row, int col, List<String> listPossiblePath, String buffer, int[][] intArr) {
		
		if(i <= row-1 && j<= col-1) {
			
			buffer = buffer+ intArr[i][j];
			if(i == row-1 && j == col-1) {
				
				listPossiblePath.add(buffer);
			}else {
				findPossiblePath(i, j+1, row, col, listPossiblePath, buffer, intArr);
				findPossiblePath(i+1, j, row, col, listPossiblePath, buffer, intArr);
			}
		}
	}
}
