import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);


        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -nums[i];
            int left = i;
            int right = nums.length - 1;
            while(left < right){
                if(nums[left] + nums[right] < target){
                    left ++;
                }
                if(nums[left] + nums[right] > target){
                    right --;
                }
                if(nums[left] + nums[right] == target){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);

                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;

                    left ++;
                    right--;
                }
            }
        }

        return ans;

    }

}
