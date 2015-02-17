/*
	 * We are given a node in a LL which we are supposed to delete.
	 * The solution has O(1) time complexity and O(1) space complexity.
	 */
	public static boolean deleteGivenNode(Node givenNode)
	{
		if(givenNode==null) //when given node is null there is nothing to delete
			return false;
		
		if(givenNode.next==null) //when given node is the last node, we simply assign an impossible(-infinity) value to the node, but wouldn't be possible to delete.
		{
			givenNode.element=Integer.MIN_VALUE;
			return false;
		}
			
		givenNode.element=givenNode.next.element;
		givenNode.next=givenNode.next.next;
		return true;	
	}
