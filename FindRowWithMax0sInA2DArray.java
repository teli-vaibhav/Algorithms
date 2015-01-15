	/*
	 * Given a 2d array which contains only 0s and 1s
	 * No 0 can appear before a 1 in any row. We are to
	 * find the row with maximum number of 0s.
	 * The solution has a Time Complexity of (mlog n)
	 * where m is the number of rows and n is the number of 
	 * columns
	 */
	public int getRowWithMaxZeros(int[][] a)
	{
		if(a==null || a.length==0 || a[0].length==0)
			return Integer.MIN_VALUE;//returns negative infinity
		
		int rowRes=Integer.MIN_VALUE;
		int columnRes=a[0].length-1;
		int currentRow=0;
		int l=0;
		int r;
		
		while(currentRow<a.length)
		{
			if(a[currentRow][columnRes]==0)
			{
				columnRes= getRightMostIndexOf1(a[currentRow],0,columnRes-1);
				if(columnRes==-1) //when there is no '1' in the array
					return currentRow;
				rowRes=currentRow;
			}
			currentRow++;
		}
		
		return rowRes;	
	}

	/*
	 * This is our encapsulated method to find the rightmost
	 * index of '1' in the array that is passed
	 */
	private int getRightMostIndexOf1(int[] a, int l, int r) {
		int m;
		int lastIndex=r;
		
		while(l<=r)
		{
			m=(r-l)/2+l;
			if(a[m]==1)
			{
				if(m==lastIndex || a[m+1]==0)
					return m;
			}
			
			if(a[m]==1)
				l=m+1;
			else
				r=m-1;
		}
		
		return -1;//there are no 1s in the array
	}
