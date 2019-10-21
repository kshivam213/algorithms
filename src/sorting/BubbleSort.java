package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String args[]) {
		
		int [] arrA = {5, 1, 9, 3, 2, 10};
        sort(arrA);
	}

	private static void sort(int[] arrA) {
		
		for(int i=0;i<arrA.length;i++) {
			
			for(int j=0;j<arrA.length-i-1;j++) {
				
				if(arrA[j] > arrA[j+1]) {
					
					int temp = arrA[j];
					arrA[j] = arrA[j+1];
					arrA[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arrA));
	}
}
