package LinkedList;

public class removeDuplicatesSortedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val;this.next=next;}
    }
    public ListNode deleteDuplicates(ListNode head){
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    } 
}
/*
[1,1,2]
curr=1(head)
1!=null && 1!=null
1==1
curr.next(1)=curr.next.next(2)
1!=null && 2!=null
1==2(wrong)
go to else
curr(2)=curr.next(null)
so stop here
*/