package Array;

/**
 * Find equilibrium point of array with O(n) time complexity
 * @author shivamkumar
 */
public class EquilibrimPoint {
	
	public static void main(String args[]) {
		
		int arr[]= {-7, 1, 5, 2, -4, 3, 0};
		int leftSum=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			
			sum-= arr[i];
			if(leftSum == sum) {
				System.out.println("Equilibrium point is "+i);
				break;
			}
			leftSum+= arr[i];
		}	
	}
}
