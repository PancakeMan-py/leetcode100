import java.util.HashMap;

public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> target = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();


        //put elements in target
        for (int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            target.put(ch, target.getOrDefault(ch, 0) + 1);
        }

        int left = 0, right = 0;

        int count = 0;

        //start loop
        while(right < s2.length()) {
            Character ch = s2.charAt(right);
            right += 1;

            //update window
            if(target.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                if(target.get(ch).equals(window.get(ch))) {
                    count += 1;
                }
            }

            //a possible solution
            while(right - left == s1.length()) {
                //actual solution
                if(count == target.size()) {
                    return true;
                }

                //dont meet
                //take out element
                ch = s2.charAt(left);
                left += 1;
                if (target.containsKey(ch)) {
                    if (window.get(ch).equals(target.get(ch))) {
                        count--;
                    }
                    window.put(ch, window.getOrDefault(ch, 0) - 1);


                }
            }

        }
        return false;

    }
}
