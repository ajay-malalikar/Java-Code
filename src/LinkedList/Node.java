package LinkedList;

public class Node {
	int data;
	Node next;
	public Node(int val) {
		this.data = val;
		this.next = null;
	}
	public Node() {
		this.data = Integer.MAX_VALUE;
		this.next = null;
	}
	
	public static Node CreateLinkedList(int[] elems) {
		if(elems.length == 0)
			return null;
		Node head = new Node(elems[0]);
		Node cur = head;
		for(int i=1; i<elems.length; i++) {
			cur.next = new Node(elems[i]);
			cur = cur.next;
		}
		return head;
	}
	public static void printList(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	public static int len(Node head) {
		int len = 1;
		if(head == null) return 0;
		while(head != null)
		{
			len++;
			head = head.next;
		}
		return len;
	}
}
