  /*
	 * Given a sorted array with duplicates. We are to find
	 * the lowest index of an element's occurrence in the array.
	 * The solution is an iterative one with Time Complexity O(log n)
	 * and Space Complexity of O(1).
	 */
	public int getLowestIndexBinarySearch(int[] a, int k)
	{
		if(a==null)
			return Integer.MIN_VALUE; // returns negative infinity
		
		int l=0;
		int r=a.length-1;
		int m;
		
		while(l<=r)
		{
			m=(r-l)/2+l;
			
			if(a[m]==k) //condition is a bit tricky here, could easily run into negative index exceptions if not careful
			{
				if(m==0 || a[m-1]!=k)
				   return m;
			}
			
			if(k>a[m])
				l=m+1;
			else
				r=m-1;	
		}
		
		return Integer.MIN_VALUE;
	}
	/*
	 * I've seen several solutions that use Simple Binary Search to get
	 * the index of any random occurrence of the element after which they 
	 * iterate the array in the backward direction. Such a solution would
	 * asymptotically be a O(n) solution and not O(log n). Think of an array where the entire
	 * array is filled by the same number we are searching, that would be our worst case.
	 */
