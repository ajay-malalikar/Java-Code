package DP;

public class PrintLCS {

	public static void main(String[] args) {
		int[][] L = new int[7][7];
		String s1 = "AEDFHR";
		String s2 = "ABCDGH";
		LCS.lcs(s1, s2, L);
		System.out.print(printLCS(s1, s2, L));
	}
	
	public static String printLCS(String s1, String s2, int[][] L) {
		StringBuilder sb = new StringBuilder();
		int i=s1.length(), j=s2.length(), id = L[s1.length()][s2.length()];
		while(id > 0)
		{
			if(s1.charAt(i-1) == s2.charAt(j-1))
			{
				id--;
				sb.append(s1.charAt(i-1));
				i--; j--;
			}
			else if(L[i-1][j] > L[i][j-1])
			{
				i--;
			}
			else {
				j--;
			}
		}
		return sb.reverse().toString();
	}
}
