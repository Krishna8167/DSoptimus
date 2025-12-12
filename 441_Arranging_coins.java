class Solution {
    public int arrangeCoins(int n) {
        long nn = (long)n;
        long res = (long) ((Math.sqrt(1 + 8 * nn) - 1) / 2) ;
        return (int) res;
    }
}
