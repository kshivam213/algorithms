package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String args[]) {
		
		int arr[] = {2,1,3,9,7,6};
		quickSort(arr, 0, arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void quickSort(int arr[], int st, int en) {
		
		if(st< en) {
			
			int pIndex = partition(arr, st, en);
			
			quickSort(arr, st, pIndex-1);
			quickSort(arr, pIndex+1, en);
		}
	}
	
	public static int partition(int arr[], int st, int en) {
		
		int pivot = arr[en];
		
		int pIndex = (st-1);
		
		for(int i=st;i<en;i++) {
			
			if(arr[i] <= pivot) {
				pIndex++;
				int temp = arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i]= temp;
			}
		}
		
		int temp = arr[pIndex+1];
		arr[pIndex+1]= arr[en];
		arr[en]= temp;
		
		System.out.println(Arrays.toString(arr));
		
		return pIndex+1;	
	}
}
