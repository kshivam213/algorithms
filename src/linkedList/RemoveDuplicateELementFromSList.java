package linkedList;

/**
 * Remove duplicate Element From sorted list
 * @author shivamkumar
 */
public class RemoveDuplicateELementFromSList {

	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	
	public void display() {
		
		Node temp = head;
		while(temp != null) {
			
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
	}
	
	public void removeDuplicate(Node temp) {
		
		if(temp == null)
			return;
		
		if(temp.next != null) {
			
			if(temp.data == temp.next.data) {
				
				Node next= temp.next.next;
				temp.next = next;
				removeDuplicate(temp);
			}else {
				removeDuplicate(temp.next);
			}
		}
	}
	
	
	Node head= null;
	public static void main(String args[]) {
		
		RemoveDuplicateELementFromSList list = new RemoveDuplicateELementFromSList();
		list.head = new Node(2);
		list.head.next = new Node(2);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(3);
		list.head.next.next.next.next = new Node(3);
		list.head.next.next.next.next.next= new Node(4);
		
		list.display();
		System.out.println();
		list.removeDuplicate(list.head);
		list.display();
	}
}
