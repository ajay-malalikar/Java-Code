package DoublyLinkedList;

public class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data = data;
		this.left = this.right = null;
	}
	
	public static Node pushRight(Node head, int data){
		Node newN = new Node(data);
		if(head == null){
			return newN;
		}
		Node cur = head;
		while(cur.right != null){
			cur = cur.right;
		}
		cur.right = newN;
		newN.left = cur;
		return head;
	}
	
	public static Node pushLeft(Node head, int data){
		Node newN = new Node(data);
		if(head == null){
			return newN;
		}
		newN.right = head;
		head.left = newN;
		return newN;
	}
	
	public static Node removeLeft(Node head){
		if(head == null)
			return null;
		head = head.right;
		head.left = null;
		System.gc();
		return head;
	}
	
	public static Node removeRight(Node head){
		if(head == null)
			return null;
		if(head.right == null)
		{
			return null;
		}
		Node cur = head;
		while(cur.right.right != null){
			cur = cur.right;
		}
		cur.right = null;
		System.gc();
		return head;
	}
	
	public static Node deleteNode(Node head, int data){
		if(head == null){
			return head;
		}
		if(head.data == data){
			head = head.right;
			head.left = null;
			return deleteNode(head, data);
		}
		Node cur = head.right;
		Node prev = head;
		while(cur != null){
			if(cur.data == data){
				cur = cur.right;
				cur.left = prev;
				prev.right = cur;
			}
			prev = cur;
			cur = cur.right;
		}
		return head;
	}
	
	public static Node createDllFromArray(int[] arr){
		if(arr == null || arr.length == 0){
			return null;
		}
		Node cur = null, head = null;
		for(int i : arr){
			Node n = new Node(i);
			if(cur == null){
				cur = head = n;
			}
			else{
				cur.right = n;
				n.left = cur;
				cur = n;
			}
		}
		return head;
	}
	
	public static void displayDll(Node head){
		while(head != null){
			System.out.print(head.data + " ");
			head = head.right;
		}
	}
}
