package Strings.general;

public class RotateStrings {
	public static void main(String[] argv) {
		rotate("ABC");
	}
	
	public static void rotate(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			String s1 = str.substring(1, str.length());
			String s2 = str.substring(0, 1);
			str = s1+s2;
			System.out.println(str);
		}
	}
}
