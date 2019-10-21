package searching;

public class SearchInInfiniteArray {

	public static void main(String args[]) {
		int[] arr = { 10, 13, 19, 20, 21, 29, 31, 41 };
		int index = findInInfiniteArr(arr, 20);

		System.out.println(index);

	}

	private static int findInInfiniteArr(int[] arr, int x) {

		if(arr[0] == x)
			return 0;
		
		int i=1;
		while(arr[i] <x) {
			i = i*2;
		}
		
		if(arr[i] == x)
			return i;
		
		else {
			return binarySearch(arr, i/2, i, x);
		}
		
	}

	private static int binarySearch(int[] arr, int l, int r, int x) {
		if(l>r)
			return -1;
		
		int mid = l+ (r-l)/2;
		
		if(arr[mid]==x)
			return mid;
		
		if(arr[mid] > x)
			return binarySearch(arr, l, mid-1, x);
		
		return binarySearch(arr, mid+1, r, x);
		
	}
}
