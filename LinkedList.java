
public class LinkedList {
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    
    static void reversLinkedList(Node head){
        Node prev = null;
        Node cur = head;
        Node Next;
        while(cur!=null){
            Next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = Next; 
        }
    }

    

}
