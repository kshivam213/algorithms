package linkedList;

public class BasicDoublyTest {
	
	public static void main(String args[]) {
		
		CustomDoublyLinkedList doublyTest = new CustomDoublyLinkedList();
		
		doublyTest.add(3);
		doublyTest.add(4);
		doublyTest.add(5);
		doublyTest.add(6);
		
		doublyTest.displayReverse();
	}
}
