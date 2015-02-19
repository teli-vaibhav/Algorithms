/*
	 * Given the head of a LL. We must reverse this recursively and
	 * return the new Node of the reversed list.
	 * The solution below has O(n) time complexity and O(n) space complexity.
	 */
	public static Node reverseListRecursive(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		
		Node current=head;
		Node rest=head.next;
		
		Node r = reverseListRecursive(rest);

		current.next.next=current;
		current.next=null;
		return r;
	}
	
