/*
	 * Given the head of a LL we are to pairwise swap the elements in the list
	 * and return the new head of the resultant list
	 * The solution below has O(n) time complexity and O(n) space complexity
	 */
	public static Node pairWiseSwapRecursive(Node head)
	{
		if(head==null || head.next==null)
			return head;
		
		Node current=head;
		Node temp;
		
	    Node p= pairWiseSwapRecursive(current.next.next);
	    
	    temp=current.next;
	    current.next.next=current;
	    current.next=p;
	    return temp;
	    	
	}
