/*
	 * Given the head of a LL, we are supposed to delete the list.
	 * I suppose these kind of problems fly more in languages like C
	 * or C++ where memory management is more upto the developer.
	 * However, I am assuming that I am expected not to leave any reference to
	 * any node in the list and developing the same in java.
	 * The solution has O(n) time complexity and O(1) space complexity.
	 */
	public static void freeLinkedList(Node head)
	{
		if(head==null)
			return;
		
		Node current=head;
		Node temp=current.next;
		
		while(temp!=null)
		{
			current.next=null;
			current=temp;
			temp=temp.next;
		}
		
		head=null;
	}
