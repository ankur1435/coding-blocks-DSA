package Lec34;

public class insert_into_a_binary_search_tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode insertIntoBST(TreeNode root, int val) {
			if (root == null) {
				TreeNode newNode = new TreeNode(val);
				return newNode;
				// we can not return root here because root is null at this current time
				// If we didn't return the new node at root == null, the function would exit
				// without making any changes, and the tree would remain:
			}
			if (root.val > val) {
				root.left = insertIntoBST(root.left, val);
			} else {
				root.right = insertIntoBST(root.right, val);
			}
			return root;

		}
	}

}
