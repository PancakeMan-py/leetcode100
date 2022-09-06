public class SwapPairs {
    public ListNode swapPairs(ListNode head) {

        if(head == null && head.next == null){
            return head;
        }

        int index = 1;
        ListNode pre = head;
        ListNode cur = pre.next;

        while(cur.next != null){
            if(index % 2 == 1){
                cur.next = pre;
                cur = pre.next.next;
                pre = pre.next;
            }else{
                cur = pre.next.next;
                pre = pre.next;
            }

            index++;
        }
        return pre;
    }
}
