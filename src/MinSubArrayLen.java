public class MinSubArrayLen {

    private int minSubArrayLen(int target, int[] nums) {
        int minLen = nums.length;
        int len;
        int sum = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                len = right - left + 1;
                minLen = Math.min(len,minLen);
                sum -= nums[left];
                left++;
            }
        }
        return minLen;
    }
}
