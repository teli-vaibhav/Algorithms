/*
	 * We are given the node of a Circular LL and we are to divide this list into
	 * two separate Circular LL.
	 * The solution below varies for both cases when the number of nodes in the
	 * initial list are odd or even. When the size of the list is even then the
	 * list can be equally divided. When the size is odd, then the second element will have 
	 * 1 more element compared to the first.
	 * The solution has O(n) Time complexity and O(1) space complexity.
	 */
	public static DoubleNode splitCircularLLIn2Halves(DoubleNode head)
	{
		if(head==null || head.next==head)
			return null;
		
		DoubleNode fast=head;
		DoubleNode slow=head;
		
		do
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		while(fast!=head && fast.next!=head);
		
		slow.prev.next=head;
		slow.prev=head.prev;
		head.prev.next=slow;
		
		return slow;
		
	}
