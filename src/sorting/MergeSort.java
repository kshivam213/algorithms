package sorting;

public class MergeSort {

	public static void main(String args[]) {
		
		int arr[] = {2,1,3,5,7,4,9,8};
		
		mergeSort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void mergeSort(int arr[]) {
		
		if(arr.length < 2)
			return;
		
		int len = arr.length;
		int mid = len/2;
		
		int left[] = new int[mid];
		int right[] = new int[len-mid];
		
		
		for(int i=0;i<left.length;i++) {
			left[i] = arr[i]; 
		}
		
		for(int i=mid,j=0;i<len;i++,j++) {
			right[j] = arr[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(arr, left, mid, right, len-mid);
	}

	private static void merge(int[] arr, int[] left, int leftCount, int[] right, int rightCount) {
		
		int i=0,j=0,k=0;
		
		while(i<leftCount && j<rightCount) {
			
			if(left[i] < right[j]) {
				arr[k++] = left[i++];
			}else {
				arr[k++] = right[j++];
			}
		}
		
		while(i<leftCount) {
			arr[k++] = left[i++];
		}
		
		while(j<rightCount) {
			arr[k++]= right[j++];
		}
	}
}
