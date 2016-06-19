package dataStructures.trees;

public class BinarySearchTreeLowestCommonAncestor {

	class Node {
		int data;
		Node left;
		Node right;
	}

	static Node lca(Node root, int v1, int v2) {
		if (root == null || root.data == v1 || root.data == v2) {
			return root;
		}
		Node left = lca(root.left, v1, v2);
		Node right = lca(root.right, v1, v2);
		if (left == null) {
			return right;
		} else if (right == null) {
			return left;
		}
		return root;

	}
}
