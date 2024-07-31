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
class Problem234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        
        String str = "";

        if (head == null || head.next == null) {
            return true;
        }

        while (head.next != null) {
            str = str + head.val;
            head = head.next;
        }
        if (head != null) {
            str = str + head.val;
        }

        // System.out.println(str);
        int len = str.length();
        for (int i=0, j=len-1; i <=len/2 && j>=i; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }

        return true;

    }
}
