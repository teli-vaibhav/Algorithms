  /*
	 * We are given an array and we are to sort it using
	 * Merge Sort. The time complexity of the solution is
	 * O(n*log n) and the space complexity is O(n)
	 */
	public void performMergeSort(int[] a)
	{
		if(a==null || a.length==0)
			return;
		
		performMergeSortAux(a,0,a.length-1);	
	}

	private void performMergeSortAux(int[] a, int l, int r) {
		
		if(l>=r)
			return;
		
		int m=(r-l)/2+l;
		performMergeSortAux(a,l,m);
		performMergeSortAux(a,m+1,r);
		merge(a,l,m,r);
	}

	private void merge(int[] a, int l, int m, int r) {
		
		int[] lArray=new int[m-l+1];
		
		int y=l;
		for(int x=0;x<lArray.length;x++)
			lArray[x]=a[y++];
		
		int[] rArray=new int[r-m];
		
		y=m+1;
		for(int x=0;x<rArray.length;x++)
			rArray[x]=a[y++];
		
		int i=0; int j=0; int k=l;
		
		while(i<lArray.length && j<rArray.length && k<=r)
		{
			if(lArray[i]<=rArray[j])
				a[k++]=lArray[i++];
			else
				a[k++]=rArray[j++];
		}
		
		while(i<lArray.length)
			a[k++]=lArray[i++];
		
		while(j<rArray.length)
			a[k++]=rArray[j++];
	}
