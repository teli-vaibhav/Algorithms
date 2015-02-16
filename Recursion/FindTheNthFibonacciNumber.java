/*
	 * We must find the nth Fibonacci number using recursion.
	 * The solution has O(2^n) Time Complexity and O(n) space complexity
	 * if we include the space taken by the recursion stack.
	 * This solution has an overlap in sub solutions and is less efficient in comparison.
	 * Please refer to the DP section for a more efficient solution.
	 */
	public static int getNthFibonacciNumber(int n)
	{
		if(n<=0)
			return Integer.MIN_VALUE;
		
		if(n==1 || n==2)
			return n-1;
		
		return getNthFibonacciNumber(n-1) + getNthFibonacciNumber(n-2);
	}
