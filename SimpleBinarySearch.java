        /*
	 * Given a sorted array with non duplicate elements
	 * we are to search for a given element in the array
	 * This is a recursive solution having Time Complexity 
	 * of O(log n) & Space Complexity O(log n) if we consider
	 * the space taken by the recursive stack.
	 */
	public int getElementIndex(int[] a, int k)
	{
		/*
		 * It is essential to have a null check here and not in the Aux method
		 * as a.length which is being passes would return a null pointer in this method.
		 */
		if(a==null)
			return Integer.MIN_VALUE; //returns negative infinity
		
		return getElementIndexAux(a,k,0,a.length-1);
	}
        /*
	 * This method helps us in hiding the implementation from the outside world
	 * one form of abstaction
	 */
	private int getElementIndexAux(int[] a, int k, int firstIndex, int lastIndex) {
		
		/*
		 * This covers base cases like for k values less than first value &
		 * k values greater than last value. 
		 * Also covers a non null empty empty array of length 0 scenario
		 */
		if(lastIndex<firstIndex)
			return Integer.MIN_VALUE;
		
		/*
		 * It is actually (l+r)/2, but in java first the addition takes place
		 * followed by the division by 2. For very large values of l & r, it may
		 * got out of limits of a permissible integer value.
		 * This was an error for years in the java library, which was later corrected.
		 */
		int middleIndex = (lastIndex-firstIndex)/2 + firstIndex;
	    
		if(a[middleIndex] == k)
			return middleIndex;
		
		if(k<a[middleIndex])
			return getElementIndexAux(a,k,firstIndex, middleIndex-1);
		
		else
			return getElementIndexAux(a,k,middleIndex+1, lastIndex);
		
	}

