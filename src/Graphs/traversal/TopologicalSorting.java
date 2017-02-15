package Graphs.traversal;
import java.util.*;

public class TopologicalSorting{
	public static void main(String argv[])
	{
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
		Stack<Integer> s = new Stack<>();
		for(int i=0; i<numberOfVertices; i++)
		{
			if(!visited[i]) {
				Sort(g, i, visited, s);
			}
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}
	public static void Sort(Graph g, int v, boolean[] visited, Stack<Integer> s) {
		visited[v] = true;
		for(Integer i: g.edges[v]) {
			if(!visited[i]) {
				Sort(g, i, visited, s);
			}
		}
		s.push(v);
	}
}
