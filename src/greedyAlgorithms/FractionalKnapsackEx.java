package greedyAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FractionalKnapsackEx {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			
			
			int N= scan.nextInt();
			int W = scan.nextInt();
			double totalValues = 0;
			
			List<Knapsack> knapsackList = new ArrayList<Knapsack>();
			
			for(int j=0;j<N;j++) {
				
				Knapsack kanpsack = new Knapsack();
				kanpsack.value = scan.nextInt();
				kanpsack.weight= scan.nextInt();
				
				kanpsack.weightValueRation = kanpsack.value/kanpsack.weight;
				
				knapsackList.add(kanpsack);
			}
			
			knapsackList.sort(new Comparator<Knapsack>() {
				
				@Override
				public int compare(Knapsack nap1, Knapsack nap2) {
					
					if(nap1.weightValueRation > nap2.weightValueRation)
						return -1;
					
					if(nap1.weightValueRation < nap2.weightValueRation) {
						return 1;
					}
					
					return 0;
				}
			});
		
			for(int j=0;j<N;j++) {
				
				Knapsack knap = knapsackList.get(j);
				if(W > 0) {
					if(knap.weight < W) {
						totalValues+= knap.value;
					}else if(knap.weight > W) {
						totalValues += (knap.value * W) / knap.weight;
					}
					W-= knap.weight;
				}
			}
			
			System.out.println(totalValues);
		}
		
		scan.close();
	}
}
