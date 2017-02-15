package LinkedList;

public class SortedMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node l1 = Node.CreateLinkedList(new int[] {1,3,5, 12});
		Node l2 = Node.CreateLinkedList(new int[] {2,4,6});
		Node.printList(sortedMerge(l1, l2));
	}
	public static Node sortedMerge(Node a, Node b) {
		Node res = new Node(Integer.MAX_VALUE);
		Node resCur = res;
		while(true) {
			if(a == null) {
				resCur.next = b;
				break;
			}
			if(b == null) {
				resCur.next = a;
				break;
			}
			if(a.data <= b.data) {
				resCur.next = a;
				a = a.next;
			}
			else {
				resCur.next = b;
				b = b.next;
			}
			resCur = resCur.next;
		}
		Node head = res.next;
		res.next = null;
		System.gc();
		return head;
	}
}
