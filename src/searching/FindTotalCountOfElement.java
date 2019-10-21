package searching;

/**
 * Find total count of element
 * @author shivamkumar
 */
public class FindTotalCountOfElement {

	public static void main(String args[]) {
		
		int[] arr= {1,2,3,3,3,3,5,6};
		int leftIndex= findLeftMostIndex(arr, 0, arr.length-1, 6, arr.length);
		int rightIndex= findRightMostIndex(arr, 0, arr.length-1, 6, arr.length);
		
		System.out.println(rightIndex-leftIndex+1);
	}

	private static int findRightMostIndex(int[] arr, int i, int j, int k, int n) {
		if(i>j)
			return -1;
		
		int mid= i+(j-i)/2;
		if(arr[mid] == k && (mid == n-1 || arr[mid+1] != k))
			return mid;
		
		if(arr[mid] > k)
			return findRightMostIndex(arr, mid-1, j, k, n);
		else
		   return findRightMostIndex(arr, mid+1, j, k, n);
	}

	private static int findLeftMostIndex(int[] arr, int i, int j, int k, int n) {
		
		if(i>j)
			return -1;
		
		int mid = i+(j-i)/2;
		
		if(arr[mid] == k && (mid == 0 || arr[mid-1] != k))
			return mid;
		
		if(arr[mid] >= k)
			return findLeftMostIndex(arr, i, mid-1, k, n);
		
		return findLeftMostIndex(arr, mid+1, j, k, n);
	}
}
