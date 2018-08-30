package com.cloudy;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowels {

    private static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {
        String string = "ABcdefg abCDEFG";
        String result = reverseVowels(string);
        System.out.println(result);
    }

    public static String reverseVowels(String string) {
        int left = 0;
        int right = string.length() - 1;
        char[] chars = new char[string.length()];

        while (left <= right) {
            char i = string.charAt(left);
            char j = string.charAt(right);

            if (!vowels.contains(i)) {
                chars[left ++] = i;
            } else if (!vowels.contains(j)) {
                chars[right --] = j;
            } else {
                chars[left ++] = j;
                chars[right --] = i;
            }

        }
        return new String(chars);
    }

}
