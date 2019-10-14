package linkedList;

public class CustomSinglyLinkedList {
	
	
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
	
	public void addBefore(int data) {
		
		Node newNode  = new Node(data);
		if(head == null) {
			head= newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void addAfter(int data) {
		
		Node newNode= new Node(data);
		if(head == null) {
			head = last = newNode;
		}else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void display() {
		
		Node temp = head;
		while(temp != null) {
			
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
	}
	
	public void addMid(int data) {
		
		Node newNode= new Node(data);
		Node temp = head;
		int len = 0;
		while(temp != null) {
			temp = temp.next;
			len++;
		}
		
		int i =0;
		int count= 0;
		if(len %2==0) {
			count = (len/2) -1;
		}else {
			count = (len/2);
		}
		temp = head;
		while(i< count) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next= newNode;
	}
	
	public void removeStart() {
		
		if(head == null) {
			System.out.println("No Data found");
		}
		
		head = head.next;
		return;
	}
	
	public void remove(int data) {
		
		if(head == null) {
			System.out.println("No data found ..");
		}else {
			Node temp = head, prev=null;
			if(temp.data == data) {
				head  = temp.next;
				return;
			}
			
		
			while(temp != null && temp.data != data) {
				
				prev = temp;
				temp = temp.next;
			}
			
			if(temp == null) 
				return;
			
			prev.next = temp.next;
		}
	}
	
	public void reverseLinkedList() {
		
		Node prev= null;
		Node curr= head, next= head;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev= curr;
			curr = next;
		}
		
		head = prev;
	}
	
	public static void main(String args[]) {
		
		CustomSinglyLinkedList list = new CustomSinglyLinkedList();
		list.addAfter(3);
		list.addAfter(4);
		list.addAfter(5);
		list.addAfter(7);
		list.addAfter(8);
		
		list.display();
		
		list.reverseLinkedList();
		System.out.println();
		list.display();
	}
}
