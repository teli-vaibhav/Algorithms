public static int getIndexOfFirstRepeating(char[] c)
		{
			if(c==null || c.length==0)
				return -1;
			
			Set<Character> h = new HashSet<Character>();
			
			for(int i=0;i<c.length;i++)
			{
				if(!h.add(c[i]))
						return i;			
			}
			return -1;
		}
