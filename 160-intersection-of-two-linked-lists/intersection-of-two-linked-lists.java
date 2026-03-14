/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
        Set<ListNode> set = new HashSet<>();
        ListNode first = headA;
        ListNode second = headB;

        while(first != null){
            set.add(first);
            first = first.next;
        }
        while(second != null){
            if(set.contains(second)){
                return second;
            }
            second = second.next;
        }
        return null;
    }
}