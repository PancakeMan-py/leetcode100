import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

    public int lengthOfLongestSubstring1(String s) {
        if(s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0;
        int len = Integer.MIN_VALUE;

        while(right < s.length()) {
            Character ch = s.charAt(right);
            right += 1;
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            while(window.get(ch) > 1) {

                char ch1 = s.charAt(left);
                left += 1;
                window.put(ch1, window.get(ch1) - 1);
            }
            if(right - left > len) {
                len = right - left;
            }
        }
        return len == Integer.MIN_VALUE ? 0 : len;

    }
    @Test
    void testLengthOfLongestSubstring(){
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        assertEquals(3,result);
    }
}
