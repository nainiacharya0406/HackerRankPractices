public class Solution3 {

	public static void main(String args[]) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(5);		
		ListNode list = addTwoNumbers(l1, l2);
		System.out.println(list.data);
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum1 = 0;
		ListNode l3 = new ListNode(0);
		ListNode curr = l3;
		while(l1 != null) {
			sum1  = l1.data +l2.data;
			l3.data = sum1;
			curr = curr.next;
			l1 = l1.next; l2 = l2.next;
			return l3;
		}
		return null;
	}
}
