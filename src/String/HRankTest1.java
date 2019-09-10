package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class HRankTest1 {

    /*
     * Complete the 'shortestSubstring' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int shortestSubstring(String s) {
        // Write your code here
        
        
        Set<Character> uniqueSet = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            uniqueSet.add(s.charAt(i));
        }
            
        
        boolean[] boolMap = new boolean[256];
        Arrays.fill(boolMap, false);
        
        int uniqLen = uniqueSet.size();
        int minLen = Integer.MAX_VALUE;
        
        int subStringLen=0; 
        int uniqueSubstringLen=0;
        char initialChar = 0;
        
        
        for(int i=0;i<s.length();i++){
        
            char c = s.charAt(i);
           
            if(uniqueSet.contains(c)){
            		subStringLen++;
	    		
                if(subStringLen == 1) {
        				initialChar = c;
        			}
                
                if(subStringLen == 2 && initialChar == c) {
        	    			subStringLen --;
        	    		}
        	    		
                if(!boolMap[c]){
              
                    uniqueSubstringLen++;
                    boolMap[c] = true;
                }
                
                if(uniqueSubstringLen == uniqLen){
                    
                    if(subStringLen < minLen){
                        minLen = subStringLen;
                    }
                
                    subStringLen =0;
                    uniqueSubstringLen =0;
                    Arrays.fill(boolMap, false);
                } 
            }
        }
		return minLen;
    }
    
    public static void main(String args[]) {
    		
    		System.out.println(shortestSubstring("aabcce"));
    }
}

