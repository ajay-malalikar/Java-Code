package DP;

public class LCS {

	public static void main(String[] argv) {
	    int[][] L = new int[5][5];
		System.out.println(lcs("Aray", "Ajax", L));
	}
	
	public static int lcs(String s1, String s2, int[][] L) {
		 int m = s1.length();
		 int n = s2.length();
		 for(int i=0; i<m+1; i++)
		 {
			 for(int j=0; j<n+1; j++)
			 {
				 if(i==0 || j==0)
				 {
					 L[i][j] = 0;
				 }
				 else if(s1.charAt(i-1) == s2.charAt(j-1))
				 {
					 L[i][j] = L[i-1][j-1]+1;
				 }
				 else
				 {
					 L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
				 }
			 }
		 }
		 return L[m][n];
	}

}
