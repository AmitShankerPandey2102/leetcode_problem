class Solution {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumAlice = 0;
        int sumBob = 0;

        for (int x : aliceSizes) {
            sumAlice += x;
        }

        for (int x : bobSizes) {
            sumBob += x;
        }

        for (int i = 0; i < aliceSizes.length; i++) {

            for (int j = 0; j < bobSizes.length; j++) {

                int a = aliceSizes[i];
                int b = bobSizes[j];

                // Swap
                aliceSizes[i] = b;
                bobSizes[j] = a;

                // New sums after swap
                int newAlice = sumAlice - a + b;
                int newBob = sumBob - b + a;

                if (newAlice == newBob) {
                    return new int[]{a, b};
                }

                // Swap back
                aliceSizes[i] = a;
                bobSizes[j] = b;
            }
        }

        return new int[]{};
    }
}