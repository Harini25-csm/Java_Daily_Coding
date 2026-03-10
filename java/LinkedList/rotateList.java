/*
Correct Idea to Solve the Problem
To rotate a linked list right by k places:
Find the length of the list
Connect the last node to the head (make it circular)
Compute the new tail position
Break the circle.
Formula:
k=k%length
New tail position:
length−k−1
*/
package LinkedList;

public class rotateList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
    }
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: Find length
        ListNode curr = head;
        int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // Step 2: Make it circular
        curr.next = head;

        // Step 3: Reduce k
        k = k % length;

        int stepsToNewHead = length - k;

        // Step 4: Find new tail
        ListNode newTail = curr;

        while (stepsToNewHead > 0) {
            newTail = newTail.next;
            stepsToNewHead--;
        }

        // Step 5: Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

}
/*
head = [1,2,3,4,5]
k = 2

Initial Linked List

1 → 2 → 3 → 4 → 5 → null
Step 1: Find Length of the List

We traverse the list.

Node	length
1	1
2	2
3	3
4	4
5	5

Now:

length = 5
curr = 5 (last node)
Step 2: Make the List Circular

We connect the last node to the head.

1 → 2 → 3 → 4 → 5
↑                 ↓
└─────────────────┘

Now it is a circular linked list.

Step 3: Reduce k

Since rotating 5 times gives the same list, we reduce rotations.

k = k % length
k = 2 % 5 = 2
Step 4: Find New Tail

Formula:

stepsToNewHead = length - k
stepsToNewHead = 5 - 2 = 3

Start from the last node.

Move 3 steps.

Step	Node
1	1
2	2
3	3

Now:

newTail = 3
newHead = 4
Step 5: Break the Circle
newTail.next = null

Final List

4 → 5 → 1 → 2 → 3 → null
Final Output
[4,5,1,2,3]
Quick Visual Summary

Before Rotation

1 → 2 → 3 → 4 → 5

After Rotation (k = 2)

4 → 5 → 1 → 2 → 3
*/