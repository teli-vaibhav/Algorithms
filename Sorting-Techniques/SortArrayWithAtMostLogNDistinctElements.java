  /*
	 * Given an array of integers that has at most 'n' distinct elements
	 * We must sort the array in less than O(n*log n) time.
	 * The solution involves construction of a BST which only maintains distinct values
	 * and a counter for duplicates in each node. 
	 * So, we would have maximum of log n elements in the BST.
	 * We now do an Inorder traversal to get the sorted array.
	 * The solution has O(n*log(log n)) time complexity as each insertion to the
	 * tree would take O(log(log n)) time and O(log n) space complexity.
	 */
	public void sortArrayWithAtMostLogNDistinctElements(int[] a)
	{
		if(a==null || a.length==0)
			return;
		
		TreeNodeForBSTSort root = new TreeNodeForBSTSort(a[0]);
		TreeNodeForBSTSort current=root;
		TreeNodeForBSTSort prev=current;
		
		for(int i=1;i<a.length;i++)
		{
			current=root;
		  while(current!=null)
		  {
				prev=current;
			if(a[i]>current.element)
				current=current.right;
			
			else if(a[i]<current.element)
				current=current.left;
			
			else if(a[i]==current.element)
			{
				current.numberOfElements++;
				break;
			}	
		   }	
		  if(a[i]>prev.element)
				prev.right=new TreeNodeForBSTSort(a[i]);
			else if(a[i]<prev.element)
			{
				prev.left=new TreeNodeForBSTSort(a[i]);
				System.out.print("here!!");
			}
		}
		
		
		arrangeTheArrayInorder(a,root,new int[]{0});
	}
	
	

	private void arrangeTheArrayInorder(int[] a, TreeNodeForBSTSort root,int[] index) {
		
		if(root==null)
			return;
		
		arrangeTheArrayInorder(a,root.left,index);
		int noOfElements=root.numberOfElements;
		
		while(noOfElements>=0)
		{
			System.out.println(root.element+ " re");
			a[index[0]]=root.element;
			index[0]++;
			noOfElements--;
		}
		
		arrangeTheArrayInorder(a,root.right,index);
	}
	
class TreeNodeForBSTSort
{
	int element;
	TreeNodeForBSTSort left;
	TreeNodeForBSTSort right;
	int numberOfElements;
	
	TreeNodeForBSTSort(int element)
	{
		this.element=element;
	}
}
