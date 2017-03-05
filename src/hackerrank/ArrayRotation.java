package hackerrank;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,2,3,4,5};
		reverse(a, 1, a.length-1);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void reverse(int[] a, int l, int h){
        while(l<h){
        	int temp = a[l];
        	a[l] = a[h];
        	a[h] = temp;
        	l++;
        	h--;
        }
    }

}
