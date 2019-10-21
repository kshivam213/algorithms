package tree;

class Node{
		
		Node left;
		int data;
		int hd;
		Node right;
		
		Node(int data){
			this.data = data;
			left = right = null;
			hd =0;
		}
}
