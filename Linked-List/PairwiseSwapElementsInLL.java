/*
	 * Given the head of a LL. We are to pairwise swap the elements of the
	 * List.
	 * The solution below has O(n) time complexity and
	 * O(1) space complexity.
	 */
	public static void pairWiseSwap(Node head)
	{
		if(head==null)
			return;
		
		Node current=head;
		if(head.next!=null)
			head=head.next;
		Node temp;
		Node prev=null;
		
		while(current!=null && current.next!=null)
		{
			temp=current.next;
			current.next=current.next.next;
			temp.next= current;
			current=temp;
			if(prev!=null)
				prev.next=current;
			
			prev=current.next;
			current=current.next.next;
		}
	}
