class Solution {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;
        int[] s = new int[n + 2];
        s[0] = 1;
        s[1] = 2;
        s[2] = 2;
        int countOnes = 1; // first '1'
        int head = 2;      // reads group length
        int tail = 3;      // next position to fill
        int num = 1;       // next number to append
        while (tail < n) {
            int times = s[head];
            for (int i = 0; i < times && tail < n; i++) {
                s[tail] = num;

                if (num == 1) {
                    countOnes++;
                }
                tail++;
            }
            num = (num == 1) ? 2 : 1; // toggle 1 <-> 2
            head++;
        }
        return countOnes;
    }
}