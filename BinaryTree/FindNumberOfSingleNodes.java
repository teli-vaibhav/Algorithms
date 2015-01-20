  /*
	 * Given a BT. We are to find the number of single nodes
	 * i.e nodes which have only one of left or right subtrees.
	 * The solution has O(n) time complexity and O(n) space
	 * complexity.
	 */
	public int getNumberOfSingleNodes(TreeNode root)
	{
		if(root==null)
			return 0;
		
		int count=0;
		
		if((root.left!=null && root.right==null) || (root.left==null &&root.right!=null))
			count=1;
		
		return count + getNumberOfSingleNodes(root.left)+getNumberOfSingleNodes(root.right);
	}
