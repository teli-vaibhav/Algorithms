/*
	 * Find the middle element in a LL given the head.
	 * The solution has O(n) time complexity and O(1) space complexity.
	 * If the number of elements are odd we return the middle element,
	 * if even we return the middle element to the right.
	 */
	public static Node getMiddleOfLL(Node head)
	{
		if(head==null || head.next==null)
			return null;
		
		Node fast=head;
		Node slow=head;
		
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		
		return slow;
	}
