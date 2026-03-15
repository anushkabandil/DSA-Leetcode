// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
//         Set<ListNode> set = new HashSet<>();
//         ListNode first = headA;
//         ListNode second = headB;

// // METHOD-1________________________________________
//         // while(first != null){
//         //     set.add(first);
//         //     first = first.next;
//         // }
//         // while(second != null){
//         //     if(set.contains(second)){
//         //         return second;
//         //     }
//         //     second = second.next;
//         // }
//         // return null;

// // METHOD-2_______________________________________________________
//         while(first != second){
//             if(first == null){
//                 first = headB;
//             }else first = first.next;

//             if(second == null){
//                 second = headA;
//             }else second = second.next;

//         }
//         // first == second : '==' comparator checks if both are pointing to the same object 
//         return first;
//     }
// }


// METHOD -3 OPTIMAL APPROACH
public class Solution {
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = findLength(headA);
        int length2 = findLength(headB);
        ListNode first = headA;
        ListNode second = headB;

        if(length1 > length2){
            int diff = length1 - length2;
            while(diff != 0){
                diff--;
                first = first.next;
             }
        }
        else {
           int diff = length2 - length1;
             while(diff != 0){
                diff--;
                second = second.next;
             }

         }
       
       while(first != second){
           first = first.next;
           second = second.next;
         }
         return first;

     }

     private int findLength(ListNode head){
        int len = 0;
        ListNode node = head;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
     }
}

