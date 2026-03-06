package LinkedList;

public class intersectionOfTwoLL {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode Pa=headA;
        ListNode Pb=headB;
        while(Pa!=Pb){
            if(Pa==null){
                Pa=headB;
            }else{
                Pa=Pa.next;
            }
            if(Pb==null){
                Pb=headA;
            }else{
                Pb=Pb.next;
            }
        }
        return Pa;
    }
}
