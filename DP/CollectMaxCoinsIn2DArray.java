/*
	 * We are given a 2-d array and each slot in this array contains a number
	 * of coins. We are to move from the left top corner of the array to the right
	 * bottom corner and in each step pick up the coins from the slot we traverse,
	 * The only directions we are allowed to move are right and down. Find the max
	 * coins that can be collected.
	 * The solution has O(m*n) time complexity and O(1) space complexity.
	 */
	public static int getMaximumCoinsCollected(int[][] a)
	{
		if(a==null || a.length==0 || a[0].length==0)
			return Integer.MIN_VALUE;
		
		int[][] res = new int[2][a[0].length+1];
		
		int rowCount=0;
		while(rowCount<a.length)
		{
			for(int i=1;i<res[0].length;i++)
			{
				res[1][i]=a[rowCount][i-1]+
				         Math.max(res[1][i-1], res[0][i]);
			}
			
			rowCount++;
			
			for(int i=1;i<res[0].length;i++)
			{
				res[0][i]=res[1][i];
			}
		}
		
		for(int i=1;i<res[0].length;i++)
		{
			System.out.print(" " + res[1][i]);
			System.out.println();
		}
		
		return res[1][res[0].length-1];
	}
