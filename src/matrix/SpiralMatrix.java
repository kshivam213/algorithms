package matrix;

public class SpiralMatrix {
	
	public static void main(String args[]) {
		
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};
		
		int top = 0;
		int right= 3;
		int left= 0;
		int bottom = 3;
		
		int draw =1;
		while(left <= right && top <= bottom) {
			
			if(draw == 1) {
				for(int i= left; i<= right;++i) {
					System.out.print(arr[top][i]+" ");
				}
				
				++top;
				draw = 2;
			}
			
			if(draw == 2) {
				
				for(int i=top;i<= bottom;++i) {
					System.out.print(arr[i][right]+" ");
				}
				
				--right;
				draw = 3;
			}
			
			if(draw == 3) {
				for(int i=right;i>= left; --i) {
					System.out.print(arr[bottom][i]+" ");
				}
				
				bottom--;
				draw = 4;
			}
			
			if(draw == 4) {
				
				for(int i=bottom;i>= top; --i) {
					System.out.print(arr[i][left]+" ");
				}
				
				left++;
				draw = 1;
			}
		}
		
	}
}
