// http://www.geeksforgeeks.org/find-maximum-depth-nested-parenthesis-string/
package Strings.general;

public class MaxDepthOfParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(maxDepth("b) (c) ()"));
	}
	
	public static int maxDepth(String str) {
		int count = 0;
		int max = 0;
		for(char i : str.toCharArray()) {
			if(i == '(') {
				count++;
				if(max < count) max = count;
			}
			if(i == ')') {
				count--;
			}
		}
		if(count != 0) return -1;
		return max;
	}

}
