package greedyAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NMeeting {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			
			int N = scan.nextInt();
			int lastSelected=0;
			
			int[] start = new int[N];
			int[] end = new int[N];
			
			for(int j=0;j<N;j++) {
				start[j] = scan.nextInt();
			}
			
			for(int j=0;j<N;j++) {
				end[j] = scan.nextInt();
			}
			
			
			List<Period> periodList = new ArrayList<Period>();
			
			for(int j=0;j<N;j++) {
				Period period = new Period();
				period.endTIme= end[j];
				period.startTIme= start[j];
				period.index= j+1;
				
				periodList.add(period);
			}
			
			
			
			periodList.sort(new Comparator<Period>() {
				
				@Override
				public int compare(Period p1, Period p2) {
					
					return p1.endTIme - p2.endTIme;
				}
			});
			
			System.out.print(periodList.get(0).index);
			for(int j=1;j<N;j++) {
				
				if(periodList.get(j).startTIme >= periodList.get(lastSelected).endTIme) {
					lastSelected = j;
					System.out.print(" "+periodList.get(j).index);
				}
			}
			
			
		}
		
		scan.close();
	}
}
