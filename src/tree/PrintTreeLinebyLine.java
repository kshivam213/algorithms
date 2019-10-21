package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Print Tree line by line using level order traversal
 * 
 * @author shivamkumar
 */

public class PrintTreeLinebyLine {

	Node root = null;
	void insert(int key) {

		if (root == null) {
			root = new Node(key);
		} else {
			insertUsingLevelOrder(root, key);
		}
	}

	void insertUsingLevelOrder(Node temp, int key)
	{
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			temp = q.peek(); 
            q.remove(); 
  
			if(temp.left == null) {
				temp.left = new Node(key);
				temp.left.hd = temp.hd -1;
				break;
			}else {
				q.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node(key);
				temp.right.hd = temp.right.hd +1;
				break;
			}else {
				q.add(temp.right);
			}
		}
	 }
	
	 void levelOrderTraversalLineByLine() {
		 
		 Queue<Node> q = new LinkedList<>();
		 q.add(root);
		 
		 while(!q.isEmpty()) {
			 
			 int size = q.size();
			 
			 for(int i=0;i<size;i++) {
				 
				 Node curr= q.poll();
				 System.out.print(curr.data);
				 if(curr.left != null)
					 q.add(curr.left);
				 if(curr.right != null)
					 q.add(curr.right);
			 }
			 
			 System.out.println();
		 }
	 }
	
	public static void main(String args[]) {
		
		PrintTreeLinebyLine pLineByLine = new PrintTreeLinebyLine();
		pLineByLine.insert(2);
		pLineByLine.insert(3);
		pLineByLine.insert(4);
		pLineByLine.insert(5);
		pLineByLine.insert(6);
		pLineByLine.insert(7);
		pLineByLine.insert(8); 
		pLineByLine.insert(9); 
		pLineByLine.insert(10); 
		pLineByLine.insert(11);
		pLineByLine.insert(12);
		
		pLineByLine.levelOrderTraversalLineByLine();
	}
}
