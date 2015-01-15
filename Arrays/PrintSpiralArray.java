  /*
	 * Given a 2D Array. We are to print the array spirally.
	 * The solution has a Time Complexity of O(m*n) and
	 * a Space Complexity if O(1)
	 */
	public void printSpiralArray(int[][] a)
	{
		if(a==null || a.length==0 || a[0].length==0)
			return;
		
		int iMax=a.length-1;
		int jMax=a[0].length-1;
		int i=0;
		int j=0;
		int iMin=0;
		int jMin=0;
		
		while(iMin<=iMax && jMin<=jMax)
		{
			while(j<=jMax)
				System.out.print(a[i][j++]);
			
			j--;
			i++;
			
			if(i>iMax)
				break;
			
			while(i<=iMax)
				System.out.print(a[i++][j]);
			
			i--;
			j--;
			
			if(j<jMin)
				break;
			
			while(j>=jMin)
				System.out.print(a[i][j--]);
			
			j++;
			i--;
			iMin++;
			
			if(i<iMin)
				break;
			
			while(i>=iMin)
				System.out.print(a[i--][j]);
			
			i++;
			j++;
			iMax--;
			
			jMax--;
			jMin++;
			System.out.println();
		}
	}
