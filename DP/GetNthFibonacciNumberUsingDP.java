/*
	 * We are to find the nth Fibonacci number with a good time and 
	 * space complexity.
	 * The solution below has a time complexity of O(n) and space
	 * complexity of O(1).
	 * This solution is much more efficient compared to the recursive solution
	 * which has O(2^n) time complexity also takes up considerable recursive stack space.
	 */
	public static int getNthFibonacciNumberUsingDP(int n)
	{
		if(n<=0)
			return Integer.MIN_VALUE;
		
		if(n==1 || n==2)
			return n-1;
		
		int n1=0;int n2=1;
		int res=1;
		int nthNumber=3;
		
		while(nthNumber<=n)
		{
			res=n1+n2;
			nthNumber++;
			n1=n2;
			n2=res;
		}
		
		return res;	
	}
