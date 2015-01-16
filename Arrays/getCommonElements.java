  /*
	 * Given two arrays of integers. We must find the common elements
	 * in both arrays using extra space is allowed.
	 * This solution has O(m+n) Time Complexity and O(m) Space
	 * Complexity where m<n
	 */
	public int getNumberOfCommonElements(int[] a, int[] b)
	{
		if(a==null || b==null)
			return 0;
		
		int[] smallerArray = (a.length<b.length)? a: b;
		int[] largerArray = (a.length>b.length)? a : b;
		int res=0;
		
		Map<Integer,Integer> h = new HashMap<Integer,Integer>();
		
		for(int m: smallerArray)
		{
			if(h.containsKey(m))
				h.put(m, h.get(m)+1);
			else
			  h.put(m, 1);
		}
		
		for(int n: largerArray)
		{
			if(h.containsKey(n))
			{
				
				if(h.get(n)==1)
					h.remove(n);
				else
					h.put(n, h.get(n)-1);
				
				res++;
			}
		}
		
		return res;
	}
