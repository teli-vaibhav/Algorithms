public static void rotateArrayByK(char[] a, int k)
	{
		if(a==null || a.length==0)
			return;
		
		k=k%a.length;
		
		reverseArrayByIndex(a,0,a.length-1);
		reverseArrayByIndex(a,0,k-1);
		reverseArrayByIndex(a,k,a.length-1);
	}
	
	

	private static void reverseArrayByIndex(char[] a, int i, int j) {
		
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
