  /*
	 * We are given an array that contains 0s followed by some random
	 * set of integers. We are to find the number of 0s in this array.
	 * This is a solution with O(log n) time complexity and O(1) Space
	 * Complexity.
	 */
	public int getNumberOfZeros(int[] a)
	{
		if(a==null)
			return Integer.MIN_VALUE; //returns negative infinity
		
		int l=0;
		int r=a.length-1;
		int m;
		
		while(l<=r)
		{
			m=(r-l)/2+l;
			
			if(a[m]==0)
			{
				if(m==a.length-1 || a[m+1]!=0)//the first condition covers the case where entire array is full of 0s
					return m+1;//index+1 would be the number of 0s
			}
			
			if(a[m]==0)
				l=m+1;
			else
				r=m-1;
		}
		
		return Integer.MIN_VALUE;
	}
