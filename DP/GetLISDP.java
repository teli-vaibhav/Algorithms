/*
	 * Given an array of integers, we are to find the length of the
	 * longest incresing subsequence.
	 * The solution below has O(n^2) time complexity and O(n) space complexity.
	 */
	public static int getLISDP(int[] a)
	{
		if(a==null || a.length==0)
			return Integer.MIN_VALUE;
		
		int n=a.length-1;
		
		int[] res=new int[n+1];
		res[0]=1;
		
		for(int i=1;i<=n;i++)
		{
			res[i]=1;
			for(int j=0;j<i;j++)
			{
				if(a[j]<a[i])
					res[i]=Math.max(res[i], 1+res[j]);
			}
		}
		
		return res[n];
	}
