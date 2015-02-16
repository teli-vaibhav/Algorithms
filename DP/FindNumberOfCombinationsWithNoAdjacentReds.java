/*
	 * Given the number of cells, we can colour each of these cells in Red or Green.
	 * We are to find the number of ways in which we could colour them such that
	 * no two cells adjacent to each other are Red in colour.
	 * Let is consider n=1,
	 * there are only 2 ways to colour here, either R or G. Ans=2.
	 * Consider n=2,
	 * ans=3 (RG,GR,GG)
	 * Consider n=3,
	 * ans=5 (RGR,RGG,GGG,GRG,GGR)
	 * If we closely observe n=3,
	 * Take the first cell and fix a colour Red,
	 * Now this problem is broken into subproblems where first cell is R & first cell is not R
	 * When it is not R, the result is same as for n=2 which is 3.
	 * When it is R, the second cell can be fixed G, now cell 1 and cell 2 are fixed
	 * so cell 3 will be the same as the solution for n=1.
	 * Combining both results 3+2=5.
	 * The sequence is something like a Fibonacci here.
	 * The solution has O(n) time complexity and O(1) space complexity.
	 */
	public static int getNumberOfCombinationsWithNoAdjacentReds(int n)
	{
		if(n<1)
			return Integer.MIN_VALUE;
		
		int n1=2;int n2=3;
		int numberOfCells=3;
		int res=5;
		
		while(numberOfCells<=n)
		{
			res=n1+n2;
			numberOfCells++;
			n1=n2;
			n2=res;
		}
		
		return res;
	}
