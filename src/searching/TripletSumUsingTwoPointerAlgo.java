package searching;

/**
 * Find the triplet sum which is equal to x
 * 
 * @author shivamkumar
 */
public class TripletSumUsingTwoPointerAlgo {

	public static void main(String args[]) {

		int[] arr = { 2, 4, 8, 9, 11, 12, 20, 30 };
		System.out.println(isTriplet(arr, 0, arr.length, 32));

	}

	private static boolean isTriplet(int[] arr, int st, int en, int x) {

		for(int i=0;i<en;i++) {
			
			if(isPair(arr, i+1, en-1, x-arr[i]))
				return true;
		}
		
		return false;
	}

	private static boolean isPair(int[] arr, int st, int en, int x) {

		int left = st, right = en - 1;

		while (left < right) {

			if (arr[left] + arr[right] == x)
				return true;

			if (arr[left] + arr[right] > x)
				right--;
			else
				left++;
		}

		return false;
	}
}
