package greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JobSequencing {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			
			int N = scan.nextInt();
			int count= 0, totalValues = 0;
			
			boolean slot[] = new boolean[N];
			
			List<Jobs> jobList = new ArrayList<Jobs>();
			for(int j=0;j<N;j++) {
				
				Jobs job = new Jobs();
				job.jobId = scan.nextInt();
				job.deadLine = scan.nextInt();
				job.profit = scan.nextInt();
	
				jobList.add(job);
			}
			
			jobList.sort(new Comparator<Jobs>(){
				
				@Override
				public int compare(Jobs job1, Jobs job2) {
					
					if(job1.profit > job2.profit)
						return -1;
					
					if(job1.profit < job2.profit)
						return 1;
					
					
					return 0;
				}
			 });
			
			for (int j=0; j<N; j++)
                slot[j] = false;
			
			for(int j=0;j<N;j++) {
				
				for(int k=Math.min(N, jobList.get(j).deadLine)-1; k>=0;k--) {
				
					if(slot[k] == false) {
						count++;
						totalValues+= jobList.get(j).profit;
						slot[k] = true;
						break;
					}
				}
			}
			
			System.out.print(count+" "+totalValues);
		}
	
		scan.close();
	}
}
