package linkedList;

public class BasicTest {

	public static void main(String args[]) {
		
		CustomSinglyLinkedList list = new CustomSinglyLinkedList();
		list.addLast(5);
		list.addLast(6);
		list.addLast(7);
		

		list.addAfter(1, 9);
		
		list.display();
		
		list.reverseLinkedList();
		
		list.display();
	}
}
 