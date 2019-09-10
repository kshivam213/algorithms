package tree;

public class TestBST {

	public static void main(String args[]) {
		
		CustomBinarySearch bSearch= new CustomBinarySearch();
		bSearch.insert(1);
		bSearch.insert(2);
		bSearch.insert(5);
		bSearch.insert(4);
		bSearch.insert(8);
		bSearch.insert(6);
		
		bSearch.printInorder();
	}
	
}
