package LinkedList;

public class reverseOfLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
/*
1 → 2 → 3 → null
🌟 First Understand What Each Variable Means
ListNode prev = null;
ListNode curr = head;
prev → will store the reversed part
curr → current node we are processing
next → temporary storage (so we don’t lose the rest of the list)
🌟 Initial State
Input:
head → 1 → 2 → 3 → null
Before loop:
prev → null
curr → 1
🔁 ITERATION 1
Current situation:
prev → null
curr → 1 → 2 → 3 → null
Step 1
ListNode next = curr.next;
Save next node.
next → 2 → 3 → null
Why?
Because we are about to break the link of 1.
Step 2
curr.next = prev;
Change arrow of current node.
Before:
1 → 2
After:
1 → null
Now memory:
prev → null
curr → 1 → null
next → 2 → 3
We reversed first link.
Step 3
prev = curr;
Move prev forward.
prev → 1 → null
Step 4
curr = next;
Move curr forward.
curr → 2 → 3 → null
🔁 ITERATION 2
Now:
prev → 1 → null
curr → 2 → 3 → null
Step 1
next = curr.next;
next → 3 → null
Step 2
curr.next = prev
Before:
2 → 3
After:
2 → 1 → null
Now:
prev → 1 → null
curr → 2 → 1 → null
next → 3
Step 3
prev = curr;
prev → 2 → 1 → null
Step 4
curr = next;
curr → 3 → null
🔁 ITERATION 3
Now:
prev → 2 → 1 → null
curr → 3 → null
Step 1
next = curr.next;
next → null
Step 2
curr.next = prev;
Before:
3 → null
After:
3 → 2 → 1 → null
Step 3
prev = curr;
prev → 3 → 2 → 1 → null
Step 4
curr = next;
curr → null
🔁 LOOP ENDS
Because:
curr == null
🌟 Final Step
return prev;
Return:
3 → 2 → 1 → null
*/