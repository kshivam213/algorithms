package recursion;

/**
 * Find all subsets of String 
 * @author shivamkumar
 *
 */
public class PowerSet {

	public static void main(String args[]) {
		
		String str = "Shivam";
		int index =0;
		String curr="";
		
		int len = str.length();
		powerSet(str, index, curr, len);
	}

	private static void powerSet(String str, int index, String curr, int n) {
		
		if(index == n) {
			System.out.println(curr);
			return;
		}
		
		powerSet(str, index+1, curr+str.charAt(index), n);
		powerSet(str, index+1, curr, n);
	}
}
