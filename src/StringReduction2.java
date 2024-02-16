package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * String reduction
 * Given a string, reduce it in such a way that all of its substrings are distinct. To do so, you may delete any
 * characters at any index. What is the minimum number of deletion needed?
 *
 * NOTE: A substring is contiguous group of 1 or more cgaracters within a string.
 *
 * Example: s = "abab"
 * Substrings in s are {'a','b','a','b','ab','ba','ab','aba','bab','abab'}. By deleting one "a" and one "b"
 * the string becomes "ab" of "ba" and all of its substrings are distinct. This required 2 deletion.
 */

public class StringReduction2 {

    public static int minDeletions(String s) {
        Set<Character> seen = new HashSet<>();
        int deletions = 0;

        System.out.println(seen);

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                deletions++;
            } else {
                seen.add(c);
            }
        }

        System.out.println(seen);

        return deletions;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "abcab";
        int result = minDeletions(input);
        System.out.println("Minimum deletions needed: " + result);
    }
}