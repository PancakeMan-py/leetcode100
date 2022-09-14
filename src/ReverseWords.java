import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWords {
    public String reverseWords(String s) {
        s = removeSpace(s);
        char[] charS = s.toCharArray();
        int ansSize = 0;
        char[] ans = new char[s.length()];

        int woldLen = 0;


        for(int i = charS.length - 1; i >= 0; i--){
            if(charS[i] == ' '){
                continue;
            }
            woldLen++;

            if(i == 0 && charS[i] != ' '){
                for(int j = 0; j < woldLen; j++){
                    ans[ansSize] = charS[i+j];
                    ansSize++;
                }


                String ansString = new String(ans, 0, ansSize);
                return ansString;
            }



            if(charS[i-1] == ' '){
                for(int j = 0; j < woldLen; j++){
                    ans[ansSize] = charS[i+j];
                    ansSize++;
                }
                if(i-1 != 0){
                    ans[ansSize] = ' ';
                    ansSize++;
                    woldLen = 0;
                }
                woldLen = 0;
            }
        }

        String ansString = new String(ans, 0, ansSize);
        return ansString;

    }

    public String removeSpace(String s){
        int left = 0;
        int right = s.length() - 1;
        char[] charS = s.toCharArray();
        while(charS[left] == ' '){
            left++;
        }
        while(charS[right] == ' '){
            right--;
        }
        String ansString = new String(charS, left, right - left +1);
        return ansString;
    }

    @Test

    void testReverseWords(){
        String s = "  hello world  ";
        String expectResult = "world hello";
        String actual = reverseWords(s);
        assertEquals(expectResult, actual);
    }

}
