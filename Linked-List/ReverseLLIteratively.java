/*
	 * Given a LL which we need to reverse without recursion.
	 * The solution has O(n) time complexity and O(1) space complexity.
	 */
	public static Node reverseLLIterative(Node head)
	{
		if(head==null)
			return null;
		
		Node prev=head;
		Node next=prev.next;
		Node temp;
		
		while(next!=null)
		{
			temp=next.next;
			next.next=prev;
			prev=next;
			next=temp;
		}
		
		head=prev;
		return head;
	}
