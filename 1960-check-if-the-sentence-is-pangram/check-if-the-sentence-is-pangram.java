class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false; // pangram me 26 elemnt hone he chayie agar 26 se kaam hai tho false ;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
         }
        return true;
    }
}
 // if me jo likha hai wah manually har lowercase check kar raha agar char mil raha tho index return kar raha hai aur nahi tho turant false .
 // agar loop complete ho gaya aur koi miss nahi hua tho true return karega .