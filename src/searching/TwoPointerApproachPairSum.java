package searching;

/**
 * Find the pair which equals to x
 * @author shivamkumar
 */
public class TwoPointerApproachPairSum {

	
	public static void main(String args[]) {
		
		int[] arr= {2, 4, 8, 9, 11, 12, 20, 30};
		int x= 23;
		System.out.println(isPair(arr, arr.length, x));
	}

	private static boolean isPair(int[] arr, int length, int x) {
		
		int left = 0, right= length-1;
		
		while(left< right) {
			
			if(arr[left] +arr[right] == x)
				return true;
			
			if(arr[left] +arr[right] > x)
				right--;
			else
				left++;
		}
		
		return false;
	}
}
