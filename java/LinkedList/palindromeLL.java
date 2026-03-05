package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class palindromeLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        int left=0;
        int right=list.size()-1;
        while(left<right){
            if(list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
/*
[1,2,2,1]

Stored in list:

[1,2,2,1]

Comparison:

1 == 1 ✔
2 == 2 ✔
*/