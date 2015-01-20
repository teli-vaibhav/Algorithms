  /*
	 * Given a BT. We are to find the sum of all elements
	 * of this BT.
	 * This is a O(n) time solution and O(n) space
	 */
	public int getSumOfAllNodesInBT(TreeNode root)
	{
		if(root==null)
			return 0;
		
		int ls = getSumOfAllNodesInBT(root.left);
		int rs = getSumOfAllNodesInBT(root.right);
		
		return root.element+ls+rs;
	}
