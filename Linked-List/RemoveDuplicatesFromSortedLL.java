/*
	 * Given the head of a LL, we are to remove duplicates from the same
	 * The solution has O(n) time complexity and O(1) space complexity
	 */
	public static void removeDuplicatesFromSortedLL(Node head)
	{
		if(head==null || head.next==null)
			return;
		
		Node prev=head;
		Node current=head.next;
		
		while(current!=null)
		{
			if(prev.element==current.element)
			{
				prev.next=current.next;
				current=current.next;
			}
				
			else
			{
				prev=current;
				current=current.next;
			}
		}
	}
