  /*
	 * Given a the root of a BT and a Node of the tree
	 * We must find the inorder successor of the given node.
	 * The solution has a time complexity of O(n) and
	 * a space complexity of O(n)
	 */
	public TreeNode getInorderSuccessor(TreeNode root,TreeNode p)
	{
		if(root==null)
			return null;
		
		Stack<TreeNode> s= new Stack<TreeNode>();
		TreeNode current=root;
		boolean isReady=false;
		
		while(!s.isEmpty() || current!=null)
		{
			while(current!=null)
			{
				s.push(current);
				current=current.left;
			}
			
			if(!s.isEmpty())
			{
				current=s.pop();
				
				if(isReady)
					return current;
				
				if(current==p)
					isReady=true;
				
				current=current.right;
			}
		}
		
		return null;
	}
