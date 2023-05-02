package practisee;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int n = str.length();
        int maxLen = 0, start = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0, j = 0; i < n; i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                j = Math.max(j, map.get(c) + 1);
            }
            map.put(c, i);
            if (i - j + 1 > maxLen) {
                maxLen = i - j + 1;
                start = j;
            }
        }
        System.out.println(map);
        String result = str.substring(start, start + maxLen);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}
