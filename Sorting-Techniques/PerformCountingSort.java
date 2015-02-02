  /*
	 * We need to implement the counting sort algorithm where
	 * we are provided with an unsorted array and with the
	 * range of integers(positive or negative).
	 * The solution has O(n) time complexity and O(Range Difference) 
	 * space complexity.
	 */
	public int[] performCountingSort(int[] a,int rangeFrom,int rangeTo)
	{
		if(a==null)
		   return null;
		int indexFactor=-1*rangeFrom;
		
		int[] rangeArray = new int[Math.abs(rangeTo-rangeFrom)+1];
		
		for(int m: a)
			rangeArray[m+indexFactor]++;
		
		int resValue=0;
		int j=0;
		
		for(int i=0;i<rangeArray.length;i++)
		{
			resValue=rangeArray[i];
			while(resValue>0)
			{
				a[j++]=i-indexFactor;
				resValue--;
			}
		}
		
		return a;
			
	}
