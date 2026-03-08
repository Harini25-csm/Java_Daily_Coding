package LinkedList;

public class oddEvenLL {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val;this.next=next;}
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
/*
Example

Input

1 → 2 → 3 → 4 → 5

Index positions

1   2   3   4   5
O   E   O   E   O

Goal:

1 → 3 → 5 → 2 → 4
Step 1 — Initialize Pointers
1 → 2 → 3 → 4 → 5
↑   ↑
odd even
odd = 1
even = 2
evenHead = 2
Step 2 — First Iteration
Move odd pointer
odd.next = even.next
1 → 3 → 4 → 5
2 → 3 → 4 → 5

Move odd forward:

odd = 3

Structure now:

1 → 3 → 4 → 5
2 → 3 → 4 → 5
Move even pointer
even.next = odd.next
2 → 4 → 5

Move even forward:

even = 4

Now list looks like:

Odd chain : 1 → 3 → 4 → 5
Even chain: 2 → 4 → 5
Step 3 — Second Iteration
Move odd
odd.next = even.next
3.next = 5

List becomes:

1 → 3 → 5

Move odd forward:

odd = 5
Move even
even.next = odd.next
4.next = null

Move even:

even = null

Loop stops.

Step 4 — Connect Odd and Even Lists
odd.next = evenHead
5.next = 2

Final list:

1 → 3 → 5 → 2 → 4
Final Output
[1,3,5,2,4]
*/