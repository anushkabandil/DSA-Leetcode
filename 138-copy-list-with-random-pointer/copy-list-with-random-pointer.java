/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

// class Solution {
//     public Node copyRandomList(Node head) {
//         if(head == null){
//             return null;
//         }
//  // Step 1: Create new nodes and insert them
//         Node temp = head;
//         while(temp != null){
//             Node copy = new Node (temp.val);
//             copy.next = temp.next;
//             temp.next = copy;

//             temp = copy.next; // or temp = temp.next.next;
//         }

//   // Step 2: Assign random pointers
//         temp = head;
//         while(temp != null){
//             if (temp.random != null) {
//                 temp.next.random = temp.random.next;
//             }
//             temp = temp.next.next;  // ✅ always move forward
//         }

//  // Step 3: Separate the lists
//         temp = head;
//         Node newHead = head.next;
//         while(temp != null){
//             Node copy = temp.next;
//             temp .next = copy.next;

//             if(copy.next != null){
//                 copy.next = copy.next.next;
//             }
//             temp = temp.next;
//         }
//        return newHead; 
//     }
// }


import java.util.HashMap;

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        // Step 1: Create all nodes
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Step 2: Assign next and random
        curr = head;
        while (curr != null) {
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}