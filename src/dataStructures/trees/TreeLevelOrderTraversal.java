package dataStructures.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeLevelOrderTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void LevelOrder(Node root) {
		Queue<Node> queue = new ArrayDeque<Node>();
		if (root != null) {
			queue.offer(root);
		}

		while (queue.peek() != null) {
			Node temp = queue.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}
		}

	}
}
