/*
	 * Given a 2-d Array where both rows and columns are sorted in increasing order
	 * Find the row and column of a given number in the array with minimum comparisons.
	 * This is solution with O(m+n) Time Complexity & O(1) Space Complexity
	 */
	public Index getIndex(int[][] a, int k)
	{
		Index res = new Index();
		res.i=-1;
		res.j=-1;
		
		if(a==null || a.length==0)
		  return res; //returns invalid result
		
		/*
		 * we start to iterate the array from the top right corner backwards
		 * so that it will be increasing in one direction and decreasing in the other
		 */
		int row=0;
		int column=a[0].length-1;
		
		while(row<a.length && column>=0)
		{
			if(a[row][column]==k)
			{
				res.i=row;
				res.j=column;
				return res;
			}
			
			if(k<a[row][column])
				column--;
			else
				row++;
		}
		
		return res; // returns invalid result if the element is not in the array
	}
