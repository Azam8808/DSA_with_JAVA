import java.util.*;

public class duplicatePar {
    public static boolean isDuplecate(String str) {
        Stack <Integer> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count<1) {
                    return true; //duplicate
                } else {
                    s.pop(); // opening pair
                }
            } else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]) {
        String str = "((a+b))";  //true
        String str2 = "(a-b)";  //false
        System.out.println(isDuplecate(str));
    }
    
}
