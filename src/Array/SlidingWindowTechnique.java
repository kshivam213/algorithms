package Array;

public class SlidingWindowTechnique {

	public static void main(String[] args) {
		
		int arr[] = {5 , 2 , -1 , 0 , 3};
		int k = 3;
		int max_sum =0, start=0, end=k-1,window_sum=0;
		
		if(k< arr.length) {
			
			for(int i=0;i<arr.length;i++) {

				if(i+k<= arr.length) {
					
					if(i == 0) {
						for(int j=i;j<i+k;j++) {
							window_sum += arr[j];
						}
						max_sum = window_sum;
					}else {
						window_sum -= arr[i-1];
						window_sum+= arr[i+k-1];
						
						if(window_sum > max_sum) {
							max_sum = window_sum;
							
							start = i;
							end= i+k-1;
						}
					}
				}	
			}
			System.out.println(max_sum+" "+start+" "+end);
		}
	}
}
