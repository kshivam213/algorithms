package stack;

public class StackImpl {

	static final int MAX= 1000;
	
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty() {
		return (top <0);
	}
	
	boolean push(int data) {
		
		if(top >= (MAX-1)) {
			System.out.println("No space available ..");
			return false;
		}else {
			a[++top] = data;
			System.out.println(" Pushed in stack .. "+data);
			return true;
		}
	}
	
	int pop() {
		
		if(top <0) {
			System.out.println("No element present .. ");
			return 0;
		}else {
			return a[top--];
		}
	}
	
   public static void main(String args[]) {
		
		StackImpl stack = new StackImpl();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.pop());
	}
}
