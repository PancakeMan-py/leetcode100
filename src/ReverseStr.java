public class ReverseStr {
    public String reverseStr(String s, int k) {
        int left = 0;
        int right = 1;

        char[] ch = s.toCharArray();

        while(left < right && right < s.length()){
            char temp;
            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left += 2*k;
            right += 2*k;
        }

        return new String(ch);
    }


}
