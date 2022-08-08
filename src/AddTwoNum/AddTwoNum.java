package AddTwoNum;

public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //sentinal node
        ListNode sentinal = new ListNode(-1);
        //if a carry needed
        boolean carry = false;
        //sum of two node
        int sum = 0;
        int iniSum = 0;
        //irritated pointer
        ListNode node = sentinal;

        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            //sum before carry
            iniSum = carry ? val1 + val2 + 1: val1 + val2 ;
            sum = iniSum % 10;
            int finalSum = sum;
            carry = iniSum >= 10;
            node.next = new ListNode(finalSum);
            node = node.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            else{
                l1 =null;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            else{
                l2 = null;
            }
        }

        if (carry) {
            node.next = new ListNode(1);
        }

        return sentinal.next;
    }
}
