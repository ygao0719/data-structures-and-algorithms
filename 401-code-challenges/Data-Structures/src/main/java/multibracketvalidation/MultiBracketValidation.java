package multibracketvalidation;


import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()){
            if (c == '('||c == '{'||c == '['){
                stack.push(c);
            }

            if (c == ')'){
                if (stack.isEmpty()|| stack.pop() != '('){
                    return false;

                }
            }
            if (c == '}'){
                if (stack.isEmpty()|| stack.pop() != '{'){
                    return false;
                }
            }
            if (c == ']'){
                if (stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
