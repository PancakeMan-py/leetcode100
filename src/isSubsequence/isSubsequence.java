package isSubsequence;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        Map<Character, Integer> mapT = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            mapT.put(t.charAt(i), i);
        }

        int lastIndex = -1;
        int nextIndex = -2;
        for(int i=0; i<s.length(); i++){
            if(!mapT.containsKey(s.charAt(i))) return false;
            else{
                if(mapT.get(t.charAt(i)) <= lastIndex){
                    return false;
                }
                lastIndex = mapT.get(s.charAt(i));
            }

        }

        return true;
    }

    @Test
    void isSubsequenceTest(){
        String s = "aaaaaa", t = "bbaaaa";
        boolean result = isSubsequence(s,t);
        assertEquals(false,result);
    }
}
