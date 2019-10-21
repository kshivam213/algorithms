package binarySearchTree;

public class CustomBinarySearch {

	class Node{
		
		int data;
		Node left, right;
		
		Node(int item){
			this.data = item;
			left = right = null;
		}
	}
	
	Node root;
	
	public CustomBinarySearch() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	void insert(int key) {
		root = insertRec(root, key);
	}
	
	Node insertRec(Node root, int key) {
		
		if(root == null) {
			root = new Node(key);
		}
		
		if(key < root.data) {
			root.left = insertRec(root.left, key);
		}else if(key > root.data) {
			root.right = insertRec(root.right, key);
		}
		
		return root;
	}
	
	void printInorder() {
		System.out.println();
		this.inorder(root);
	}
	
	void inorder(Node root) {
		
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
}
