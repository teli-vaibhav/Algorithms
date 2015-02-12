  /*
	 * Given an array of 10,000 elements whose values range from
	 * 1-10. We are required to sort this array.
	 * The solution is using counting sort. The Time Complexity is
	 * O(n) and O(1) is the space complexity.
	 */
	public int[] sortGivenArrayOf1To10Range(int[] givenArray)
	{
		if(givenArray==null || givenArray.length==0)
			return null;
		
		int[] res = new int[10];
		
		for(int individualElement:givenArray)
		{
			res[individualElement-1]+=1;
		}
		
		int count=0;
		int j=0;
		
		for(int i=0;i<res.length;i++)
		{
			count=res[i];
			
			while(count>0)
			{
				givenArray[j++]=i+1;
				count--;
			}
				
		}
		
		return givenArray;
	}
