package RemoveElement;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = nums.length ;
        int j = len - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                while(nums[j] == val){
                    if(j<=0){return 0;}
                    if(j==i){return i;}
                    j--;
                }
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            if(i == j-1 && nums[j] == val){
                if(nums[i] == val){
                    return i;
                }
                else {
                    return i+1;
                }}
        }
        return len;
    }
    //need to consider couple special cases
    //i和j相遇时有两种情况，第一，i等于val，此时返回i，第二种，i不等于val，此时返回i+1。


    @Test
    void removeElementTest(){
        int[] nums = new int[]{2,2,3};
        int val = 2;
        int result = removeElement(nums,val);
        assertEquals(1,result);

    }
}
