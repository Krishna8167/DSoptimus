class Solution {
    public int arrangeCoins(int n) {
        long nn = (long)n;
        long res = (long) ((Math.sqrt(1 + 8 * nn) - 1) / 2) ;
        return (int) res;
    }
}

// with BInary Search approach
class Solution {
    public int arrangeCoins(int n) {
        long start = 1, end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coins = mid * (mid + 1) / 2;

            if (coins == n)
                return (int) mid;
            if (coins < n)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int) end; // end is the largest valid k 
    }
}
