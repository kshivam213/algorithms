package tree;

public class TestTree {

	
	public static void main(String args[]) {
		
		CustomBinaryTree tree = new CustomBinaryTree();
		
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		tree.insert(8); 
		tree.insert(9); 
		tree.insert(10); 
		tree.insert(11);
		 
		tree.insert(12);
		
		tree.verticalTraversal();
	}
}
