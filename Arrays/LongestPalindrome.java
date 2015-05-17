public static boolean areElementsConsecutive(int[] a)
		{
			if(a==null || a.length==0)
				return false;
			
			BitSet b = new BitSet(2*(a.length));
			
			int middleIndexOfBitArray = a.length-1;
			
			b.set(middleIndexOfBitArray);
			
			int difference = a[0]-middleIndexOfBitArray;
			
			for(int i=1;i<a.length;i++)
			{
				if(a[i]-difference<0 || a[i]-difference>b.size()-1)
				{
					return false;
				}
					
				
				if(b.get(a[i]-difference))
					return false;
				
				b.set(a[i]-difference);
			}
			
			int i=0;
			
			while(!b.get(i))
				i++;
			
			for(int j=i;j<=a.length;j++)
			{
				if(!b.get(j))
					return false;
			}
			return true;
		}
