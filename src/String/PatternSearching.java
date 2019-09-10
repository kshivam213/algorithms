package String;

import java.util.Scanner;

public class PatternSearching {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		String text = "THIS IS A TEST TEXT";
		String pat = "TEST";
		
		search(text, pat);
		
		scan.close();
	}
	
	public static void search(String text, String pat) {
		
		int n= text.length();
		int m= pat.length();
		
		for(int i =0;i<=n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				
				if(text.charAt(i+j) != pat.charAt(j)) {
					break;
				}
			}
			
			if(j == m) {
				System.out.println("Pattern found at index ... "+i);
			}
		}
	}
}
