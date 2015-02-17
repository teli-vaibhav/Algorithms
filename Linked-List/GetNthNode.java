/*
	 * Given a LL, we are to find the Nth node from the list.
	 * The time complexity is O(n) and space complexity is O(1)
	 */
	public static Node getNthNodeInLL(Node head,int n)
	{
		if(head==null)
			return null;
		
		int count=n;
		Node current=head;
		
		while(current!=null && count>1)
		{
			current=current.next;
			count--;
		}
		
		return current;
	}
