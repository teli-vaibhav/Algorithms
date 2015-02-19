/*
	 * Given the head of a LL. We are to move the last element to
	 * the first.
	 * The solution below ha O(n) time complexity and O(1) space complexity.
	 */
	public static Node moveLastElementToHead(Node head)
	{
		if(head==null || head.next==null)
			return head;
		
		Node current=head;
		
		while(current.next.next!=null)
			current=current.next;
		
		current.next.next=head;
		head=current.next;
		current.next=null;
		
		return head;
	}
