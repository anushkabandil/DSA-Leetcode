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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(n<=0 || head == null){
            return head;
        }
        int length = 0;
        ListNode node = head;
        while(node != null){
            length++;
            node = node.next;
        }

        if(n == length){
            return head.next;
        }

        ListNode last = head;
        for(int i=0; i< length-n-1; i++){
            last = last.next;
        }
        last.next = last.next.next;
        // if(last != null && last.next != null){
        //      last.next = last.next.next;
        // }
        return head;
        
    }
}