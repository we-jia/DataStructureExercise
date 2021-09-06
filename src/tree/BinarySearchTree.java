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

	// inorder-traversal
	public void printSortedResult() {
		inorderTraversal(root);
	}

	public void inorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		inorderTraversal(node.leftNode);
		System.out.println(node.value);
		inorderTraversal(node.rightNode);
	}

	public int successor(TreeNode node) {
		node = node.rightNode;
		while (node.leftNode != null) {
			node = node.leftNode;
		}
		return node.value;
	}

	public int predecessor(TreeNode node) {
		node = node.leftNode;
		while (node.rightNode != null) {
			node = node.rightNode;
		}
		return node.value;
	}

	public TreeNode delete(TreeNode node, int value) {
		if (node == null) {
			return null;
		}

		if (value > node.value) {
			node.rightNode = delete(node.rightNode, value);
		} else if (value < node.value) {
			node.leftNode = delete(node.leftNode, value);
		} else {
			if (node.leftNode == null && node.rightNode == null) {
				node = null;
			} else if (node.rightNode != null) {
				node.value = successor(node);
				node.rightNode = delete(node.rightNode, node.value);
			} else {
				node.value = predecessor(node);
				node.leftNode = delete(node.leftNode, node.value);
			}
		}

		return node;
	}

	public void delete(int value) {
		this.root = delete(this.root, value);
	}
}
