public static void printPairSumX(int[] a,int x)
		{
			if(a==null || a.length==0)
				return;
			
			Arrays.sort(a);
			
			int i=0;int j=a.length-1;
			
			while(i<j)
			{
				if(a[i]+a[j]==x)
				{
					System.out.println(a[i] + " and " +a[j]);
					return;
				}
				
				else if(a[i]+a[j]<x)
					i++;
				else j--;
			}
		}
