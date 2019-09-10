package recursion;

/**
 * Find all subsets of String 
 * @author shivamkumar
 *
 */
public class PowerSet {

	public static void main(String args[]) {
		
		String str = "abc";
		int index =0;
		String curr="";
		
		int len = str.length();
		powerSet(str, index, curr, len);
	}
	
	private static void powerSet(String str, int index, String curr, int len) {
		
		if(index == len) {
			System.out.println(curr);
			return;
		} 
		
		powerSet(str, index+1, curr+str.charAt(index), len);
		powerSet(str, index+1, curr, len);		
	}
}
