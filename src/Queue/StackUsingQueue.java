package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q1= new LinkedList<Integer>();
	Queue<Integer> q2= new LinkedList<Integer>();
	
	void push(int data) {
		
		q2.add(data);
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		Queue<Integer> q = q1;
		q1= q2;
		q2= q;
	}
	
	int pop() {
		return q1.poll();
	}
	
	int top() {
		return q1.peek();
	}
	
	
	public static void main(String args[]) {
		
		StackUsingQueue stckUsingQueue = new StackUsingQueue();
		stckUsingQueue.push(5);
		stckUsingQueue.push(6);
		stckUsingQueue.push(7);
		stckUsingQueue.push(8);
		stckUsingQueue.push(9);
		
		System.out.println(stckUsingQueue.q1);
		
		stckUsingQueue.pop();
		stckUsingQueue.pop();
		

		System.out.println(stckUsingQueue.q1);
		
	}
}
