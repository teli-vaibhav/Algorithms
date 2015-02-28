/*
	 * We are given an integer n and we are to find if the
	 * given number is a power of 2.
	 * The solution has O(n-bits) where n bits are counted in the
	 * given number from the least significant bit to the first set bit.
	 * It runs in constant space.
	 */
	public static boolean isPowerOf2(int n)
	{
		if(n<=0)
			return false;
		
		return ((n&(n-1))==0);
	}
