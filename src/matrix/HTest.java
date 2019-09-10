package matrix;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class HTest {
    public static void main(String[] args) throws IOException {
        
       /* Scanner scan = new Scanner(System.in);        
         long X = scan.nextLong();
         long T = scan.nextLong();
         int N = scan.nextInt();
        
         long[] arr = new long[N];
         for(int i_arr=0; i_arr<arr.length; i_arr++)
         {
         	arr[i_arr] = scan.nextLong();
         }

         long out_ = solve(X, arr, T);
         System.out.println(out_);

        scan.close();*/
    	
    	
    	   List<Integer> list = new ArrayList<Integer>();
    	   list.add(1);
    	   
    	   System.out.println(list);
    	   
    	   check(list);
    	   
    	   System.out.println(list);
    	   
    }
    
    static void check(List<Integer> list) {
    		
    		list.add(4);
    }
    
    /*static long solve(long x, long[] arr, long t){
        
        int result =0, sum=0, counter=0;
    		for(int i=0;i<arr.length;i++) {
    			
    			sum += arr[i];
    			counter++;
    			
    			if(sum > x) {
    				result += (t-(counter-1));
    				
    				counter =0;
    				
    				sum = 0;
    				sum += arr[i];
    			}
    			
    			if(counter == t) {
    				counter =0;
    				sum =0;
    			}
    		}
    		
    		return result;
    }*/
}