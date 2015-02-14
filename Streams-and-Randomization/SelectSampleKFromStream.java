  /*
	 * Given a stream of integers. We are to find the K random numbers at
	 * any point of time. The solution has O(n) time complexity and O(k)
	 * space complexity.
	 */
	public static int[] getRandomSampleOfKNumbers(int[] res,int k,int nextNumber,int count)
	{
		if(res==null || res.length==0)
			return null;
		
		if(count<=k)
		{
			for(int i=0;i<res.length;i++)
			{
				if(res[i]==Integer.MIN_VALUE)
				{
					res[i]=nextNumber;
					return res;
				}
			}
		}
		
		int randomValue=new Random().nextInt(k+1);//get a number from 0 to k
		if(randomValue<k) //if the value is less than k, replace the array value at that index with the new integer coming in.
			res[randomValue]=nextNumber;
		
		return res;
	}

	public static void main(String[] args)
	{
		int[] randomArray= {4,3,6,1,8,4,0};
		int count = 0;
		int ans[]=null;
		int k=3;
		int[] res= new int[k];
		for(int i=0;i<res.length;i++)
			res[i]=Integer.MIN_VALUE;
		
		for(int m:randomArray)
		{
			count++;
			ans = getRandomSampleOfKNumbers(res,k,m,count);
			for(int x:ans)
				System.out.print(x);
			System.out.println();
		}
		
	}
	
