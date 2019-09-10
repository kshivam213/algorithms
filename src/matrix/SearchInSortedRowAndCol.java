package matrix;

public class SearchInSortedRowAndCol {

	public static void main(String args[]) {
		
		int arr[][] = {{10,20,30},{15,25,80},{35,90,100}};
		
		int key = 25;
		boolean isFound = false;
		
		int i=0, j= 2;
		while(i< arr.length && j >= 0) {
			
			if(arr[i][j] == key) {
				isFound = true;
				System.out.println(i+","+j);
				break;
			}else if(arr[i][j] < key) {
				i++;
			}else {	
				j--;
			}
		}
		
		if(!isFound) {
			System.out.println("Not found");
		}
	}
}
