package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubarrayEqualsX {

	public static void main(String args[]) {
		
		int[] arr= {5,3,8,-2,8,16};
		
		Set<Integer> cursor = new HashSet<Integer>();
		int prefix_sum=0;
		int x = 10;
		boolean isExist = false;
		
		for(int i=0;i<arr.length;i++) {
			
			prefix_sum += arr[i];
			
			cursor.add(prefix_sum);
			
			int check = prefix_sum-x;
			if(cursor.contains(check)) {
				isExist= true;
				System.out.println("Exist ..");
				break;
			}
		}
		
		if(!isExist) {
			System.out.println("Not Exist");
		}
	}
}
