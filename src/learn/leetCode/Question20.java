package learn.leetCode;

import java.util.Stack;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年07月06日 21:47
 */
public class Question20 {


    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char tmp : s.toCharArray()) {
            if (tmp == '(') {
                stack.push(')');
            } else if (tmp == '[') {
                stack.push(']');
            } else if (tmp == '{') {
                stack.push('}');
                // 先判断不为空再出栈：可能先出栈导致后边为空变为true
            } else if (stack.isEmpty() || tmp != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();


    }
}
