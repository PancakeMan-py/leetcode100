import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RemoveLinkedListElements {

    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    private ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode sentinal = new ListNode(-1, head);
        ListNode cur = sentinal.next;

        while(cur != null){
            if(cur.val == val){
                cur = cur.next;
            }
        }

        return sentinal.next;
    }


    @Test
    void testRemoveElements(){
        ListNode tail = new ListNode(3);
        ListNode two = new ListNode(2, tail);
        ListNode head = new ListNode(1, two);

        ListNode result = removeElements(head,2);
        assertEquals(two, result);

    }
}
