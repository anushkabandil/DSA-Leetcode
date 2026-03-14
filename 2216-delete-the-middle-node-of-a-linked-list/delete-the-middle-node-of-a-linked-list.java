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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
       ListNode mid = middleNode(head);

       int length = findLength(head);
       ListNode last = head;
        for(int i=0; i< length/2-1; i++){
            last = last.next;
        }
        last.next = mid.next;
        return head;
        
    }

    private ListNode middleNode(ListNode head){
         ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private int findLength(ListNode head){
        int len = 0;
        ListNode node = head;
        while(node != null ){
            len++;
            node = node.next;
        }
        return len;
    }
}