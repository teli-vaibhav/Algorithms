/*
	 * Given the head of a LL, we are to figure out if this LL is looped.
	 * We are allowed to use additional space.
	 * The solution below is has O(n) time complexity and O(n) space complexity.
	 */
	public static boolean isLLLoopedUsingSpace(Node head)
	{
		if(head==null)
			return false;
		
		Node current=head;
		Set<Node> hs=new HashSet<Node>();
		
		while(current!=null)
		{
			if(!hs.add(current))
				return true;
			
			current=current.next;
		}
		
		return false;
	}
