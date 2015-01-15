  /*
	 * There is a mad man who responds to a guessed age by either saying
	 * it is less than, greater than or equal to his age. We are to write an algorithm to find
	 * his age in the least number of guesses. Given that 'n' is the upper limit of the age. And the
	 * mad man responds in -1,0 or 1. 
	 * Time Complexity of the solution is O(log n) & the Space Complexity is O(1).
	 */
	public int getAge(int age, int n)
	{
		if(age<0 || n<0 || age>n)
			return Integer.MIN_VALUE;
		
		int l=0;
		int r=n;
		int m;
		int ans;
		
		while(l<=r)
		{
			m=(r-l)/2+l;
			ans = askMadMan(m);
					
			if(ans==0)
				return m;
			
			if(ans==-1)
				r=m-1;
			else
				l=m+1;
		}
		
		return Integer.MIN_VALUE; // the code would never reach this point.
	}
