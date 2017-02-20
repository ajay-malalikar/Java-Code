package Trees.BST;

public class Traversal {
	public static void inorder(Node n){
		if(n != null)
		{
			inorder(n.left);
			System.out.print(n.data + " ");
			inorder(n.right);
		}
	}
	public static void preorder(Node n){
		if(n != null)
		{
			System.out.print(n.data + " ");
			inorder(n.left);
			inorder(n.right);
		}
	}
	public static void postorder(Node n){
		if(n != null)
		{
			inorder(n.left);
			inorder(n.right);
			System.out.print(n.data + " ");
		}
	}
}
