package LinkedList;

public class mergeTwoSortedLists {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }
}
/*
Input Example
list1 = [1,2,4]
list2 = [1,3,4]

Linked lists:

list1 → 1 → 2 → 4
list2 → 1 → 3 → 4

Goal:

1 → 1 → 2 → 3 → 4 → 4
Initial Setup

From your code:

ListNode dummy = new ListNode(-1);
ListNode curr = dummy;

Structure:

dummy → -1

Pointers:

curr = dummy
list1 → 1 → 2 → 4
list2 → 1 → 3 → 4
Iteration 1

Condition:

while(list1 != null && list2 != null)

Compare:

list1.val = 1
list2.val = 1

Since:

1 <= 1

Execute:

curr.next = list1

List becomes:

dummy → 1

Move pointers:

list1 = list1.next → 2 → 4
curr = curr.next → 1

Current state:

dummy → 1
list1 → 2 → 4
list2 → 1 → 3 → 4
Iteration 2

Compare:

list1.val = 2
list2.val = 1

Since:

1 < 2

Execute:

curr.next = list2

List becomes:

dummy → 1 → 1

Move pointers:

list2 = 3 → 4
curr = second 1

State:

dummy → 1 → 1
list1 → 2 → 4
list2 → 3 → 4
Iteration 3

Compare:

list1.val = 2
list2.val = 3

Since:

2 < 3

Execute:

curr.next = list1

List becomes:

dummy → 1 → 1 → 2

Move pointers:

list1 = 4
curr = 2
Iteration 4

Compare:

list1.val = 4
list2.val = 3

Since:

3 < 4

Execute:

curr.next = list2

List becomes:

dummy → 1 → 1 → 2 → 3

Move pointers:

list2 = 4
curr = 3
Iteration 5

Compare:

list1.val = 4
list2.val = 4

Since:

4 <= 4

Execute:

curr.next = list1

List becomes:

dummy → 1 → 1 → 2 → 3 → 4

Move pointers:

list1 = null
curr = 4
Exit Loop

Loop stops because:

list1 == null

Now execute:

curr.next = list2

Remaining nodes:

4

Final list:

dummy → 1 → 1 → 2 → 3 → 4 → 4
Return Statement
return dummy.next;

We skip the dummy node.

Final result:

1 → 1 → 2 → 3 → 4 → 4

Output:

[1,1,2,3,4,4]
Visual Summary

Before:

list1 → 1 → 2 → 4
list2 → 1 → 3 → 4

Merged:

1 → 1 → 2 → 3 → 4 → 4
*/