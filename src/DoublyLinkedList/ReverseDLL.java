package DoublyLinkedList;

public class ReverseDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = Node.createDllFromArray(new int[]{1,2});
		head = reverse(head);
		Node.displayDll(head);
	}
	public static Node reverse(Node head){
		if(head == null || head.right == null){
			return head;
		}
		Node cur = head, prev = null;
		while(cur != null){
			Node temp = cur.right;
			cur.right = prev;
			cur.left = temp;
			if(prev != null){
				prev.left = cur;
			}
			prev = cur;
			cur = temp;
		}
		return prev;
	}
}
