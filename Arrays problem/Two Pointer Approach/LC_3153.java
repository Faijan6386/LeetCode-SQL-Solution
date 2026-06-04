class Solution {
    public long sumDigitDifferences(int[] nums) {

        int n = nums.length;
        int digits = String.valueOf(nums[0]).length();

        long ans = 0;

        for (int pos = 0; pos < digits; pos++) {

            int[] freq = new int[10];

            for (int num : nums) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }

            long totalPairs = (long)n * (n - 1) / 2;
            long samePairs = 0;

            for (int f : freq) {
                samePairs += (long)f * (f - 1) / 2;
            }

            ans += totalPairs - samePairs;

            for (int i = 0; i < n; i++) {
                nums[i] /= 10;
            }
        }

        return ans;
    }
}