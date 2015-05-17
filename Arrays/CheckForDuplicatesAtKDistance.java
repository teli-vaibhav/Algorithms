public static boolean checkForDuplicatesInKDistance(int[] a, int k)
		{
			if(a==null)
				return false;
			
			Set<Integer> h=new HashSet<Integer>();
			
			if(a.length<k)
			{
				for(int i=0;i<a.length;i++)
				{
					if(!h.add(a[i]))
						return true;
				}
			}
			
			for(int i=0;i<k;i++)
			{
				if(!h.add(a[i]))
					return true;
			}
			
			int firstIndex=0;
			
			for(int i=k;i<a.length;i++)
			{
				h.remove(firstIndex);
				if(!h.add(a[i]))
					return true;
				firstIndex++;
			}
			
			return false;		
		}
