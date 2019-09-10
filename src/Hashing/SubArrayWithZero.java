package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZero {

	
	public static void main(String args[]) {
		
		int[] arr= {5, 6, -4, -2, 8, 10};
		
		Set<Integer> integer = new HashSet<Integer>();
		integer.add(0);
		int prefix_sum=0;
		boolean isExist = false;
		for(int i=0;i<arr.length;i++) {
			
			prefix_sum += arr[i];
			if(integer.add(prefix_sum)) {
				System.out.println("Exist ..");
				isExist = true;
				break;
			}
		}
		
		if(!isExist) {
			System.out.println("Not exist");
		}
	}
}
