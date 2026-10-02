import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        return pad("", digits);
    }

    static List<String> pad(String p, String up) {

        // Base case
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Phone keypad mapping
        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        // Get first digit
        int digit = up.charAt(0) - '0';

        // Get letters corresponding to digit
        String letters = mapping[digit];

        ArrayList<String> list = new ArrayList<>();

        // Try every letter
        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            // Add answer from recursive call
            list.addAll(
                pad(p + ch, up.substring(1))
            );
        }

        return list;
    }
}