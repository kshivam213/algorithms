package stack;

import java.util.Stack;

public class PreviousGreaterElement {

	
	public static void main(String args[]) {
		
		int arr[] = { 15, 10, 18,12,4,6,2,8 };  
	    int n = arr.length;  
	    printPGE(arr, n);  
	}

	private static void printPGE(int[] arr, int n) {
		
		Stack<Integer> s = new Stack<Integer>();
		int[] res= new int[n];
		
		for(int i=0;i<n;i++) {
			
			while(!s.isEmpty() && s.peek() <= arr[i]) {
				s.pop();
			}
			
			if(s.isEmpty())
				res[i] = -1;
			else
				res[i] = s.peek();
				
			s.push(arr[i]);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(" "+res[i]);
		}
	}
}
