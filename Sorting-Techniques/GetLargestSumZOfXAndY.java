  /*
	 * Given an unsorted array of integers. We are to find the maximum value
	 * of Z in an array such that X+Y=Z, where X,Y are elements in the array too.
	 * The solution has O(n^2) time complexity and O(1) space complexity.
	 */
	public int getLargestSumZOfXAndY(int[] a)
	{
		if(a==null)
			return Integer.MIN_VALUE;
		
		performQuicksortSort(a); //use any O(nlogn) sorting algorithm
		
		int i=0;int j=a.length-1;int res;
		
		for(int z=a.length-1;z>=0;z--)
		{
			res=a[z];
			j=z;
			i=0;
			while(i<j)
			{
				if(a[i]+a[j]==res)
					return res;
				
				else if(a[i]+a[j]<res)
					i++;
				
				else
					j--;
			}
		}
		return Integer.MIN_VALUE;
	}
