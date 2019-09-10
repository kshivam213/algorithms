package Array;

import java.util.Scanner;

public class KadeneAlgo {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for(int i=0;i<T;i++) {
			
			int N = scan.nextInt();
			int arr[]= new int[N];
			
			for(int j=0;j<N;j++) {
				arr[j]= scan.nextInt();
 			}
			
			int sumNow=0, maxSum=0;
			for(int j=0;j<N;j++) {
				sumNow += arr[j];
				if(sumNow > maxSum) {
					maxSum = sumNow;
				}
				
				if(sumNow <0)
					sumNow = 0;
			}
			
			System.out.println(maxSum);
		}
		scan.close();
	}
}
