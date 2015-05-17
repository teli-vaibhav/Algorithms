public static void move0sToEnd(int[] a)
		{
			if(a==null || a.length==0)
				return;
			
			int i=0;int j=a.length-1;
			
			while(i<=j)
			{
				if(a[i] !=0)
					i++;
				else
				{
					swap(a,i,j);
					j--;
				}
			}
		}
