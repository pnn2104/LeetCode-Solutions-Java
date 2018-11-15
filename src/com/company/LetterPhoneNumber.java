package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;


public class LetterPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.equals("")) {return result;}

        Map<Character, char[]> numToChars = new HashMap<>();
        numToChars.put('2', new char[]{'a', 'b', 'c'});
        numToChars.put('3', new char[]{'d', 'e', 'f'});
        numToChars.put('4', new char[]{'g', 'h', 'i'});
        numToChars.put('5', new char[]{'j', 'k', 'l'});
        numToChars.put('6', new char[]{'m', 'n', 'o'});
        numToChars.put('7', new char[]{'p', 'q', 'r', 's'});
        numToChars.put('8', new char[]{'t', 'u', 'v'});
        numToChars.put('9', new char[]{'w', 'x', 'y', 'z'});

        StringBuilder sb = new StringBuilder();
        helper(sb, digits, result, numToChars);

        return result;
    }

    private void helper(StringBuilder sb, String digits, List<String> result, Map<Character, char[]> numToChars) {
        if (sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }

        char[] chars = numToChars.get(digits.charAt(sb.length()));
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            helper(sb, digits, result, numToChars);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
