  /*
	 * Given the root of a BT. We must print the
	 * PostOrder of this tree.
	 * The solution is O(n) time and O(n) space
	 * solution
	 */
	public void printPostOrderOfBTRecursive(TreeNode root)
	{
		if(root==null)
			return;
		
		printPostOrderOfBTRecursive(root.left);
		printPostOrderOfBTRecursive(root.right);
		System.out.print(root.element +" ");
		
	}
