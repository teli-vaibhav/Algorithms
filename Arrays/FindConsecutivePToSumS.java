  /*
	 * Given an array and values 'S' and 'p'. We must find if
	 * the sum of p consecutive values in the array match S.
	 * The solution has O(n) Time Complexity and O(1) Space Complexity.
	 */
	public boolean isPConsecutiveSumS(int[] a, int S, int p)
	{
		if(a==null || a.length<p)
			return false;
		
		int currentSum=0;
		
		for(int i=0;i<p;i++)
			currentSum+=a[i];
		
		if(currentSum==S)
			return true;
		
		int prevSum=currentSum;
		
		for(int i=1;i<a.length-p;i++)
		{
			currentSum=a[i+p-1]+prevSum-a[i-1];
			
			if(currentSum==S)
				return true;
			
			prevSum=currentSum;
		}
		
		return false;	
	}
