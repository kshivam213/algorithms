package recursion;

/**
 * Get All possible phone nos
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneDigit
{
    private static final HashMap<Integer, String> phoneNumbers = new HashMap<>();

    static {
    		phoneNumbers.put(0, "");
    		phoneNumbers.put(1, "");
        phoneNumbers.put(2, "abc");
        phoneNumbers.put(3, "def");
        phoneNumbers.put(4, "ghi");
        phoneNumbers.put(5, "jkl");
        phoneNumbers.put(6, "mno");
        phoneNumbers.put(7, "pqrs");
        phoneNumbers.put(8, "tuv");
        phoneNumbers.put(9, "wxyz");
    }
    
    void possibleWords(int a[], int N)
    {
        Map<Integer, Character> resultBuffer = new HashMap<Integer, Character>();
        generateSum(a, 0, resultBuffer);
    }
    
    private static void generateSum(int nums[], int i, Map<Integer, Character> result) {
		
		 if(i < nums.length) {
			 
			 int index = nums[i];
			 String str = phoneNumbers.get(index);
			 
			 for(int a=0;a<str.length();a++) {
				 
				 result.put(i, str.charAt(a));
				 
				 if(i == nums.length-1) {
					 
					 StringBuffer buffer = new StringBuffer();
					 for(Integer key: result.keySet()) {
						 buffer.append(result.get(key));
					 }
					 System.out.print(buffer.toString());
					 System.out.println();
				 }else{
					 generateSum(nums, i+1, result);
				 }
			 }
		 }else {
			 return;
		 }
	}
    
    
}
public class AllPossibleWordOfPhone {
	
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T >0) {
			
			
			int n= scan.nextInt();
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i] = scan.nextInt();
			}
			
			new PhoneDigit().possibleWords(arr, n);
			System.out.println();
			T--;
			
		}
	}
	
	/*private static final HashMap<Integer, String> phoneNumbers = new HashMap<>();

    static {
    		phoneNumbers.put(0, "");
    		phoneNumbers.put(1, "");
        phoneNumbers.put(2, "abc");
        phoneNumbers.put(3, "def");
        phoneNumbers.put(4, "ghi");
        phoneNumbers.put(5, "jkl");
        phoneNumbers.put(6, "mno");
        phoneNumbers.put(7, "pqrs");
        phoneNumbers.put(8, "tuv");
        phoneNumbers.put(9, "wxyz");
    }
    
	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
		
			int N= scan.nextInt();
			List<Integer> nums = new ArrayList<Integer>();
			
			for(int j=0;j<N;j++) {
				nums.add(scan.nextInt());
			}
			
			Map<Integer, Character> resultBuffer = new HashMap<Integer, Character>();
			generateSum(nums, 0, resultBuffer);
		}
		scan.close();
	}

	private static void generateSum(List<Integer> nums, int i, Map<Integer, Character> result) {
		
		 if(i < nums.size()) {
			 
			 int index = nums.get(i);
			 String str = phoneNumbers.get(index);
			 
			 for(int a=0;a<str.length();a++) {
				 
				 result.put(i, str.charAt(a));
				 
				 if(i == nums.size()-1) {
					 
					 StringBuffer buffer = new StringBuffer();
					 for(Integer key: result.keySet()) {
						 buffer.append(result.get(key));
					 }
					 System.out.print(buffer.toString());
					 System.out.println();
				 }else{
					 generateSum(nums, i+1, result);
				 }
			 }
		 }else {
			 return;
		 }
	}*/
	
	
}
