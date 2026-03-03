package LinkedList;

class Solution {
//Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
/*
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Input:
1 → 2 → 3 → 4 → 5
Start
slow → 1
fast → 1
Step 1
Move slow 1 step:
slow → 2
Move fast 2 steps:
fast → 3
Step 2
Move slow:
slow → 3
Move fast:
fast → 5
Step 3
Move slow:
slow → 4
Move fast:
fast → null
Loop stops.
Return slow:
3
*/
