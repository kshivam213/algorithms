package stack;

import java.util.Stack;

public class StockSpanProblem {

	
	public static void main(String args[]) {
		
		int arr[] = {15, 13, 12, 14, 16, 8, 6, 4, 10, 30};
		int n = arr.length;
		findStockSpan(arr, n);
	}

	private static void findStockSpan(int[] arr, int n) {
		
		Stack<Integer> s= new Stack<>();
		
		s.push(0);
		
		for(int i=1;i<n;i++) {
			while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
				s.pop();
			}
			
			int span = (s.isEmpty()) ? (i+1): i -s.peek();
			
			System.out.print(" "+span);
			
			s.push(i);
		}
	}
}
