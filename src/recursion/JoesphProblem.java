package recursion;

/**
 * Find the last person who survive from N person after skipping every k person
 * @author shivamkumar
 */
public class JoesphProblem {

	public static void main(String args[]) {
		
		int n=7, k=3;
		System.out.println(josephProblem(n, k));
	}

	private static int josephProblem(int n, int k) {
		
		if(n == 1)
			return n;
		
		return (josephProblem(n-1, k)+ k-1) % n+1;
	}
}
