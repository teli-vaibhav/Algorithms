/*
	 * Given a number 'n' we are allowed to perform the following operations:
	 * n=n-1, n=n/2 if n%2==0 & n=n/3 if n%3==0.
	 * Find the minimum number of steps it takes to make n=1.
	 * The solution below has O(n) time complexity and O(n) space complexity.
	 */
	public static int getMinStepsBottomUp(int n)
	{
		if(n<1)
			return Integer.MIN_VALUE;
		
		if(n==1)
			return 0;
		
		int[] res=new int[n+1];
		
		for(int i=2;i<=n;i++)
		{
			res[i]=1+res[i-1];
			
			if(i%2==0)
				res[i]=Math.min(res[i], 1+res[i/2]);
			
			if(i%3==0)
				res[i]=Math.min(res[i], 1+res[i/3]);
		}
		
		return res[n];
	}
