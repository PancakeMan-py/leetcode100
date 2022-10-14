import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CoinChange {
    int res = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        if(coins.length == 0){
            return -1;
        }

        findWay(coins,amount,0);

        // 如果没有任何一种硬币组合能组成总金额，返回 -1。
        if(res == Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }

    public void findWay(int[] coins,int amount,int count){
        if(amount < 0){
            return;
        }
        if(amount == 0){
            res = Math.min(res,count);
        }

        for (int coin : coins) {
            findWay(coins, amount - coin, count + 1);
        }
    }



    @Test
    void CoinChangeTest(){
        int[] nums = new int[]{1,5,10};
        int result = coinChange(nums,12);
        Assertions.assertEquals(3, result);

    }
}
