/*
	 * Given the head of a DoublyLL we are to reverse this list
	 * recursively and return the head of the new list
	 * The solution has O(n) time complexity and O(n) space complexity
	 */
	public static DoubleNode reverseDoubleLLRecursive(DoubleNode head)
	{
		if(head==null || head.next==null)
			return head;
		
		DoubleNode current = head;
		DoubleNode temp;
		
		DoubleNode r= reverseDoubleLLRecursive(current.next);
		temp=current.next.next;
		current.next.next=current;
		current.next.prev=temp;
		current.next=null;
		
		return r;
	}
