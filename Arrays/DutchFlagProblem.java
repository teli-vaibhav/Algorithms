/*
		 * Given an array of 0,1,2. We must arrange it such that
		 * all 0s are followed by all 1s followed by all 2s.
		 * The solution has O(n) time complexity and O(1) space
		 * complexity.
		 */
		public static void solveDutchFlagProblem(int[] a)
		{
			if(a==null || a.length==0)
				return;
			
			int i=0;
			int j=0;
			int k=a.length-1;
			
			while(j<=k)
			{
				if(a[j]==1)
					j++;
				
				else if(a[j]==0)
				{
					swap(a,i,j);
					j++;
					i++;
				}
				
				else
				{
					swap(a,j,k);
					k--;
				}
					
			}
			
		}
		
		private static void swap(int[] a, int m, int n)
		{
			int temp=a[m];
			a[m]=a[n];
			a[n]=temp;
		}
