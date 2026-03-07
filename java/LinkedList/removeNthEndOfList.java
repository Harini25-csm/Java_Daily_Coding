package LinkedList;

public class removeNthEndOfList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
/*

Key Idea

We keep a distance of n nodes between fast and slow.

So when fast reaches the end of the list:

fast → null

slow will be exactly one node before the node we need to delete.

Example
head = 1 → 2 → 3 → 4 → 5
n = 2

We want to remove 4 (2nd from the end).

Step 1 — Move fast ahead n+1 steps
dummy → 1 → 2 → 3 → 4 → 5
 ↑
slow

Move fast 3 steps:

dummy → 1 → 2 → 3 → 4 → 5
 ↑           ↑
slow        fast

Now there is a gap of 3 nodes between them.

Step 2 — Move both together
Move 1
fast → 4
slow → 1
Move 2
fast → 5
slow → 2
Move 3
fast → null
slow → 3

Now:

1 → 2 → 3 → 4 → 5
        ↑
       slow
Why slow.next is the node to delete

Because the distance between fast and slow was fixed earlier.

When fast reaches the end:

slow.next = nth node from the end

So we remove it:

slow.next = slow.next.next

Result:

1 → 2 → 3 → 5
Important Insight

slow does not detect the node by value.

It works because of distance control.

We maintain:

distance(fast, slow) = n + 1

When fast reaches the end:

slow → node before nth from end
Simple Memory Trick

Think like this:

fast = runner
slow = follower

Runner starts n+1 steps ahead.*/