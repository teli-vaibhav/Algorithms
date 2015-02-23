/*
	 * Given the head of a CircularLL. We must reverse the same and
	 * return the new head.
	 * The solution below has O(n) time complexity and O(1) space complexity
	 */
	public static DoubleNode reverseCircularLL(DoubleNode head)
	{
		if(head==null || head.next==head)
			return head;
		
		DoubleNode current=head.prev;
		head=head.prev;
		DoubleNode temp = current.prev;
		
		do
		{
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.next;
		}
		while(current!=head);
		
		return head;	
	}
