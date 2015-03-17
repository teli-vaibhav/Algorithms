/*
	 * Given a number 'n' we are allowed to perform the following operations:
	 * n=n-1, n=n/2 if n%2==0 & n=n/3 if n%3==0.
	 * Find the minimum number of steps it takes to make n=1.
	 * The solution below has O(3^n) time complexity and O(n) space complexity.
	 */
	public static int getMinStepsRecursive(int n)
	{
		if(n<1)
			return Integer.MIN_VALUE;
		
		if(n==1)
			return 0;
		
		int res = 1+ getMinStepsRecursive(n-1);
		if(n%2==0)
			res=Math.min(res, 1+ getMinStepsRecursive(n/2));
		if(n%3==0)
			res=Math.min(res, 1 + getMinStepsRecursive(n/3));
		
		return res;
	}
