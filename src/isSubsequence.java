import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class isSubsequence {
        public boolean isSubsequenceMethod(String s, String t) {
            int n = s.length(), m = t.length();

            int[][] f = new int[m + 1][26];
            for (int i = 0; i < 26; i++) {
                f[m][i] = m;
            }

            for (int i = m - 1; i >= 0; i--) {
                for (int j = 0; j < 26; j++) {
                    if (t.charAt(i) == j + 'a')
                        f[i][j] = i;
                    else
                        f[i][j] = f[i + 1][j];
                }
            }
            int add = 0;
            for (int i = 0; i < n; i++) {
                if (f[add][s.charAt(i) - 'a'] == m) {
                    return false;
                }
                add = f[add][s.charAt(i) - 'a'] + 1;
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
