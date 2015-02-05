  /*
	 * We are given an array and the max number of digits an intger
	 * may have in the array. We are asked to sort it using Radix Sort.
	 * The algorithm has O(n) Time Complexity and O(n) space.
	 */
	public int[] performRadixSort(int[] a,int d)
	{
		if(a==null)
			return null;
		
		Node[] digitSortedArray= new Node[10];
		int n=1;
		
		while((Math.pow(10, d)/n)>=1)
		{
			sortByDigit(digitSortedArray,a,n);
			n=n*10;
			reInitializeDigitArray(digitSortedArray);
		}
		
		return a;
	}
	
	private void reInitializeDigitArray(Node[] digitSortedArray) {
		int i=0;
		while(i<digitSortedArray.length)
			digitSortedArray[i++]=null;
	}

	private void sortByDigit(Node[] digitSortedArray, int[] a, int n) {
		
		int index;
		
		for(int singleNum: a)
		{
			index=(singleNum/n)%10;
			insertNode(digitSortedArray,singleNum,index);
		}	
		
		arrangeInitialArray(digitSortedArray,a);
	}

	private void arrangeInitialArray(Node[] digitSortedArray, int[] a) {
		int i=0;
		Node current=digitSortedArray[0];
		for(Node indexNode: digitSortedArray)
		{
			current=indexNode;
			while(current!=null)
			{
				a[i++]=current.element;
				current=current.next;
			}
		}	
		
	}

	private void insertNode(Node[] digitSortedArray, int singleNum, int index) {
	
		Node current = digitSortedArray[index];
		
		if(current==null)
		{
			digitSortedArray[index]=new Node(singleNum);
			return;
		}
		
		while(current!=null && current.next!=null)
		{
			current=current.next;
		}
		
		current.next= new Node(singleNum);
	}
