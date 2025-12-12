class Solution {
    public double myPow(double x, int n) {

        long N = n; // to handle size and negative int.
        if ( N < 0 ) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1.00000;
        while (N > 0) {
            if ((N & 1) == 1) {
                ans *= x;
            }
            x *= x;

            N = N >> 1;
        }
        return ans;
    }
}
