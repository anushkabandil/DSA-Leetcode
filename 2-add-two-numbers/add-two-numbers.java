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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode f = l1;
        ListNode s = l2;

        ListNode dummy = new ListNode();
         ListNode temp = dummy;
         int carry = 0;
         

         while(f != null || s != null || carry>0){
            int sum = 0;

            if(f != null){
                sum = sum + f.val;
                f = f.next;
            }
             if(s != null){
                sum = sum + s.val;
                s = s.next;
            }
            sum = sum + carry;
            carry = sum/10;

            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
            
         }
        return dummy.next;
    }
}