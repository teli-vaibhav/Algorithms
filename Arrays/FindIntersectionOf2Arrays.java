  /*
	 * Given 2 sorted arrays, we are to find
	 * the intersection of the two.
	 * Below solution has O(m+n) Time Complexity
	 * and O(1) space complexity.
	 */
	public int[] getIntersectionOf2Arrays(int[] a,int[] b)
	{
		if(a==null || b==null)
			return null;
		
		int resArraySize = (a.length>b.length)? b.length:a.length;
		int[] res = new int[resArraySize];
		for(int i=0;i<res.length;i++)
		{
			res[i]= Integer.MAX_VALUE;//initialize all values to infinity
		}
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]==b[j])
			{
				res[k++]=a[i++];
				j++;
			}
			else if(a[i]<b[j])
				i++;
			else
				j++;
		}
		
		return res;
	}
