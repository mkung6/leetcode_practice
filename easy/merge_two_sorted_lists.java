// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

// Example:

// Input: 1->2->4, 1->3->4
// Output: 1->1->2->3->4->4


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode sorted = new ListNode(0);
        ListNode sortedPointer = sorted;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while(p1 != null || p2 != null) {
            if(p1 != null && p2 != null) {
                if(p1.val < p2.val) {
                    sortedPointer.val = p1.val;
                    p1 = p1.next;
                }
                else {
                    sortedPointer.val = p2.val;
                    p2 = p2.next;
                }
            }
            else if(p1 == null) {
                sortedPointer.val = p2.val;
                p2 = p2.next;
            }
            else {
                sortedPointer.val = p1.val;
                p1 = p1.next;
            }
            if(p1 != null || p2 != null) {
              sortedPointer.next = new ListNode(0);
              sortedPointer = sortedPointer.next;  
            }
            
        }
        return sorted;
    }
}
