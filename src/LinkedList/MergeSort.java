package LinkedList;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node l1 = Node.CreateLinkedList(new int[] {9,8,7,6,5,4,3,2,1});
		Node.printList(mergeSort(l1));
	}
	
	public static Node mergeSort(Node head) {
		if(head == null || head.next == null)
			return head;
		Node slow = head, fast = head, a = head, b = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		b = slow.next;
		slow.next = null;
		a = mergeSort(a);
		b = mergeSort(b);
		head = SortedMerge.sortedMerge(a, b);
		return head;
	}
}
