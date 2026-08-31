class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;
        for (int x : aliceSizes) {
            aliceSum += x;
        }
        for (int x : bobSizes) {
            bobSum += x;
        }
        for (int x : aliceSizes) {
            for (int y : bobSizes) {
                if (aliceSum - x + y == bobSum - y + x) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{};
    }
}
