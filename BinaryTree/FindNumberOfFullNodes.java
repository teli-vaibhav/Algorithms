  /*
	 * Given a BT. We are to find the number of full nodes
	 * i.e nodes which have both left and right subtrees.
	 * The solution has O(n) time complexity and O(n) space
	 * complexity.
	 */
	public int getNumberOfFullNodes(TreeNode root)
	{
		if(root==null)
			return 0;
		
		int count=0;
		
		if(root.left!=null && root.right!=null)
			count=1;
		
		return count + getNumberOfFullNodes(root.left) + getNumberOfFullNodes(root.right);
	}
