package Java;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(()))";
        Stack<Character> characters = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                characters.push(ch);
            } else if (ch == ')') {
                if (characters.isEmpty()) {
                    System.out.println("Invalid"); // unmatched closing
                    return;
                }
                characters.pop();
            }
        }

        if (characters.isEmpty()) {
            System.out.println("Valid case");
        } else {
            System.out.println("Invalid");
        }
    }
}
