package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'listMax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY operations
     */

    public static long listMax(int n, List<List<Integer>> operations) {
        // Write your code here
        
        long[] arr= new long[n];
        Arrays.fill(arr, 0);
        
        for(List<Integer> operation: operations){
            int start= operation.get(0)-1;
            int end= operation.get(1)-1;
            
            int value= operation.get(2);
            
            arr[start] += value;
            if(end+1 < n)
            	arr[end+1] -= value;
        }   
        
        long max=0, curr=0;
        
        for(int i=0; i< n; i++){
            
            curr+= arr[i];
            if(curr > max)
                max= curr;
        }
        
        return max;
    }
    
    public static void main(String args[]) {
    		
    		List<List<Integer>> rs = new ArrayList<List<Integer>>();
    		
    		rs.add(Arrays.asList(2, 3, 603));
    		rs.add(Arrays.asList(1, 1, 286));
    		rs.add(Arrays.asList(4, 4, 882));
    		
    		
    		System.out.println(listMax(4, rs));
    }
}

