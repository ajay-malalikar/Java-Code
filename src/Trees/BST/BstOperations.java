package Trees.BST;

public class BstOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3,5,1,2,4,0,76};
		Node root = null;
		for(int i : arr){
			root = insert(root, i);
		}
		Traversal.inorder(root);
		System.out.println("\n"+inorderSuccessor(root, root.right.left));
	}
	public static Node insert(Node root, int data)
	{
		if(root == null){
			return new Node(data);
		}
		if(data > root.data)
			root.right = insert(root.right, data);
		else if(data < root.data)
			root.left = insert(root.left, data);
		return root;
	}
//	public static Node delete(Node root, int data){
//		if(root == null)
//			return root;
//		if(data < root.data){
//			return delete(root.left, data);
//		}
//		else if(data > root.data){
//			return delete(root.right, data);
//		}
//		if()
//	}
	public static int minvalue(Node root){
		if(root == null)
			return Integer.MAX_VALUE;
		Node cur = root;
		while(cur.left != null){
			cur = cur.left;
		}
		return cur.data;
	}
	
	public static int inorderSuccessor(Node root, Node n){
		if(root == null || n == null)
		{
			return Integer.MAX_VALUE;
		}
		if(n.right != null){
			return minvalue(n.right);
		}
		Node succ = null;
		while(root != null){
			if(n.data < root.data){
				succ = root;
				root = root.left;
			}
			else if(n.data > root.data){
				root = root.right;
			}
			else
				break;
		}
		return succ.data;
	}
}
