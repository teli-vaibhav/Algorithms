  /*
	 * Given a bitonic array in which there is an increasing
	 * sequence of ints followed by a decreasing sequence. We 
	 * are to find the largest value in such an array. The solution
	 * has O(log n) Time Complexity & O(1) Space Complexity.
	 */
	public int getMaxValueInBitonicArray(int[] a)
	{
		if(a==null)
			return Integer.MIN_VALUE;//returns negative infinity
		
		int l=0;
		int r=a.length-1;
		int m;
		
		while(l<=r)
		{
			m=(r-l)/2+l;
			
			/*
			 * This condition is super tricky, all base cases must be covered.
			 */
			if((m==0 && m==a.length-1) || (m==0 && a[m]>a[m+1]) || (m==a.length-1 && a[m-1]<a[m]) || (a[m]>a[m-1] && a[m]>a[m+1]))
			  return a[m];
			
			if(a[m]<a[m+1])
				l=m+1;
			else
				r=m-1;
		}
		
		return Integer.MIN_VALUE;
	}
