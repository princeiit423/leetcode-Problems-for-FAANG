//leetcode problem no. 23 -------- (Merge k sorted Lists)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++) {
            result = mergeList(result, lists[i]);
        }
        return result;
    }

    public ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        return temp.next;
    }
}