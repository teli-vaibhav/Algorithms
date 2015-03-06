/*
	 * Given the head of a LL. We are to clone this LL.
	 * The solution has O(n) time complexity and O(n)
	 * space complexity.
	 */
	public static Node cloneLL(Node head)
	{
		if(head==null)
			return null;
		
		Node current=head.next;
		Node newHead= new Node(head.element);
		newHead.random=head;
		head.next=newHead;
		Node newPrev=newHead;
		Node newCurrent;
		
		while(current!=null)
		{
			newCurrent=new Node(current.element);
			newPrev.next=newCurrent;
			newCurrent.random=current;
			newPrev=newCurrent;
			current=current.next;
			newCurrent.random.next=newCurrent;
		}
		
		newCurrent=newHead;
		current=head;
		
		while(newCurrent!=null)
		{
			newCurrent.random=newCurrent.random.random.next;	
			newCurrent=newCurrent.next;
		}
		
		current=head;
		return newHead;
	}
