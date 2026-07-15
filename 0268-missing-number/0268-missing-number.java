class Solution {
    public int missingNumber(int[] n) {

        int m = n.length;

        int a= m * (m + 1) / 2;

        int b = 0;

        for (int num : n) {
            b = b+ num;
        }

        return a - b;
    }
}