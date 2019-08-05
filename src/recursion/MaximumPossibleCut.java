package recursion;

/**
 * Given sze of rod you have to find maximum cut from a, b, c measures.
 * @author shivamkumar
 */
public class MaximumPossibleCut {

	public static void main(String args[]) {
		
		int n=23, a=9, b=11, c=12;
		
		int maxCut = getMaximumCut(n, a, b, c);
		
		System.out.println(maxCut);
	}
	
	public static int getMaximumCut(int n, int a, int b, int c) {
		
		if(n <0) {
			return -1;
		}
		
		if(n == 0) {
			return 0;
		}
		
	
		int res = Integer.max(Integer.max(getMaximumCut(n-a, a, b, c), getMaximumCut(n-b, a, b, c)), getMaximumCut(n-c, a, b, c));
	    
		if(res == -1) {
			return -1;
		}else {
			return res+1;
		}
	}
} 
