/*
	 * Given a sorted array with no duplicates, we are
	 * to find the index of a given element.
	 * This is an Iterative approach having O(log n) Time Complexity
	 * and O(1) Space Complexity unlike the Recursive approach where the
	 * stack occupied O(log n) space.
	 * I would prefer the Iterative approach over the Recursive for any kind 
	 * of a Binary Search type question
	 */
	public int getElementIndexIteractive(int[] a, int k)
	{
		
		if(a==null)
			return Integer.MIN_VALUE; // return negative infinity
		
		int l=0;
		int r=a.length-1;
		int m;
		
		while(l<=r)
		{
			m= (r-l)/2+l; //helps avoiding integer overflow which could occur for large int values, could occur by writing (l+r)/2
			
			if(a[m]==k)
				return m;
			
			if(k<a[m])
				r=m-1;
			else
				l=m+1;
		}
		return Integer.MIN_VALUE; //when length of array is 0 & when k is not in the array
	}
