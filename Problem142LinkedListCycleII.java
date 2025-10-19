/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Problem142LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {


        if (head == null || head.next == null)
            return null;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;


            if (fast == slow) {
                
                while (head != slow) {
                
                    head = head.next;
                    slow = slow.next;
                
                }

                return head;

            }

        }
        
        return null;
    }
}
