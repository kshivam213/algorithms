package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String args[]) {
		int[] arrA = { 5, 1, 9, 3, 2, 10 };
		sort(arrA);
	}

	private static void sort(int[] arrA) {

		for(int i=0;i<arrA.length;i++) {
			
			int min_Index = i;
			for(int j=i+1;j<arrA.length;j++) {
				if(arrA[j] < arrA[min_Index]) {
					min_Index= j;
				}
			}
			
			int temp = arrA[min_Index];
			arrA[min_Index] = arrA[i];
			arrA[i] = temp;
		}
		
		System.out.println(Arrays.toString(arrA));
	}
}
