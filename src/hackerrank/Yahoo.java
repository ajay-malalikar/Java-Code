package hackerrank;
import LinkedList.*;

public class Yahoo {
	public static void main(String[] args){
		Node head = Node.CreateLinkedList(new int[] {1,2,3,4,5});
		Node n = clone(head);
		Node.printList(n);
	}
	public static Node clone(Node head){
	    if(head == null){
	        return head;
	    }
	    Node newHead=null, newCur=null, cur = head;
	    while(cur!=null){
	        if(newHead == null){
	            newHead = new Node(cur.data);
	            newCur = newHead;
	        }
	        else{
	            newCur.next = new Node(cur.data);
	            newCur = newCur.next;
	        }
	        cur = cur.next;
	    }
	    return newHead;
	}
}