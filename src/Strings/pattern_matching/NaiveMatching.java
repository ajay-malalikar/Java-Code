package Strings.pattern_matching;

import java.util.LinkedList;

public class NaiveMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] indices = search("Ajay is good", "a");
		for(int i : indices)
			System.out.print(i + " ");
	}
	public static int[] search(String txt, String pat) {
		int m = pat.length();
		int n = txt.length();
		LinkedList<Integer> indices = new LinkedList<>();
		for(int i = 0; i< n-m+1; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(txt.charAt(i+j) != pat.charAt(j)) break;
				if(j == m-1) indices.add(i);
			}
		}
		return indices.stream().mapToInt(i->i).toArray();
	}
}
