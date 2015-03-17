  /*
	 * Find the nth Fibonacci number using Top Down DP.
	 * The solution has O(n) time complexity
	 * and O(n) space complexity.
	 */
	public static int getNthFibonacciTopDown(int n)
	{
		if(n<1)
			return Integer.MIN_VALUE;
		if(n<=2)
			return n-1;
		
		int[] res=new int[n+1];
		
		res[1]=0;
		res[2]=1;
		
		for(int i=3;i<=n;i++)
		{
			res[i]=-1;
		}
		
		return getNthFibonacciTopDownAux(n,res);
	}
	
	private static int getNthFibonacciTopDownAux(int n, int[] res) {
		
		if(res[n]!=-1)
			return res[n];
		
		res[n]=getNthFibonacciTopDownAux(n-1,res) + getNthFibonacciTopDownAux(n-2,res);
		
		return res[n];
	}
