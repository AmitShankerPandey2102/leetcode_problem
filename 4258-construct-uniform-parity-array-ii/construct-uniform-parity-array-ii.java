class Solution {
    public boolean uniformArray(int[] nums1) {

        boolean allOdd = true;
        boolean allEven = true;

        // STEP 1: Check karo already all odd ya all even hai
        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] % 2 == 0) {
                allOdd = false;
            }

            if (nums1[i] % 2 != 0) {
                allEven = false;
            }
        }

        // Agar already uniform hai
        if (allOdd || allEven) {
            return true;
        }

        // STEP 2: Mixed array hai
        // Minimum element find karo
        int min = nums1[0];

        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] < min) {
                min = nums1[i];
            }
        }

        // STEP 3: Minimum odd hai
        // Toh even elements ko odd bana sakte hain
        // Example: 4 - 1 = 3
        if (min % 2 != 0) {
            return true;
        }

        // Minimum even hai
        // Mixed array mein odd elements ko even banana possible nahi
        return false;
    }
}
//Agar all odd → true
//Agar all even → true
//Agar mixed hai → minimum element ko change nahi kar sakte, kyunki usse chhota koi element nahi hai.
//Isliye final array ki parity minimum element ki parity hi hogi.
//Har doosre element ko minimum element subtract karke usi parity mein laa sakte ho.
//Code