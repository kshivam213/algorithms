package matrix;

public class BoundryElementMatrix {

	public static void main(String args[]) {
		
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println();
			for(int j=0;j<arr[i].length;j++) {
				
				if(i==0) {
					System.out.print(arr[i][j]+" ");
				}else if(j==0) {
					System.out.print(arr[i][j]+" ");
				}else if(i == arr.length-1) {
					System.out.print(arr[i][j]+" ");
				}else if(j== arr[i].length-1) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print(" ");
				}
			}
		}
	}
}
