	/*
	 * Given the root of a BT. We must print the
	 * Preorder of this tree.
	 * The solution is O(n) time and O(n) space
	 * solution
	 */
	public void printPreOrderOfBTRecursive(TreeNode root)
	{
		if(root==null)
			return;
		
		System.out.print(root.element +" ");
		printPreOrderOfBTRecursive(root.left);
		printPreOrderOfBTRecursive(root.right);
	}
