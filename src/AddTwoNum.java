public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //sentinel node
        ListNode sentinel = new ListNode(-1);
        //if a carry needed
        boolean carry = false;
        //sum of two node
        int sum ;
        int iniSum ;
        //irritated pointer
        ListNode node = sentinel;

        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            //sum before carry
            iniSum = carry ? val1 + val2 + 1: val1 + val2 ;
            sum = iniSum % 10;
            int finalSum = sum;
            carry = iniSum >= 10;
            //sentinel node changed from -1,null to -1,next
            node.next = new ListNode(finalSum);
            node = node.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry) {
            node.next = new ListNode(1);
        }

        return sentinel.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
