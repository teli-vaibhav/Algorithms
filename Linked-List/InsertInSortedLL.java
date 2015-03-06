/*
	 * Given a sorted LL, we must insert a given node
	 * in a sorted manner.
	 * The solution has O(n) time complexity and O(1)
	 * space complexity.
	 */
	public static Node insertInSortedLL(Node head, int newElement)
	{
		if(head==null)
		{
			head=new Node(newElement);
			return head;
		}
		
		Node current=head;
		
		if(current.element>newElement)
		{
			head= new Node(newElement);
			head.next=current;
			return head;
		}
		
		Node prev= head;
		current=head.next;
		
		while(true)
		{
			if(prev.element<newElement)
			{
				if((current==null) || (current.element>newElement))
				{
					prev.next=new Node(newElement);
					prev.next.next=current;
					return head;
				}
			}
			prev=current;
			current=current.next;
		}
	}
