package com.bahar;

import java.util.Stack;
/**
 * @author bahareh
 * @date 2025.08.14
 */
public class StringReverse {

    public String reverse(String input) {

        if (input == null) throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) stack.push(ch);

        StringBuffer reversed = new StringBuffer();
        while (!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
