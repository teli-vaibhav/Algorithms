public void BFS(Graph g, int u)
	{
		if(g==null || g.adjMatrix==null)
			return;
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(u);
	    g.visited[u]=true;
		
		int currentElement;
		GNode currentNode;
		
		while(!q.isEmpty())
		{
			currentElement=q.remove();
			
			System.out.print(currentElement);
			
			currentNode = g.adjMatrix[currentElement];
			while(currentNode!=null)
			{
				if(!g.visited[currentNode.element])
				{
					q.add(currentNode.element);
					g.visited[currentNode.element]=true;
				}
				currentNode=currentNode.next;
			}
		}
	}
