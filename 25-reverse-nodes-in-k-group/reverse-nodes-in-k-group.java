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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(true){

            // check if k nodes exist
            ListNode temp = curr;
            int count = 0;
            while(temp != null && count < k){
                temp = temp.next;
                count++;
            }

            if(count < k){
                break;
            }

            ListNode last = prev;
            ListNode newEnd = curr;

            for(int i = 0; curr != null && i < k; i++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = curr;
            prev = newEnd;
        }

        return head;
    }
}