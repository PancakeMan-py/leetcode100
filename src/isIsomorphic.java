import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class isIsomorphic {
    public boolean isIsomorphicMethod(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character charS = s.charAt(i);
            Character charT = t.charAt(i);
            if(mapS.containsKey(charS)){
                if(mapS.get(charS) != charT){
                    return false;
                }
            }
            mapS.put(charS,charT);
        }

        Map<Character, Character> mapT = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character charS = s.charAt(i);
            Character charT = t.charAt(i);
            if(mapT.containsKey(charT)){
                if(mapT.get(charT) != charS){
                    return false;
                }
            }
            mapT.put(charT,charS);
        }
        return true;

    }

    public boolean isIsomorphic2(String s, String t) {
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }

    @Test
    void isIsomorphicMethodTest() {
        String s = "egg";
        String t = "app";
        boolean result = isIsomorphicMethod(s,t);
        assertEquals(true,result);
    }

    @Test
    void isIsomorphic2Test() {
        String s = "egg";
        String t = "app";
        boolean result = isIsomorphic2(s,t);
        assertEquals(false,result);
    }
}

