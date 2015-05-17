//Assume ASCII
		public static boolean isAnagram(String s1, String s2)
		{
			if(s1==null || s2==null || s1.length()==0 || 
					s2.length()==0 || s1.length()!=s2.length())
				return false;
			
			int[] res = new int[256];
			
			for(int i=0;i<s1.length();i++)
			{
				res[s1.charAt(i)]++;
				res[s2.charAt(i)]--;
			}
			
			for(int i=0;i<256;i++)
			{
				if(res[i]!=0)
					return false;
			}
			
			return true;
		}
