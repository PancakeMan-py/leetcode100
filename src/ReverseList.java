public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode next = head.next;

        pre.next = null;

        while(next != null){
            cur.next = pre;
            pre = cur;
            next = next.next;
            cur = next;
        }

        return cur.next;
    }
}
