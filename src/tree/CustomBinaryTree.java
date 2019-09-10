package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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

public class CustomBinaryTree {

	Node root;
	List<Integer> path1= new LinkedList<Integer>();
	List<Integer> path2= new LinkedList<Integer>();
	
	CustomBinaryTree(){
		root = null;
	}
	
	void inorder(Node root) {
		
		if(root == null) {
			return;
		}
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		
	}
	
	void preorder(Node root) {
		if(root == null) {
			return;
		}
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		
	}
	
	void postorder(Node root) {
		
		if(root == null) {
			return;
		}
			postorder(root.left);
			postorder(root.right);
		    System.out.print(root.data+" ");
		
	}
	
	void levelOrderTraversal(Node root) {
		
		Queue<Node> queue = new LinkedList<Node>(); 
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Node temp = queue.poll();
			System.out.print(temp.data);
			if(temp.left != null) {
				queue.add(temp.left);
			}
			
			if(temp.right != null) {
				queue.add(temp.right);
			}
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
	
	void deletion(int key) {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		Node temp= null;
		Node key_node= null;
		while(!queue.isEmpty()) {
		
			temp = queue.peek();
			queue.remove();
			
			if(temp.data == key) {
				key_node = temp;
			}
			
			if(temp.left != null) {
				queue.add(temp.left);
			}
			
			if(temp.right != null) {
				queue.add(temp.right);
			}	
		}
		
		int x = temp.data;
		deleteDeepest(root, temp);
		key_node.data = x;
	}
	
	private void deleteDeepest(Node root2, Node temp) {
		 
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node tmp = q.peek();
			q.remove();
		
			if(tmp.left != null) {
				if(tmp.left == temp) {
					tmp.left = null;
					temp = null;
					return;
				}else {
					q.add(tmp.left);
				}
			}
			
			if(tmp.right != null) {
				if(tmp.right == temp) {
					tmp.right = null;
					temp = null;
					return;
				}else {
					q.add(tmp.right);
				}
			}	
		}
	}

	void insert(int key) {
		
		if(root == null) {
			root = new Node(key);
		}else {
			insertUsingLevelOrder(root, key);
		}
	}
	
	void printInorder() {
		System.out.println();
		this.inorder(root);
	}
	void printPostorder() {
		System.out.println();
		this.postorder(root);
	}
	void printPreorder() {
		System.out.println();
		this.preorder(root);
	}
	
	
	boolean findPath(Node root, int nodeV, List<Integer> path) {
		
		if(root == null) {
			return false;
		}
		
		path.add(root.data);
		
		if(root.data == nodeV) {
			return true;
		}
		
		
		if(root.left != null && findPath(root.left, nodeV, path)) {
			return true;
		}
		
		if(root.right != null && findPath(root.right, nodeV, path)) {
			return true;
		}
		
		path.remove(path.size() -1);
		return false;
	}
	
	int findLowestCommonAncestor(int n1, int n2) {
		
		if(!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
			System.out.println((path1.size() >0) ? "N1 is present" : "N1 is not present");
			System.out.println((path2.size() >0) ? "N2 is present" : "N2 is not present");
		}
		
		int i=0;
		for(i=0;i<path1.size() && i< path2.size(); i++) {
			if(!(path1.get(i) == path2.get(i))) {
				break;
			}
		}
		
		return path1.get(i-1);
	}
	
	int height(Node root) {
		
		if(root == null)
			return 0;
		
		return 1+Integer.max(height(root.left), height(root.right));
	}
	
	int diameter(Node root) {
		
		if(root == null)
			return 0;
		
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		int lDiameter = diameter(root.left);
		int rDiameter= diameter(root.right);
		
		return Integer.max(lHeight+rHeight+1, Integer.max(lDiameter, rDiameter));
	}
	
