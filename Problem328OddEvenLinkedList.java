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
class Problem328OddEvenLinkedList
 {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode temp = evenNode;
        
        while (evenNode != null && evenNode.next != null) {
            oddNode.next = evenNode.next;
            oddNode =  oddNode.next;
            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }


        oddNode.next = temp;

        return head;
    }
}
