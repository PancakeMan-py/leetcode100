public class IsHappy {
    public boolean isHappy(int num){
        int slow = getNext(num);
        int fast = getNext(getNext(num));

        boolean result = false;

        while(slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
            if(fast == 1){
                return true;
            }
    }
        return false;
    }

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
}
