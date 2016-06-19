package dataStructures.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BalancedParentheses {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Character, Character> map1 = new HashMap<Character, Character>();
        map1.put('{', '}');
        map1.put('(', ')');
        map1.put('[', ']');
        Map<Character, Character> map2 = new HashMap<Character, Character>();
        map2.put('}', '{');
        map2.put(')', '(');
        map2.put(']', '[');
        
        
        for (int i = 0; i < n; i++) {
            boolean balanced = true;
            Deque<Character> stack = new ArrayDeque<Character>();
            String s = in.next();
            
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (map1.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (!stack.isEmpty() && stack.peek() == map2.get(c)) {
                        stack.pop();
                    } else {
                        balanced = false;
                        break;
                    }
                }
            }
            balanced = balanced ? stack.isEmpty() : balanced;
            System.out.println(balanced ? "YES" : "NO");
        }
    }
}
