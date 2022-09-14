public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        //connect dummy node and head.
        ListNode sentinal = new ListNode(-1);
        ListNode prev = sentinal;
        sentinal.next = head;


        while(head != null){
            //connect sentinal and second node
            prev.next = head.next;

            //connect the second node to first node
            head.next.next = head;

            //connect the first node to third node
            head.next = head.next.next;

            //next node
            head = head.next;
            prev = prev.next;
        }

        return sentinal.next;
    }
}
