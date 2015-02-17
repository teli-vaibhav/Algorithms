/*
	 * Given the head of a LL and n. We are to find the Nth node
	 * in the list from the end.
	 * The solution has O(n) time complexity and O(1) space complexity
	 */
	public static Node getNthNodeFromEndOfLL(Node head,int n)
	{
		if(head==null ||n<1)
			return null;
		
		int count=n;
		Node ahead=head;
		
		while(ahead!=null && count>1)
		{
			ahead=ahead.next;
			count--;
		}
		
		if(count!=1)
			return null;
		
		Node behind=head;
		
		while(ahead!=null && ahead.next!=null)
		{
			behind=behind.next;
			ahead=ahead.next;
		}
		
		return behind;
	}
