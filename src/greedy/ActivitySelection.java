package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ActivitySelection {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			
			int count =1,lastSelected=0;
			int N = scan.nextInt();
			int start[] = new int[N];
			int end[] = new int[N];
			
			List<Period> periodList = new ArrayList<Period>();
			for(int j=0;j<N;j++) {
				start[j] = scan.nextInt();
			}
			
			for(int j=0;j<N;j++) {
				end[j] = scan.nextInt();
			}
			
			for(int j=0;j<N;j++) {
				Period period = new Period();
				period.endTIme= end[j];
				period.startTIme= start[j];
				
				periodList.add(period);
			}
			
			periodList.sort(new Comparator<Period>() {

				@Override
				public int compare(Period o1, Period o2) {
					
					return o1.endTIme - o2.endTIme;
				}
			});
			
			
			for(int j=1;j<N;j++) {
				
				if(periodList.get(j).startTIme >= periodList.get(lastSelected).endTIme) {
					lastSelected = j;
					count++;
				}
			}
			
			System.out.println(count);
		}
		scan.close();
	}
}
