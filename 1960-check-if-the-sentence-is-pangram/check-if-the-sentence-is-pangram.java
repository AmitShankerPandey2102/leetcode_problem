class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26];   // a-z track karne ke liye
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }
}