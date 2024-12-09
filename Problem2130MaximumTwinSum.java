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
class Problem2130MaximumTwinSum of a Linked List {
    public int pairSum(ListNode head) {
        
        if (head == null || head.next == null) {
            return 0;
        }

        List<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        
        int n = list.size();
        if (n == 2) {
            return list.get(0) + list.get(1);
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i< n/2 ; i++) {
            int pairSum = list.get(i) + list.get(list.size() - 1 - i);
            if (maxSum < pairSum) {
                maxSum = pairSum;
            }
        }

        return maxSum;
    }
}
