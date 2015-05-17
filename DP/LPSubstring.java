public static int getLongestPalindrome(String s)
		{
			if(s==null || s.length()==0)
				return -1;
			
			char[] c= s.toCharArray();
			
			boolean[][] myPalindromes = new boolean[c.length][c.length];
			int maxLength=1;
			
			for(int i=0,j=0;i<myPalindromes.length;i++,j++)
				myPalindromes[i][j]=true;
			
			for(int i=0,j=1;j<myPalindromes.length;i++,j++)
			{
				  if(c[i]==c[j])
					  myPalindromes[i][j]=true; 
			}
			
			int i=0;
			int j=2;
			int prevJ=j;
			
			while(true)
			{			
				if(c[i]==c[j] && myPalindromes[i+1][j-1])
				{
					myPalindromes[i][j]=true;
					maxLength= Math.max(maxLength,j-i+1);
				}
				
				if((i==0 && j==myPalindromes.length-1))
				{
					
					break;
				}
				
				if(j==myPalindromes.length-1)
				{
					  j=prevJ+1;
					  prevJ=j;
					  i=0;
				}
				else
				{
					i++;j++;
				}
			}
			
			return maxLength;
		}
