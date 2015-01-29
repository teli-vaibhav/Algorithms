  /*
	 * Given the root of a BT. We must print the
	 * Inorder of this tree.
	 * The solution is O(n) time and O(n) space
	 * solution
	 */
	public void printInorder(TreeNode root)
	{
		if(root==null)
			return;
		
		printInorder(root.left);
		System.out.print(root.element +" ");
		printInorder(root.right);
	}
