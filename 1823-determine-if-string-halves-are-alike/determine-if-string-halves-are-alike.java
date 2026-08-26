class Solution {

    public boolean halvesAreAlike(String s) {

        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2);

        int count1 = 0;
        int count2 = 0;

        // First half
        for (int i = 0; i < firstHalf.length(); i++) {
            if (isVowel(firstHalf.charAt(i))) {
                count1++;
            }
        }

        // Second half
        for (int i = 0; i < secondHalf.length(); i++) {
            if (isVowel(secondHalf.charAt(i))) {
                count2++;
            }
        }

        if (count1 == count2) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}