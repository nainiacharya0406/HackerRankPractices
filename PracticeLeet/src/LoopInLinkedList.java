import java.util.LinkedList;

public class LoopInLinkedList {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int x) { 
			data = x; 
			next = null;
		}
	}
	static int detectLoop(Node head) {
		Node slowpntr = head;
		Node fastptr = head;
		while(slowpntr!=null && fastptr.next !=null) {
			slowpntr = slowpntr.next;
			fastptr = fastptr.next.next;
			if(slowpntr == fastptr) {
				return slowpntr.data;
			}
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node l1 = new Node(1);
		Node head = l1;
		l1.next = new Node(2);	
		l1.next.next = new Node(3);
		l1.next.next.next = new Node(4);
		l1.next.next.next.next = new Node(5);
		head.next.next.next = head;
		int nodeLoop = detectLoop(head);
		System.out.println(nodeLoop);
		
		
		

	}

}