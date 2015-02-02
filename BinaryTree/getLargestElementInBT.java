  /*
	 * Given the root of a BT. We must find the
	 * Max node value in the BT using recursion.
	 * The solution is O(n) time and O(n) space
	 */
	public int getMaxValueInBT(TreeNode root)
	{	
		int[] maxValue = new int[1];
		
		return getMaxValueInBTAux(root,maxValue);
	}
	
	
	private int getMaxValueInBTAux(TreeNode root, int[] maxValue) {
		if(root==null)
			return Integer.MIN_VALUE;
		
		getMaxValueInBTAux(root.left,maxValue);
		
		maxValue[0]=Math.max(maxValue[0], root.element);
		
		getMaxValueInBTAux(root.right,maxValue);
		
		return maxValue[0];
	}
