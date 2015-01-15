  /*
	 * We are given an array of distinct integers and the condition
	 * a[0]>a[1] & a[n-2]<a[n-1]. Find the local minima.
	 * The solution has O(log n) time complexity & O(1) Space complexity.
	 */
	public int getLocalMinima(int[] a)
	{
		if(a==null)
			return Integer.MAX_VALUE;//return infinity
		
		int l=0;
		int r=a.length-1;
		int m;
		
		while(l<=r)
		{
			m=(r-l)/2+l;
			
			if(a[m]<a[m-1] && a[m]<a[m+1]) //we omit the boundary conditions here cause we are given the assumptions for the first and last element that need to be made.
				return a[m];
			
			if(a[m-1]<a[m])
				r=m-1;
			else
				l=m+1;
		}
		
		return Integer.MAX_VALUE; //It will never reach this point plz read the explanation below to understand why.
	}
	
	/*
	 * Why will an array of distinct elements give that a[0]>a[1] & a[n-2]<a[n-1]
	 * always have a local Minima?
	 * We will prove this by negation. Now assume that there is no local Minima.
	 * This means since a[0]>a[1], a[2] must be greater than a[1] else a[1] would be
	 * the local minima. Similarly a[3] must be greater than a[2]. This means that it would
	 * have to be a decreasing sequence but given that a[n-1]>a[n-2]. Which makes our
	 * assumption wrong. Hence there is a local minima always in an array of distinct
	 * integer with the given condition.
	 */
