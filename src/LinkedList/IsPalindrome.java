package LinkedList;
import java.util.*;

public class IsPalindrome {

	public static void main(String[] args) {
		Node head = Node.CreateLinkedList(new int[] {1,2,3,2,1,3});
		System.out.print(isPalindrome(head));
	}
	public static boolean isPalindrome(Node head) {
		Stack<Integer> stack = new Stack<>();
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null)
		{
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast == null)
			stack.pop();
		slow = slow.next;
		while(slow != null)
		{
			if(stack.isEmpty() || stack.pop() != slow.data)
				return false;
			slow = slow.next;
		}
		return true;
	}
}
