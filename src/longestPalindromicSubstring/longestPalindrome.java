package longestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class longestPalindrome {
    public String longestPalindromeMethod(String s) {
          return "yes";     }

    public boolean isPalindromic(String s){
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    @Test
    void isPalindromicTest(){
        String s = "abcba";
        assertEquals(true,isPalindromic(s));
    }
}
