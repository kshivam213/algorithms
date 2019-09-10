package linkedList;

public class CustomDoublyLinkedList {

	Node head;
	Node end;
	static class Node{
		
		Node prev;
		Node next;
		int data;
		
		Node(int data){
			
			this.data = data;
			prev = next = null;
		}
	}
	
	public void add(int data) {
		
		Node new_node = new Node(data);
		
		new_node.prev = null;
		new_node.next= head;
		
		if(head == null) {
			end = new_node;
		}else {
			head.prev= new_node;
		}
		
		head = new_node;
	}
	
	public void display() {
		
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
	}
	
	public void displayReverse() {
		
		Node tmp = end;
		while(tmp != null) {
			System.out.print(tmp.data+" ");
			tmp = tmp.prev;
		}
	}
}
