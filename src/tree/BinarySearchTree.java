package tree;

public class BinarySearchTree {
	public TreeNode root;

	public void add(int value) {
		this.root = addRecursive(this.root, value);
	}

	private TreeNode addRecursive(TreeNode node, int value) {
		if (node == null) {
			return new TreeNode(value);
		}

		if (value < node.value) {
			node.leftNode = addRecursive(node.leftNode, value);
		} else if (value > node.value) {
			node.rightNode = addRecursive(node.rightNode, value);
		} else {
			return node;
		}

		return node;
	}

	public boolean contains(int value) {
		return containsRecursive(this.root, value) != null;
	}

	private TreeNode containsRecursive(TreeNode node, int value) {
		if (node == null) {
			return null;
		}

		if (value < node.value) {
			return containsRecursive(node.leftNode, value);
		} else if (value > node.value) {
			return containsRecursive(node.rightNode, value);
		} else {
			return node;
		}
	}
}
