
public void printDFS(Graph g,int u)
	{
		if(g==null || g.adjMatrix==null)
			return;
		printDFSAux(g,u,g.visited);
	}


private void printDFSAux(Graph g, int u, boolean[] visited) {
		
		visited[u]=true;
		System.out.print(u);
		
		GNode currentNode = g.adjMatrix[u];
		
		while(currentNode!=null)
		{
			if(!g.visited[currentNode.element])
				printDFSAux(g,currentNode.element,visited);
			
			currentNode=currentNode.next;
		}
	}
