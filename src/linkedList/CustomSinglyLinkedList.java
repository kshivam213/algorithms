package linkedList;

public class CustomSinglyLinkedList {

	Node head;
	Node end;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void add(int data) {
		
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void addLast(int data) {
		
		Node new_node = new Node(data);
		new_node.next= null;
		
		if(head == null) {
			end = head = new_node;
		}else {
			end.next = new_node;
			end =  new_node;
		}
	}
	
	public void addAfter(int index, int data) {
		
		Node new_Node= new Node(data);
		Node temp = head;
		for(int i=0;i<index;i++)
		{
			temp = temp.next;
		}
		
		new_Node.next = temp.next;
		temp.next = new_Node;
	}
	
	public void remove(int key) {
		
		Node tmp= head;
		
		if(tmp != null && tmp.data== key) {
			head = tmp.next;
			return;
		}
		
		Node prev= head;
		while(tmp != null && tmp.data != key) {
			prev = tmp;
			tmp = tmp.next;
		}
		
		if(tmp == null)
			return;
		
		prev.next = tmp.next;
	}
	
	public void reverseLinkedList() {
		
		Node current = head;
		Node prev= null;
		Node next= null;
		
		while(current != null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
	}
	
	public boolean checkLoop() {
		
		Node slow_pointer = head;
		Node fast_pointer = head;
		boolean isLoop = false;
		
		while(fast_pointer.next != null && fast_pointer != null && slow_pointer != null) {
			
			slow_pointer = slow_pointer.next;
			fast_pointer = fast_pointer.next.next;
			
			if(slow_pointer == fast_pointer) {
				isLoop = true;
			}
		}
		
		return isLoop;
	}
	
	public void display() {
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
