package searching;

public class FindTotalOnesInSortedArr {

	public static void main(String args[]) {
		int[] arr= {0,1,1,1,1,1,1,1};
		int leftIndex= findLeftMostIndex(arr, 0, arr.length-1, 1);
		
		System.out.println(arr.length-leftIndex);
		
	}

	private static int findLeftMostIndex(int[] arr, int i, int j, int x) {
		
		if(i>j)
			return -1;
		
		int mid = i+(j-i)/2;
		
		if(arr[mid] == x && (mid == 0 || arr[mid-1] != x))
			return mid;
		
		if(arr[mid] >= x)
			return findLeftMostIndex(arr, i, mid-1, x);
		
		return findLeftMostIndex(arr, mid+1, j, x);
	}
} 
