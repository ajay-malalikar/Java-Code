package Graphs.traversal;
import java.util.*;
public class Graph {
	int vertices;
	LinkedList<Integer>[] edges;
	@SuppressWarnings("unchecked")
	public Graph(int v) {
		this.vertices = v;
		edges = new LinkedList[v];
		for(int i=0; i < v; i++)
		{
			edges[i] = new LinkedList<>();
		}
	}
	public void addEdge(int s, int d)
	{
		edges[s].add(d);
	}
}
