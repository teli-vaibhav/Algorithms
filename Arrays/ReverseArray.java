public static void reverseArray(char[] a)
	{
		if(a==null || a.length==0)
			return;
	
		int i=0;
		int j=a.length-1;
		
		while(i<j)
		{
			swap(a,i,j);
			i++;
			j--;
		}
	}
			

	private static void swap(char[] a, int i, int j) {
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;	
	}
