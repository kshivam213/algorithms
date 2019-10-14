package stack;

import java.util.Stack;

public class NextGreaterElement {

	
	public static void main(String args[]) {
		int arr[] = { 11, 13, 21, 3 };  
	    int n = arr.length;  
	    printNGE(arr, n);  
	}

	private static void printNGE(int[] arr, int n) {
		
		Stack<Integer> s = new Stack<>();
		int[] res= new int[n];
		
		for(int i= n-1; i>=0;i--) {
			
			while(!s.isEmpty() && s.peek() <= arr[i])
				s.pop();
			
			if(s.isEmpty())
				res[i]= -1;
			else
				res[i] = s.peek();
			
			s.push(arr[i]);
		}
		
		for(int i=0;i<n;i++)
			System.out.println(res[i]);
	}
}

