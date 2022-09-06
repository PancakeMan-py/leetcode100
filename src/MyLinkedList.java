import org.junit.jupiter.api.Test;

public class MyLinkedList {

    int size;
    ListNode sentinal;

    public MyLinkedList() {
        size = 0;
        sentinal = new ListNode(-1);
    }


    public int get(int index) {
        int count = 0;
        if(index < 0 || index+1 > size){
            return -1;
        }
        ListNode cur = sentinal;


        while(count <= index){
            cur = cur.next;
            count++;
        }

        return cur.val;
    }



    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = sentinal.next;
        sentinal.next = newHead;
        size++;
    }

    public void addAtTail(int val) {
        ListNode newTail = new ListNode(val);
        int count = 0;
        ListNode cur = sentinal;

        while(count < size){
            cur = cur.next;
            count++;
        }
        cur.next = newTail;
        size++;
    }

    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val);

        int count = 0;
        ListNode cur = sentinal;
        while(count < index){
            cur = cur.next;
            count++;
        }

        newNode.next = cur.next;
        cur.next = newNode;
        size++;


    }

    public void deleteAtIndex(int index) {
        int count = 0;
        ListNode cur = sentinal;

        while(count < index){
            cur = cur.next;
            count++;
        }

        cur.next = cur.next.next;
        size--;

    }
}
