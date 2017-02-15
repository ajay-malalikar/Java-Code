package Graphs.traversal;

public class DFS {
	public static void main(String[] argv) {
		int numberOfVertices = 6;
		boolean[] visited = new boolean[numberOfVertices];
		Graph g = new Graph(numberOfVertices);
		g.addEdge(5,2);
		g.addEdge(5,0);
		g.addEdge(4,0);
		g.addEdge(4,1);
		g.addEdge(5,2);
		g.addEdge(2,3);
		g.addEdge(3,1);
		
		for(int i=5; i>=0; i--)
		{
			if(!visited[i])
			{
				dfs(g, visited, i);
			}
		}
	}
	
	public static void dfs(Graph g, boolean[] visited, int src) {
		System.out.print(src + " ");
		visited[src] = true;
		for(Integer i : g.edges[src])
		{
			if(!visited[i])
				dfs(g, visited, i);
		}
	}
}
