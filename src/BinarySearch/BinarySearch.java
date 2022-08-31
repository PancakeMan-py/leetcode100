package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearch {
    public int bruteForceSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int mid = 0;

        while (left <= right){
            mid = left + (right-left)/2;
            if(nums[mid]<target){
                left = mid+1;
            }
            if(nums[mid]>target){
                right = mid-1;
            }
            if(nums[mid]==target){
                return mid;
            }
        }
        return -1;
    }

@Test
    void bruteForceSearchTest(){
    int[] nums = new int[]{1,2,3,4,5,9,11};
    int result = binarySearch(nums,3);
    assertEquals(2,result);

}}