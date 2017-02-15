package LinkedList;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node l1 = Node.CreateLinkedList(new int[] {1,2,3,1,1});
		Node l2 = Node.CreateLinkedList(new int[] {9,9,9});
		// Node.printList(addReverse(l1, l2, 0));
		Node.printList(addStraight(l1, l2));
	}
	
	// First calculate sum then recurse.
	public static Node addReverse(Node l1, Node l2, int carry) {
		if(l1 == null && l2 == null && carry == 0)
			return null;
		int val = carry;
		carry = 0;
		if (l1 != null)
			val += l1.data;
		if(l2 != null)
			val += l2.data;
		if(val>9)
			carry = val/10;
		Node temp = new Node(val%10);
		temp.next = addReverse(l1 == null ? null : l1.next, l2 == null ? null:l2.next, carry);
		return temp;
	}
	
	// First recurse then calculate the sum.
	public static Node addStraight(Node l1, Node l2) {
		int m = Node.len(l1);
		int n = Node.len(l2);
		if(m > n) {
			l2 = addPadding(l2, m-n);
		}
		else if(n > m) {
			l1 = addPadding(l1, n-m);
		}
		return addStraightUtil(l1, l2, 0);
	}
	
	public static Node addStraightUtil(Node l1, Node l2, int carry) {
		if(l1 == null)
		{
			if(carry == 0) return null;
			Node temp = new Node(carry);
			return temp;
		}
		Node temp = new Node();
		temp.next = addStraightUtil(l1.next, l2.next, carry);
		int sum = carry + l1.data + l2.data;
		if(sum > 9) {
			carry = sum /10;
			sum  = sum % 10;
		}
		temp.data = sum;
		return temp;
	}
	
	public static Node addPadding(Node list, int count) {
		while(count != 0) {
			Node t = new Node(0);
			t.next = list;
			list = t;
			count --;
		}
		return list;
	}
}
