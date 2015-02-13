  /*
	 * Given a stream of integers, we are to find a random number from this stream.
	 * The solution below has O(n) time complexity and O(1) Space complexity.
	 * The idea is to select a random number at every point.
	 */
	public static int getRandomNumberFromStream(int a,int count,int prevRandomNumber)
	{
		if(count==1) //this would be the fist number in the stream
			return a;
		
		Random r= new Random();
		int randomNumber = r.nextInt(count); //returns integer values from 0 to count-1
		
		if(randomNumber==count-1) //this means we only select the latest number with a probability of 1/count
			return a;
		
		return prevRandomNumber; //we still pick the previous random value with (count-1)/count probability
	}

	public static void main(String[] args)
	{
		int[] randomArray= {4,3,6,1,8,4,0};
		int count = 0;
		int prev = Integer.MIN_VALUE;
		
		for(int m:randomArray)
		{
			count++;
			prev = getRandomNumberFromStream(m,count,prev);
			System.out.print(prev+" ");
		}
		
	}
