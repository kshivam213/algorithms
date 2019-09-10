package sorting;

import java.util.Arrays;

public class InversionCount {

	public static void main(String args[]) {
		
		int[] arr = { 1, 9, 6, 4, 5 };
		int[] aux = Arrays.copyOf(arr, arr.length);
		
		System.out.println("Inversion count is "+mergeSort(arr, aux, 0, arr.length-1));
		
	}
	
	public static int mergeSort(int arr[], int[] aux, int st, int en){
		
		if(st == en)
			return 0;
		
		int mid = (st +((en-st) >> 1));
		
		int inversionCount = 0; 
		inversionCount = mergeSort(arr, aux, st, mid);
		inversionCount+= mergeSort(arr, aux, mid+1, en);
		
		inversionCount+= merge(arr, aux, st, mid, en);
		
		return inversionCount;
	}

	private static int merge(int[] arr, int[] aux, int low, int mid, int high) {
		
		int inversionCount =0;
		
		int i=low, j=mid+1, k=low;
		while(i<=mid && j<= high) {
			
			if(arr[i] < arr[j]) {
				aux[k++]= arr[i++];
			}else {
				aux[k++]= arr[j++];
				inversionCount+= (mid - i +1);
			}
		}
		
		while(i<= mid) {
			arr[k++] = arr[i++];
		}
		
		while(j<= high) {
			arr[k++] = arr[j++];
		}
		
		for(i=low;i<= high;i++) {
			aux[i]= arr[i];
		}
		
		return inversionCount;
	}
}
