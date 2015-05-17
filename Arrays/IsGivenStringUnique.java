public static boolean isUnique(char[] c)
		{
			if(c==null || c.length==0)
				return false;
			
			HashSet<Character> h = new HashSet<Character>();
			
			for(char m: c)
			{
				if(!h.add(m))
					return false;
			}
			
			return true;
		}
