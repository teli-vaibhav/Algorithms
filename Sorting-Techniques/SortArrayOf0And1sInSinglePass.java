  /*
	 * Given an array of 0s and 1s only.
	 * We are to sort this in a single pass.
	 * The way to solve this problem would be the subroutine sort
	 * in Insertion Sort. By iterating from both ends.
	 * The solution has O(n) time complexity and O(1) space
	 * complexity.
	 */
	public void sortArrayOf0And1InSinglePass(int[] a)
	{
		if(a==null || a.length==0)
			return;
		
		int i=0;int j=a.length-1;
		
		while(i<j)
		{
			while(i<j && a[i]==0)
				i++;
			
			while(i<j && a[j]==1)
				j--;
			
			if(i<j)
				swap(a,i,j);
		}
	}
	
	private void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;	
	}
