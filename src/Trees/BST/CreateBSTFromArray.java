package Trees.BST;

import java.util.Arrays;

public class CreateBSTFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		Arrays.sort(arr);
		Traversal.inorder(createBSTFromArray(arr, 0, arr.length-1));
	}
	public static Node createBSTFromArray(int[] arr, int l, int h){
		if(arr == null || arr.length == 0 || l > h){
			return null;
		}
		if(l == h){
			return new Node(arr[l]);
		}
		int mid = (l+h)/2;
		Node n = new Node(arr[mid]);
		n.left = createBSTFromArray(arr, l, mid-1);
		n.right = createBSTFromArray(arr, mid+1, h);
		return n;
	}
}
