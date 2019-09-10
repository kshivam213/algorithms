package stack;

public class BasicTest {

	public static void main(String args[]) {
		
		Stack stack = new Stack();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.pop());
	}
}
