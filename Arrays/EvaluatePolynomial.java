  /*
	 * Given a polynomial with an array of coefficients
	 * C0,C1,C2,___,CN and the value of x & the max power N.
	 * Evaluate the polynomial.
	 * This solution would have a Time Complexity of O(n) assuming
	 * the Math.pow function operates in O(1) which I really doubt.
	 * I'll come back to modify this once I know the internal java implementation
	 * Space Complexity however is O(1)
	 */
	public int evalPolynomial(int[] coef, int x, int n)
	{
		if(coef==null || coef.length!=n+1)
			return 0;
		
		int res=0;
		int power=0;
		
		for(int i=0;i<coef.length;i++)
		{
			res+=coef[i]*Math.pow(x, power);
			power++;
		}
		
		return res;
	}
