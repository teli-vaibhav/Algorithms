	/*
	 * Given the root of a BT. We must print the
	 * Inorder of this tree without recursion.
	 * The solution is O(n) time and O(n) space
	 * solution
	 */
	public void printInorderIterative(TreeNode root)
	{
		
		if(root==null)
			return;
		
		Stack<TreeNode> s= new Stack<TreeNode>();
		
		TreeNode current= root;
		
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
				System.out.print(current.element + " ");
				current=current.right;
			}
		}
	}
