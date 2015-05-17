public static void printNextGreaterElement(int[] a)
		{
			if(a==null || a.length==0)
				return;
			
			Stack<Integer> s= new Stack<Integer>();
			s.push(a[0]);
			
			for(int i=1;i<a.length;i++)
			{
				while(!s.isEmpty() && a[i]>s.peek())
				{
					System.out.println(s.pop() + "----" +a[i]);
				}
				
				s.push(a[i]);
			}
			
			while(!s.isEmpty())
				System.out.println(s.pop() + "----" + -1);
		}
