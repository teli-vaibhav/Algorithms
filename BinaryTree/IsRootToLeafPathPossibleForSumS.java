  /*
	 * Given a BT and a sum 's'. We are to find if a path from root
	 * to leaf is possible that sums to s.
	 * Solution is O(n) time and O(n) space.
	 */
	public boolean isSumPathToLeafPossible(TreeNode root, int s)
	{
		if(root==null)
			return false;
		
		if((root.left==null && root.right==null) && root.element==s)
			return true;
		
		return isSumPathToLeafPossible(root.left,s-root.element) || isSumPathToLeafPossible(root.right,s-root.element);
	}
