package LinkedList;

public class lLCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
/*
1️⃣ How -4 becomes connected to 2

In the example:

head = [3,2,0,-4], pos = 1

pos = 1 means:

The tail node should connect back to the node at index 1.

Indexes of the list:

Index:   0   1   2   3
Nodes:   3 → 2 → 0 → -4

Because pos = 1, the last node -4 points back to node 2.

So the list becomes:

3 → 2 → 0 → -4
    ↑        ↓
    ← ← ← ← ←

In memory (pointers):

3.next  = 2
2.next  = 0
0.next  = -4
-4.next = 2   ← this creates the cycle

Important:
We did not create this connection in our code.
The problem statement already gives the list like this internally.

Our job is only to detect if a cycle exists.

2️⃣ Example WITHOUT a Cycle

Example:

1 → 2 → 3 → 4 → null

Here the last node points to null, meaning the list ends.

Memory pointers:

1.next = 2
2.next = 3
3.next = 4
4.next = null
3️⃣ Slow/Fast Pointer Movement (No Cycle Case)

Start:

slow = 1
fast = 1
Step 1

Slow moves 1 step
Fast moves 2 steps

slow = 2
fast = 3

Diagram:

1 → 2 → 3 → 4 → null
    ↑     ↑
   slow  fast
Step 2
slow = 3
fast = null

Because:

3.next.next
= (3 → 4) → null

Diagram:

1 → 2 → 3 → 4 → null
          ↑
         slow

Now fast == null, so the loop stops.

Return:

false

No cycle.

4️⃣ Why fast becomes null

Look at this line:

fast = fast.next.next;

If fast is at 3:

3 → 4 → null

So:

fast.next = 4
fast.next.next = null

Therefore:

fast = null
5️⃣ Why the Algorithm Works

Two cases:

Case 1 — No Cycle
1 → 2 → 3 → 4 → null

Fast pointer eventually hits null.

Return false.

Case 2 — Cycle Exists
3 → 2 → 0 → -4
    ↑        ↓
    ← ← ← ← ←
*/