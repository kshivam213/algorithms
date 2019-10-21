package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String args[]) {
		int[] arrA = { 5, 1, 9, 3, 2, 10 };
		sort(arrA);
	}
	
	private static void sort(int[] arr) {

		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j;
			
			for(j=i-1;j>=0 && arr[j] >key;j-- ) {
				arr[j+1]= arr[j];
			}
			
			arr[j+1]= key;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
