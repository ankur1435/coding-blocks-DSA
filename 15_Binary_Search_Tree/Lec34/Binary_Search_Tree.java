package Lec34;

public class Binary_Search_Tree {
	class Node {
		int val;
		Node left;
		Node right;

		// This is the constructor of Node
		public Node(int x) {
			this.val = x;
			left = null;
			right = null;
		}
	}

	private Node root;

	// this is the constructor of Binary_Search_Tree
	public Binary_Search_Tree(int[] in) {
		// TODO Auto-generated constructor stub
		root = Create_Tree(in, 0, in.length - 1);
	}

	private Node Create_Tree(int[] in, int si, int ei) {
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node(in[mid]);
		nn.left = Create_Tree(in, si, mid - 1);
		nn.right = Create_Tree(in, mid + 1, ei);
		return nn;
	}

	public void display() {
		display(root);
	}

	private void display(Node root) {
		if (root == null) {
			return;
		}
		String str = "";
		if (root.left != null && root.right != null) {
			System.out.println(root.left.val + " <- " + root.val + " -> " + root.right.val);
		} else if (root.left != null) {
			System.out.println(root.left.val + " <- " + root.val + " -> .");
		} else if (root.right != null) {
			System.out.println(". <- " + root.val + " -> " + root.right.val);
		} else {
			System.out.println(". <- " + root.val + " -> .");
		}

		display(root.left);
		display(root.right);
	}
}

// properties of binary search tree
// For any node:
// All values in its left subtree are less than the node's value.
// All values in its right subtree are greater than the node's value.
