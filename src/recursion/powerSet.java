package recursion;

/**
 * Find all subsets of String 
 * @author shivamkumar
 *
 */
public class powerSet {

	public static void main(String args[]) {
		
		String str = "abc";
		int index =0;
		String curr="";
		
		int len = str.length();
		getPowerSet(str, index, curr, len);
	}
	
	private static void getPowerSet(String str, int index, String curr, int len) {
		
		if(index == len) {
			System.out.println(curr);
			return;
		} 
		
		getPowerSet(str, index+1, curr+str.charAt(index), len);
		getPowerSet(str, index+1, curr, len);		
	}
}
