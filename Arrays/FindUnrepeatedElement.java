  /*
	 * Given an array of integers and the fact that
	 * each of its elements is repeated once except
	 * one of them. We are to find that element.
	 * Below is a O(n) solution with O(1) space.
	 */
	public int getUnrepeatedElement(int[] a)
	{
		if(a==null)
			return Integer.MIN_VALUE;
		
		int res=0;
		
		for(int i=0;i<a.length;i++)
		{
			res^=a[i];
		}
		
		return res;
	}
