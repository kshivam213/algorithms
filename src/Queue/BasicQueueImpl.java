package Queue;


/**
 * Circular Queue
 * @author shivamkumar
 *
 */
public class BasicQueueImpl {

	int front,rear,size;
	int capacity;
	int array[];
	
	public BasicQueueImpl(int cap) {
		
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
	
	int getFront() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		
		return this.array[this.front];
	}
	
	
	int getRear() {
		
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
}
