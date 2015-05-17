public static String removeDuplicates(String s)
		{
			if(s==null || s.length()==0)
				return s;
			
			StringBuilder sb =new StringBuilder();
			HashSet<Character> h = new HashSet<Character>();
			
			for(int i=0; i<s.length();i++)
			{
				if(h.add(s.charAt(i)))
				{
					sb.append(s.charAt(i));
				}
			}
			
			return sb.toString();
		}
