package Array;

import java.util.Scanner;

public class JoephProblem {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			
			int N = scan.nextInt();
			int k = scan.nextInt();
			
			int pos = findLuckiestPerson(N, k);
			System.out.println(pos);
		}
		scan.close();
	}

	private static int findLuckiestPerson(int n, int k) {
		
		if(n == 1)
			return 0;
		
		return (findLuckiestPerson(n-1, k) +k) % n;
	}
}



















