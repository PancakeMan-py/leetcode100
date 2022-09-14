import org.junit.jupiter.api.Test;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n){
        int size = 0;
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;

        ListNode cur = head;
        ListNode cur1 = head;


        while(cur != null){
            size++;
            cur = cur.next;
        }

        int NthNum = (size-n+1)-1;

        if(NthNum < 0 || NthNum > size){
            return null;
        }

        if(NthNum == 0 && size == 1){
            return null;
        }



        int index = 0;
        while(index < NthNum && cur1.next != null){
            cur1 = cur1.next;
            index++;
        }

        cur1.next = cur1.next.next;

        return sentinel.next;

    }

    @Test
    void testRemoveNthFromEnd(){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;


        ListNode result = removeNthFromEnd(head, 2);


    }
}
