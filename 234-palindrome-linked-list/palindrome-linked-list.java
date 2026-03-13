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
    public boolean isPalindrome(ListNode head) {
       ListNode mid = middleNode(head);
       ListNode headSecond = reverseList(mid);
       ListNode rereverseHead = headSecond;

        while(head !=null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return (head == null || headSecond == null);
    }

    private ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        if(head == null){
            return head;
        }

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            } 
        }
         return prev;
    }
}