package searching;

/**
 * Find Leftmost existence of number
 * @author shivamkumar
 */

public class FindLeftMostNumber {

	static int searchLeftMostExistence(int[] arr, int l, int h, int x) {
		
		if(l > h)
			return -1;
		
		int mid = l+ (h-l)/2;
		
		if(arr[mid] == x && (mid == 0 || arr[mid-1] != x))
			return mid;
		
		if(arr[mid] >= x)
			return searchLeftMostExistence(arr, l, mid-1, x);
		
		return searchLeftMostExistence(arr, mid+1, h, x);
	}
	
	public static void main(String args[]) {
		
		int[] arr= {10, 20, 20, 20, 20, 30, 40, 50};
		System.out.println(searchLeftMostExistence(arr, 0, arr.length-1, 20));
	}
}
