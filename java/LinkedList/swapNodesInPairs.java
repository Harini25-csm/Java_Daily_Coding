package LinkedList;

public class swapNodesInPairs {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val;this.next=next;}
    }
    public ListNode swapPairs(ListNode head) {
        // Base case: if list is empty or only one node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        // Swap
        first.next = swapPairs(second.next);
        second.next = first;

        // New head becomes second
        return second;
    }
}
/*
Step 1️⃣ First Call
swapPairs(1 → 2 → 3 → 4)

Check base condition:

head != null
head.next != null

So continue.

first = 1
second = 2

Now recursion:

first.next = swapPairs(3 → 4)
Step 2️⃣ Second Call
swapPairs(3 → 4)

Again:

first = 3
second = 4

Recursive call:

first.next = swapPairs(null)

because second.next = null.

Step 3️⃣ Third Call (Base Case)
swapPairs(null)

Condition:

head == null

Return:

null
Step 4️⃣ Back to Second Call

Now:

first = 3
second = 4

Execute:

Line 1
first.next = null

List becomes:

3 → null
Line 2
second.next = first

Now:

4 → 3 → null

Return:

4
Step 5️⃣ Back to First Call

Now we have:

first = 1
second = 2

From recursion we received:

4 → 3

Execute:

Line 1
first.next = 4

Now:

1 → 4 → 3
Line 2
second.next = first

Now:

2 → 1 → 4 → 3

Return:

2
Final Result
2 → 1 → 4 → 3
Visual Flow
swapPairs(1,2,3,4)
        |
        v
swapPairs(3,4)
        |
        v
swapPairs(null)
        |
        v
Return null
        |
        v
4 → 3
        |
        v
2 → 1 → 4 → 3
*/