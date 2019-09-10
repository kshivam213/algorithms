package matrix;

public class UpperAndLowerSum {

	public static void main(String args[]) {
		

		int arr[][] = {{6,5,4},{1,2,5},{7,9,7}};
		
		int upperSum=0, lowerSum=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr[i].length;j++) {
				upperSum+= arr[i][j];
			}
			
			for(int j=0;j<=i;j++) {
				lowerSum+= arr[i][j];
			}
		}
		
		System.out.println(upperSum+" "+lowerSum);
	}
}