	void printLeftView(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			
			Node temp = q.peek();
			
			if(temp != null) {
				System.out.println(temp.data);
				
				while(q.peek() != null) {
					
					if(temp.left != null) {
						q.add(temp.left);
					}
					
					if(temp.right != null) {
						q.add(temp.right);
					}
					
					q.remove();
					
					temp = q.peek();
				}
				
				q.add(null);
			}
			
			q.remove();
		}
	}
	
	void LeftView() {
		printLeftView(root);
	}
	
	void rightView() {
		printRightView(root);
	}
	
	void printRightView(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			
			Node temp = q.peek();
			
			if(temp != null) {
				
				while(q.peek() != null) {
					
					if(temp.left != null) {
						q.add(temp.left);
					}
					
					if(temp.right != null) {
						q.add(temp.right);
					}
					
					q.remove();
					
					if(q.peek() == null) {
						System.out.print(temp.data);
					}
					temp = q.peek();
				}
				
				q.add(null);
			}
			
			q.remove();
		}
		
	}
	
	void verticalTraversal() {
		printVerticalTraversal(root);
	}
	
	
	private void printVerticalTraversal(Node root2) {
		
		Map<Integer, List<Node>> verticalMap = new TreeMap<Integer, List<Node>>();
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root2);
		
		List<Node> initialList = new ArrayList<Node>();
		initialList.add(root2);
		
		verticalMap.put(root2.hd, initialList);
		
		while(!q.isEmpty()) {
			
			Node tmp = q.peek();
			q.remove();
			if(tmp.left != null) {
				
				int hd = tmp.hd;
				
				List<Node> leftMap = verticalMap.get(hd-1);
				if(leftMap == null) {
					leftMap = new ArrayList<Node>();
				}
				leftMap.add(tmp.left);
				verticalMap.put(hd-1, leftMap);
				q.add(tmp.left);
			}
			if(tmp.right != null) {
				
				int hd = tmp.hd;
				
				List<Node> rightMap = verticalMap.get(hd+1);
				if(rightMap == null) {
					rightMap = new ArrayList<Node>();
				}
				rightMap.add(tmp.right);
				verticalMap.put(hd+1, rightMap);
				q.add(tmp.right);
			}
			
		}
		
		for(Integer key: verticalMap.keySet()) {
			List<Node> value = verticalMap.get(key);
			System.out.println();
			for(Node nd: value) {
				System.out.print(nd.data+" ");
			}
		}
	}

	
	void topView() {
		printTopView(root);
	}
	
	
	private void printTopView(Node root2) {
		
		Map<Integer, List<Node>> topViewMap = new TreeMap<Integer, List<Node>>();
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root2);
		
		List<Integer> levelTraversal = new ArrayList<Integer>();
		
		List<Node> initialList = new ArrayList<Node>();
		initialList.add(root2);
		
		topViewMap.put(root2.hd, initialList);
		
		while(!q.isEmpty()) {
			
			Node tmp = q.peek();
			levelTraversal.add(tmp.data);
			q.remove();
			if(tmp.left != null) {
				
				int hd = tmp.hd;
				
				List<Node> leftMap = topViewMap.get(hd-1);
				if(leftMap == null) {
					leftMap = new ArrayList<Node>();
				}
				leftMap.add(tmp.left);
				topViewMap.put(hd-1, leftMap);
				q.add(tmp.left);
			}
			if(tmp.right != null) {
				
				int hd = tmp.hd;
				
				List<Node> rightMap = topViewMap.get(hd+1);
				if(rightMap == null) {
					rightMap = new ArrayList<Node>();
				}
				rightMap.add(tmp.right);
				topViewMap.put(hd+1, rightMap);
				q.add(tmp.right);
			}
			
		}
		
		for(Integer key: topViewMap.keySet()) {
			List<Node> value = topViewMap.get(key);
			System.out.println();
			for(Node nd: value) {
				System.out.print(nd.data+" ");
			}
		}
	}
	
	
	int diameter() {
		return diameter(root);
	}
}