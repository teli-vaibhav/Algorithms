/*
	 * Given a number 'n' we are allowed to perform the following operations:
	 * n=n-1, n=n/2 if n%2==0 & n=n/3 if n%3==0.
	 * Find the minimum number of steps it takes to make n=1.
	 * The solution below has O(n) time complexity and O(n) space complexity.
	 */
	public static int getMinStepsTopDown(int n)
	{
		if(n<1)
			return Integer.MIN_VALUE;
		
		if(n==1)
			return 0;
		
		int[] res= new int[n+1];
		
		res[1]=0;
		
		for(int i=2;i<=n;i++)
			res[i]=-1;
		
		return getMinStepsTopDownAux(n,res);
	}

	private static int getMinStepsTopDownAux(int n, int[] res) {
		
		if(res[n]!=-1)
			return res[n];
		
		res[n]=1+getMinStepsTopDownAux(n-1,res);
		
		if(n%2==0)
		  res[n]= Math.min(res[n], 1+ getMinStepsTopDownAux(n/2,res));
		
		if(n%3==0)
			res[n] = Math.min(res[n], 1+getMinStepsTopDownAux(n/3,res));
		
		return res[n];
	}
