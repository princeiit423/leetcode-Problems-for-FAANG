//leetcode problem --- 03

import java.util.HashSet;

public class day02 {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int i = 0, j = 0, max = 0;
            HashSet<Character> seen = new HashSet();

            // sliding window-first stays,second expands
            // j is for all distinct charecters
            while (j < s.length()) {
                if (!seen.contains(s.charAt(j))) {
                    seen.add(s.charAt(j));
                    j++;// expanding window
                    max = Math.max(seen.size(), max);// update max every time we see a new char
                } // seen.size() is size of unique chars
                else {// for duplicates
                    seen.remove(s.charAt(i));
                    i++;// last charec index
                }
            }
            return max;
        }
    }
}