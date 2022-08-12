package isSubsequence;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class isSubsequence {
    public boolean isSubsequenceMethod(String s, String t) {
        int i = 0,j = 0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        if(i<s.length()){
            return false;
        }
        return true;
    }

    @Test
    void isSubsequenceTest(){
        String s = "abc", t = "ahbgdc";
        boolean result = isSubsequenceMethod(s,t);
        assertEquals(true,result);
    }
}
