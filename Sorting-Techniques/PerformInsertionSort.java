  /*
	 * We are given an array of n elements. We are to sort the array
	 * using Insertion Sort. The Time complexity of Insertion Sort is
	 * O(n*2) and O(1) is the space complexity.
	 */
	public void performInsertionSort(int[] a)
	{
		if(a==null || a.length==0)
			return;
		
		int binaryIndex;
		
		for(int i=1; i<a.length;i++)
		{
			binaryIndex = getBinarySearchIndex(a,0,i-1,i);
			if(i!=binaryIndex)
			insertElementAtIndex(a,i,binaryIndex);
		}
		
	}

	private void insertElementAtIndex(int[] a, int i, int binaryIndex) {
		
		int temp = a[i];
		
		for(int m=i-1;m>=binaryIndex;m--)
		{
			a[m+1]=a[m];	
		}
		
		a[binaryIndex]=temp;
	}

	private int getBinarySearchIndex(int[] a, int l, int r,int i) {
		
		int m;
		
		while(l<=r)
		{
			m =l+(r-l)/2;
		if(m==0 && a[m]>a[i])
			return m;
		
		if(m==0 && a[m]<=a[i])
			return m+1;
		
		if(m==r && a[m]<=a[i])
			return m+1;
		
		if(m==r && a[m]>a[i])
			return m;
		
		if(a[m]>a[i] && a[m-1]<=a[i])
			return m;
		
		if(a[m]<=a[i] && a[m-1]<=a[i])
			l=m+1;
		
		if(a[m]>a[i] && a[m-1]>a[i])
			r=m-1;
		}
		
		return -1;
		
	}
