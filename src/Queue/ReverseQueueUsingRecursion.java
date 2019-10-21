package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {

	public static void reverse(Queue<Integer> q) {
		
		if(q.isEmpty())
			return;
		
		int x = q.poll();
		
		reverse(q);
		q.add(x);
	}
	
	public static void main(String args[]) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(16);
		q.add(17);
		
		System.out.println(q);
		
		reverse(q);
		
		System.out.println(q);
	}
}
