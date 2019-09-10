package matrix;

public class RotationMatrix {

	public static void main(String args[]) {
		
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr[i].length;j++) {
				
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i]=  temp;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			int k = arr[i].length-1;
			for(int j=0;j<arr[i].length/2;j++) {
				
				int temp = arr[j][i];
				arr[j][i]= arr[k][i];
				arr[k][i]= temp;
				
				k--;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println();
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}
}
