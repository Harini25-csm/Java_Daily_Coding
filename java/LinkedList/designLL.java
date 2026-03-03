package LinkedList;
class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head=null;
        size=0; 
    } 
    
    public int get(int index) { 
        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        size++;
    }
/*
newNode
   ↓
+--------+--------+
|   1    |  null  |
+--------+--------+
newNode.next = head;
head → null
1.next = null
No change visually.
head = newNode;
head
  ↓
+--------+--------+
|   1    |  null  |
+--------+--------+
1 → null
*/
    public void addAtTail(int val) { 
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }
/*
+--------+--------+
|   3    |  null  |
+--------+--------+
Node temp = head;
So:
temp → 1
Then:
while(temp.next != null)
Check:
1.next = null
So loop does NOT run.
Then:
temp.next = newNode;
Before:
1 → null
After:
1 → 3 → null
Visually:
head
  ↓
+---+---+      +---+---+
| 1 | ● | ---> | 3 |null|
+---+---+      +---+---+
Size = 2
*/
    public void addAtIndex(int index ,int val) {
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
/*
Current list:
1 → 3
We want:
1 → 2 → 3
Line 1
Node newNode = new Node(2);
Create:
+---+---+
| 2 |null|
+---+---+
Find position
Node temp = head;
temp → 1
Loop:
for(int i=0; i<index-1; i++)
index = 1
index-1 = 0
So loop does NOT run.
So:
temp → 1
Now important line
newNode.next = temp.next;
What is temp.next?
1.next = 3
So:
2.next = 3
Now memory:
2 → 3
But 1 still points to 3.
Final linking
temp.next = newNode;
So:
1.next = 2
Now list becomes:
1 → 2 → 3
Diagram:
head
 ↓
+---+---+    +---+---+    +---+---+
| 1 | ● | -> | 2 | ● | -> | 3 |null|
+---+---+    +---+---+    +---+---+
Size = 3
*/
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return ;
        }
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    } 
}