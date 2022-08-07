package AddTwoNum;

class AddTwoNumInt {
    public String addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = GetNum(l1);
        int num2 = GetNum(l2);

        Integer num = num1+num2;
        String output = num.toString();
        return output;
    }

    public int GetNum (ListNode l){
        int count = 1;
        int num = l.val*count;
        while(l.next != null){
            count = count*10;
            l = l.next;
            num += l.val*count;
        }
        return num;
    }
}