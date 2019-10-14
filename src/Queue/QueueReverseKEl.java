package Queue;

import java.util.Stack;

public class QueueReverseKEl{
	
	int front, rear, size;
	int capacity;
	int arr[];
	
	public QueueReverseKEl(int cap) {
		this.capacity = cap;
		this.rear = cap-1;
		this.front = this.size = 0;
		this.arr = new int[cap];
	}
	
	boolean isFull() {
		return this.size == this.capacity;
	}
	
	boolean isEmpty() {
		return this.size == 0;
	}
	
	void enqueue(int data) {
		
		if(isFull())
			return;
		
		this.rear = (this.rear+1) % this.capacity;
		arr[this.rear] = data;
		this.size = this.size+1;
	}
	
	int dequeue() {
		
		if(isEmpty())
			return Integer.MIN_VALUE;
		
		int item = arr[this.front];
		this.front = (this.front+1) % this.capacity;
		this.size = this.size -1;
		
		return item;
	}
	
	void reverseKEl(int k) {
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<k;i++) {
			stack.push(dequeue());
		}
		
		while(!stack.isEmpty()) {
			enqueue(stack.pop());
		}
		
		for(int i=0; i< arr.length -k ;i++) {
			enqueue(dequeue());
		}
		
	}
	
	void printQueue() {
		
		int i = this.front;
		while(i != rear) {
			
			System.out.print(this.arr[i]+" ");
			i= (i+1) % this.capacity;
		}
		
		System.out.print(this.arr[i]);
	}
	
	public static void main(String args[]) {
		
		QueueReverseKEl queue = new QueueReverseKEl(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.enqueue(90);
		queue.enqueue(100);
		System.out.println(" *******   ");
		
		queue.printQueue();
		System.out.println();
		
		queue.reverseKEl(5);
		
		queue.printQueue();
	}
}