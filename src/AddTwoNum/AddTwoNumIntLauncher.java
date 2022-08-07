package AddTwoNum;

public class AddTwoNumIntLauncher {
    public static void main(String[] args) {
        AddTwoNumInt s = new AddTwoNumInt();
        ListNode listNode3 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(3,listNode2);

        ListNode listNode6 = new ListNode(4);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(6,listNode5);

        String output = s.addTwoNumbers(listNode1,listNode4);

        System.out.println(output);
    }}
