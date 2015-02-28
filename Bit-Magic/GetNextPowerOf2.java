/*
	 * Given an integer, we are to find a number>=given number
	 * such that it is a power of 2.
	 * The solution has O(log n) Time complexity where n is
	 * the number of bits as a left shift
	 * is equivalent to multiplying by 2.
	 * The solution runs in constant space.
	 */
	public static int getNextPowerOf2(int n)
	{
		if(n<=0)
			return Integer.MIN_VALUE;
		
		if((n&(n-1))==0)
				return n;
		
		int p=1;
		
		while(n!=0)
		{
			n>>=1;
		    System.out.println("aaa");
		    p<<=1;
		}
		
		return p;
	}
