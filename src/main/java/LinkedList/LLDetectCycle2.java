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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
    //Step 1: Detect Cycle
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }

      //No Cycle
        if(fast==null || fast.next==null) return null;
      //Step 2 : Find start of cycle
        fast=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
        
    }
}
