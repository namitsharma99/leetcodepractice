/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Problem25ReverseNodesInKGroup {
  
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k == 1)
            return head;

        // check to skip the tail < k in size
        ListNode temp = head;
        int count = 0;
        while(temp!=null && count<k) {
            temp = temp.next;
            count++;
        }
        if(count<k) return head; 
        
        ListNode prev = null, next = null; // dummy start
        ListNode curr = head;

        int counter = 0;

        while (curr != null && counter < k) {

            next = curr.next;
            curr.next = prev;
            prev = curr;

            curr = next;
            counter++;
        }

        ListNode pending = reverseKGroup(curr, k);
        head.next = pending;

        return prev; // as prev points to the reversed list's head

    }
}
