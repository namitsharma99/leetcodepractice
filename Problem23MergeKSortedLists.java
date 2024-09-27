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
class Problem23MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode itr = null;

        if (lists == null)
            return itr;

        List<Integer> ls = new ArrayList<Integer>();

        for (ListNode list : lists) {

            while (list != null) {
                ls.add(list.val);
                list = list.next;
            }

        }

        Collections.sort(ls);

        if (ls != null && ls.size() > 0) {
            itr = new ListNode(ls.get(0));
        }

        ListNode result = itr;

        for (int i = 1; i < ls.size(); i ++) {
            //System.out.print(i + " , ");
            ListNode tempNode = new ListNode(ls.get(i));
            itr.next = tempNode;
            itr = itr.next;
        }
        

        return result;
    }
}
