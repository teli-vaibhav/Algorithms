/*
	 * Given the head of a LL, we are to figure out if this LL is looped.
	 * We are not allowed to use additional space.
	 * The solution below is has O(n) time complexity and O(1) space complexity.
	 */
	public static boolean isLinkedListLoopedWithoutSpace(Node head)
	{
		if(head==null || head.next==null)
			return false;
		
		Node slow=head.next;
		Node fast=head.next.next;
		
		while(fast!=null && fast.next!=null)
		{
			if(slow==fast)
				return true;
			
			fast=fast.next.next;
			slow=slow.next;
		}
		
		return false;
	}
