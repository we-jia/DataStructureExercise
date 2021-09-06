package tree;

public class TestBinarySearchTree {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.add(1);
		tree.add(5);
		tree.add(2);
		tree.add(3);
		tree.add(7);
		tree.add(9);
		tree.printSortedResult();
		
		System.out.println("-----");
		tree.delete(3);
		tree.printSortedResult();
	}
}
