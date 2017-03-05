package Trees.BST;
import java.util.*;

public class NodesBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3,5,1,2,4,0,76};
		Arrays.sort(arr);
		Node root = CreateBSTFromArray.createBSTFromArray(arr, 0, arr.length-1);
		LinkedList<Integer> list = nodesBetweenRange(root, 3, 7);
		for(int i : list){
			System.out.println(i);
		}
	}
	public static LinkedList<Integer> nodesBetweenRange(Node root, int k1, int k2){
		LinkedList<Integer> list = new LinkedList<>();
		if(root == null){
			return list;
		}
		if(root.data > k1){
			list.addAll(nodesBetweenRange(root.left, k1, k2));
		}
		if(root.data >= k1 && root.data <= k2){
			list.add(root.data);
		}
		if(root.data < k2){
			list.addAll(nodesBetweenRange(root.right, k1, k2));
		}
		return list;
	}
}
