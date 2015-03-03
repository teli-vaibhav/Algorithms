/*
	 * Given the head of 2LL. We must find the point of intersection
	 * of both of them. The solution below has O(n) time complexity
	 * and O(1) space complexity.
	 * n would happen to be the length of the longer list.
	 */
	public static Node getIntersectionOf2LL(Node head1, Node head2)
	{
		if(head1==null || head2==null)
			return null;
		
		Node current1=head1;
		Node current2=head2;
		
		while(current1!=null && current2!=null)
		{
			current1=current1.next;
			current2=current2.next;
		}
		
		Node smallerList = (current1==null)?head1:head2;
		Node longerList = (current1==null)?current2:current1;
		Node newPointer = (current1==null)?head2:head1;
		
		while(longerList!=null)
		{
			newPointer=newPointer.next;
			longerList=longerList.next;
		}
		
		while(smallerList!=null && newPointer!=null)
		{
			if(smallerList==newPointer)
				return newPointer;
			
			smallerList=smallerList.next;
			newPointer=newPointer.next;
		}
		
		return null;
		
	}
