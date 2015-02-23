/*
	 * Given the head of an unsorted LL. We are to remove duplicates
	 * from this list.
	 * The solution has O(n) time complexity and O(n) space complexity.
	 * A brute force solution could also be used here but would have
	 * a time complexity of O(n^2) in constant space so am avoiding it here.
	 */
	public static void removeDuplicatesFromAnUnsortedLL(Node head)
	{
		if(head==null || head.next==null)
			return;
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(head.element);
		Node prev=head;
		Node current=head.next;
		
		while(current!=null)
		{
			if(s.contains(current.element))
			{
				System.out.println("here");
				prev.next=current.next;
				current=current.next;
			}
			else
			{
				s.add(current.element);
				prev=current;
			    current=current.next;
			}
		}
	}
