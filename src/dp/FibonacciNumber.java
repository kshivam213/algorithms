package dp;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

	public static void main(String args[]) {
		
		int n = 5;
		
		List<Integer> listIn = new ArrayList<Integer>();
		fibonacci(listIn, n, 0);
		
		System.out.println(listIn);
	}

	private static void fibonacci(List<Integer> listIn, int n, int i) {
		
		if(i == n) {
			return;
		}
		
		if(i ==0 || i ==1) {
			listIn.add(i);
		}else {
			int sum = listIn.get(i-1) + listIn.get(i-2);
			listIn.add(sum);
		}
		
		fibonacci(listIn, n, i+1);
	}
}
