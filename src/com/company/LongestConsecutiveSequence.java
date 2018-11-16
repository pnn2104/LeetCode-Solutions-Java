package com.company;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet hash = new HashSet();
        for (int num : nums) {
            hash.add(num);
        }
        int longest = 0;

        for (int num : nums) {
            if (!hash.contains(num - 1)) {
                int currentLen = 1;
                int currentNum = num;
                while (hash.contains(currentNum + 1)) {
                    currentLen += 1;
                    currentNum += 1;
                }
                longest = Math.max(currentLen, longest);
            }
        }

        return longest;
    }
}
