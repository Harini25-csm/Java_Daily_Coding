package LinkedList;

public class addTwoNum {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
        }
        return dummy.next;
    }
}
/*
Input Example
l1 = [2,4,3]
l2 = [5,6,4]

Remember: the digits are stored in reverse order.

So the numbers are:

l1 → 2 → 4 → 3   = 342
l2 → 5 → 6 → 4   = 465

Real addition:

342 + 465 = 807

Expected output:

[7,0,8]
Initial State

From your code:

ListNode dummy = new ListNode(0);
ListNode current = dummy;
int carry = 0;

List currently:

dummy → 0

Pointers:

l1 → 2 → 4 → 3
l2 → 5 → 6 → 4
Iteration 1

Loop condition:

l1 != null OR l2 != null OR carry != 0
Step 1: sum
sum = carry
sum = 0

Add l1 value:

sum = 0 + 2 = 2

Add l2 value:

sum = 2 + 5 = 7
Carry
carry = sum / 10
carry = 7 / 10 = 0
Node value
sum % 10 = 7

Create node:

current.next = new ListNode(7)

Result list:

dummy → 7

Move pointer:

current = 7

Move lists:

l1 → 4 → 3
l2 → 6 → 4
Iteration 2
sum
sum = carry = 0
sum = 0 + 4 = 4
sum = 4 + 6 = 10
carry
carry = 10 / 10 = 1
node value
10 % 10 = 0

Create node:

current.next = 0

List becomes:

dummy → 7 → 0

Move pointers:

current = 0
l1 → 3
l2 → 4
Iteration 3
sum
sum = carry = 1
sum = 1 + 3 = 4
sum = 4 + 4 = 8
carry
carry = 8 / 10 = 0
node value
8 % 10 = 8

Create node:

current.next = 8

List becomes:

dummy → 7 → 0 → 8

Move pointers:

l1 → null
l2 → null
Loop Ends

Condition now:

l1 == null
l2 == null
carry == 0

Loop stops.

Return:

return dummy.next;

We skip dummy.

Final Output
7 → 0 → 8
*/