package Queue;


/**
 * Circular Queue
 * @author shivamkumar
 *
 */
public class BasicQueue {

	int front,rear,size;
	int capacity;
	int array[];
	
	public BasicQueue(int cap) {
		
		this.capacity = cap;
		front = this.size = 0;
		rear = cap-1;
		array = new int[cap];
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
		
		this.rear = (this.rear +1) % this.capacity;
		array[this.rear] = data;
		this.size = this.size+1;
		
		System.out.println("One item enqueued");
	}
	
	int dequeue() {
		
		if(isEmpty())
			return Integer.MIN_VALUE;
		
		int item = this.front;
		this.front = (this.front + 1)% this.capacity;
		this.size = this.size -1;
		
		return item;
	}
	
	int front() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		
		return this.array[this.front];
	}
	
	
	int rear() {
		
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		
		return this.array[this.rear];
	}
	
	void printQueue() {
		
		int i= front;
		while(i != rear) {
			System.out.print(this.array[i]+" ");
			
			i = (i+1) % this.capacity;
		}
		System.out.print(this.array[i]);
	}
	
	public static void main(String args[]) {
		
		BasicQueue bq = new BasicQueue(5);
		
		bq.enqueue(4);
		bq.enqueue(5);
		bq.enqueue(2);
		bq.enqueue(9);
		bq.enqueue(8);
		
		bq.dequeue();
		
		bq.enqueue(10);
		
		bq.printQueue();
	}
}
