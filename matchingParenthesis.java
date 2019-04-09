import java.util.Stack;

public class parenthesis {
    public static boolean isMatch(String str){
        Stack<Character> stak = new Stack<Character>();
        for (int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stak.push(c);
            } else if (c == ')') {
                if (stak.isEmpty() || stak.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stak.isEmpty() || stak.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (stak.isEmpty() || stak.pop() != '{') {
                    return false;
                }
            }
        }
        return stak.isEmpty();
    }

    public static void main (String args[]){
        String test_1 = "(c == )";  // should return true
        String test_2 = "[{()()()[]{}}]";  // return true
        String test_3 = "lalalala[(haha]hah}()()"; // return false

        System.out.println(isMatch(test_1));
        System.out.println(isMatch(test_2));
        System.out.println(isMatch(test_3));
    }
}
