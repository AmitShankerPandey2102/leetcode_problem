class Solution {
    public int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){ //means only check positions where the complete needle can fit.
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}


//i Where the matching starts in haystack
// j Which character of needle we're currently checking


//Pick a starting position i
 //       ↓
//Compare needle character-by-character using j
 //       ↓
// If all characters match → return i
//         ↓
// Otherwise → move i to next position
//         ↓
// If nothing matches → return -1