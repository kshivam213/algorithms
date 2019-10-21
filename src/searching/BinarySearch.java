package searching;

public class BinarySearch {

	static int binarySearch(int[] arr, int l, int r, int x) {
		if(l>r)
			return -1;
		
		int mid = l+ (r-l)/2;
		
		if(arr[mid]==x)
			return mid;
		
		if(arr[mid] > x)
			return binarySearch(arr, l, mid-1, x);
		
		return binarySearch(arr, mid+1, r, x);
	}
	
	public static void main(String args[]) {
		
		int[] arr= {10, 20, 30, 40, 50, 60};
		int x= 20;
		System.out.println(binarySearch(arr, 0, arr.length-1, x));
	}
}
