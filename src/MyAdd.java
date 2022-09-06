import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MyAdd {
    public int myAdd(int num){
        int result = 0;
        for(int i = 0; i < num; i++){
            result += i;
        }
        return result;
    }

    @Test
    void testMyAdd(){
        int num = 10;
        int act = 100;
        int result = myAdd(num);
        assertEquals(45,result);
    }


}
