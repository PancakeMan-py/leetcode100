import java.util.HashMap;

class Solution {
    public String minWindow( String s, String t ) {
        //return value
        String minSubstring = "";
        //if target len > String len, then return
        if (t.length() > s.length()) {
            return minSubstring;
        }

        //target table
        HashMap<Character, Integer> target = new HashMap<>();
        //window table for comparing
        HashMap<Character, Integer> window = new HashMap<>();

        for ( int i = 0; i < t.length(); i++ ) {
            char ch = t.charAt( i );
            target.put( ch, target.getOrDefault( ch, 0 ) + 1 );
        }

        //if valid == t.length {Shrink the window}
        int valid = 0;
        //minSize
        int minWindowLen = Integer.MAX_VALUE;

        //left, right pointer
        int right = 0, left =0;

        //minWindow left
        int minWindowLeft = 0;

        //lets start
        while(right < s.length()) {

            char ch = s.charAt(right);
            right += 1;

            //add to our window
            if(target.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                if(window.get(ch).equals(target.get(ch))) {
                    valid += 1;
                }

                while(valid == target.size()) {
                    if ( right - left < minWindowLen ) {
                        minWindowLeft = left;
                        minWindowLen = right - left;
                    }
                    char ch2 = s.charAt(left);
                    left += 1;
                    if (target.containsKey(ch2)) {
                        if ( window.get(ch2).equals(target.get(ch2) ) ) {
                            valid -= 1;
                        }
                        window.put(ch2, window.get(ch2) - 1 );
                    }
                }

            }
        }
        minSubstring = minWindowLen == Integer.MAX_VALUE ? "" : s.substring(
                minWindowLeft, minWindowLeft + minWindowLen);
        return minSubstring;
    }
}