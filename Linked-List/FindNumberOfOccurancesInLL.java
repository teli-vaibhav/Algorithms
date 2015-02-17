/*
	 * Given the head of a linked list and a node value. We are to find the
	 * number of times this given value is present in the list.
	 * The solution below has O(n) time complexity and O(1) space complexity.
	 */
	public static int getCountOfElement(Node head,int givenNode)
	{
		if(head==null)
			return 0;
		Node current=head;
		int count=0;
		
		while(current!=null)
		{
			if(current.element==givenNode)
				count++;
			current=current.next;
		}
		
		return count;
	}
