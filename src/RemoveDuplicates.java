import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;

class RemoveDuplicates {
    public String removeDuplicates(String s) {
        String dupRemoveStr = "";
        char ch;

        ArrayDeque<Character> dequeStack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(dequeStack.isEmpty()){
                dequeStack.push(ch);
            }
            else if(dequeStack.peek() != ch){
                dequeStack.push(ch);
            }
            else{
                dequeStack.pop();}
        }

        while(!dequeStack.isEmpty()){
            dupRemoveStr = dequeStack.pop() + dupRemoveStr;
        }

        return dupRemoveStr;
    }

    @Test
    void testRemoveDuplicates(){
        String s = "abbaca";
        String result = removeDuplicates(s);
        assertEquals("ca", result);
    }
}