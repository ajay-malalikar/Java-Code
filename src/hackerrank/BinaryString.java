package hackerrank;

public class BinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(counting("10101"));
	}
	static int counting(String s) {
        int n = s.length();
        int count = 0;
        char[] schar = s.toCharArray();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j+=2){
                if(condition(schar, i, j))
                    count++;
            }
        }
        return count;
    }
    static boolean condition(char[] s, int i, int j){
        if((j-i) % 2 !=0)
        {
            while(i<j){
            	if(s[i]!=s[j]) 
            	{
            		if(j-i != 1 && s[i] != s[i+1])
            		{
            			return false;
            		}
            		i++;
            		j--;
            	}
            	else{
            		return false;
            	}
            }
            return true;
        }
        return false;
    }
}
