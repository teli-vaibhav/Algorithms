  /*
	 * We need to implement the Bubble sort algorithm
	 * where in each iteration the highest element is moved to the
	 * end of the array. The solution has O(n*2) time complexity and
	 * O(1) space complexity.
	 */
	public int[] performBubbleSort(int[] a)
	{
		if(a==null)
			return null;
		
		int i=0;
		int j=a.length-1;
		
		while(j>0)
		{
		while(i<j)
		{
			if(a[i]>a[i+1])
				swap(a,i,i+1);
			i++;
		}
		j--;
		i=0;
		}
		return a;
	}

	private void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;	
	}
