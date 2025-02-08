package Lec34;

import java.util.*;

public class Create_Tree_Using_Level_Order {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Create_Tree_Using_Level_Order() {
		// TODO Auto-generated constructor stub
		Create_Tree();
	}

	private void Create_Tree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			// remove
			Node n = q.poll();
			int l = sc.nextInt();
			int r = sc.nextInt();

			// add child
			if (l != -1) { // if l is not -1, it means the current node (n) does have a left
				Node node = new Node();
				node.val = l;
				n.left = node;
				q.add(node);

			}
			if (r != -1) {
				Node node = new Node();
				node.val = r;
				n.right = node;
				q.add(node);
			}
		}

	}

	// In Java, Queue is an interface, not a concrete class. An interface defines a
	// contract, but it doesn't provide a specific implementation. So, you can't
	// directly create an instance of Queue. Instead, you need to use a concrete
	// class that implements the Queue interface
}
