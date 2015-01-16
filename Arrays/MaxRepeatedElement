  /*
	 * Given an array of size n. Elements of the array
	 * range from 1 to n-1. Find the maximum repeated element.
	 * The solution has a Time complexity of O(n) and Space
	 * Complexity of O(n)
	 */
	public int getMaxRepeatedElement(int[] a)
	{
		if(a==null || a.length==0)
			return Integer.MAX_VALUE;
		
		int[] res = new int[a.length-1];
		
		for(int i=0;i<a.length;i++)
		{
			res[a[i]-1]=res[a[i]-1]+1;
		}
		
		int max= 0;
		int maxIndex=0;
		
		for(int i=0;i<res.length;i++)
		{
			if(res[i]>max)
			{
				max=res[i];
				maxIndex=i;
			}
		}
		
		return maxIndex+1;
		
	}
