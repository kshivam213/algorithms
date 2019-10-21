package Queue;

import java.awt.print.Printable;


public class QueueUsingLinkedlist {

	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data= data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node last = null;
	
	public void enqueue(int data) {
		
		Node newNode= new Node(data);
		if(head == null) {
			head = last = newNode;
		}else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public int dequeue() {
		
		int data = head.data;
		head = head.next;
		
		return data;
	}
	
	public void printQueue() {
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			
			temp= temp.next;
		}
	}
	
	public static void main(String args[]) {
		
		QueueUsingLinkedlist qLlist= new QueueUsingLinkedlist();
		qLlist.enqueue(12);
		qLlist.enqueue(13);
		qLlist.enqueue(14);
		qLlist.enqueue(15);
		qLlist.enqueue(16);
		qLlist.enqueue(17);
		qLlist.enqueue(19);
		
		qLlist.printQueue();
		
		System.out.println("Dequeue element is "+qLlist.dequeue());

		System.out.println("Dequeue element is "+qLlist.dequeue());
		
		qLlist.printQueue();
	}
}
