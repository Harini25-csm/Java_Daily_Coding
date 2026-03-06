package LinkedList;

public class removeLLEle {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
/*
Example Input
head = [1,2,6,3,4,5,6]
val = 6

Linked list:

1 → 2 → 6 → 3 → 4 → 5 → 6

We must remove all nodes with value 6.

Step 1 — Remove val from the beginning

Code:

while(head != null && head.val == val)

Check head:

head = 1
val = 6

1 ≠ 6 → loop stops.

So head remains:

1 → 2 → 6 → 3 → 4 → 5 → 6
Step 2 — Start Traversal
curr = head
curr = 1
Step 3

Check:

curr.next.val
curr = 1
curr.next = 2

2 ≠ 6

Move forward:

curr = curr.next

Now:

curr = 2

List unchanged:

1 → 2 → 6 → 3 → 4 → 5 → 6
Step 4
curr = 2
curr.next = 6

Condition:

curr.next.val == val
6 == 6 ✔

Delete node:

curr.next = curr.next.next

So we skip node 6.

New list:

1 → 2 → 3 → 4 → 5 → 6

curr stays at 2.

Step 5
curr = 2
curr.next = 3

3 ≠ 6

Move forward:

curr = 3

List:

1 → 2 → 3 → 4 → 5 → 6
Step 6
curr = 3
curr.next = 4

4 ≠ 6

Move forward:

curr = 4
Step 7
curr = 4
curr.next = 5

5 ≠ 6

Move forward:

curr = 5
Step 8
curr = 5
curr.next = 6

6 == val

Delete:

curr.next = curr.next.next

Now:

1 → 2 → 3 → 4 → 5
Final Output
[1,2,3,4,5]
Visual Summary

Before:

1 → 2 → 6 → 3 → 4 → 5 → 6
        ❌               ❌

After:

1 → 2 → 3 → 4 → 5
Key Idea to Remember

We never delete the current node directly.

Instead we modify:

curr.next

This is the standard linked list deletion technique.
*/
