class Solution {

    // Mod property for exponential => a^b % m = (a % m)^b % m
    static final int MOD = 1337;
    public int superPow(int a, int[] b) {
        long result = 1;
        a %= MOD;
        for (int digit : b) {
            result = fastPower(result, 10);                 // raise previous result to 10th power
            result = (result * fastPower(a, digit)) % MOD;  // multiply by a^digit % MOD
        }
        return (int) result;
    }

    private long fastPower(long base, int exp) {
        long ans = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans = (ans * base) % MOD;  // modular multiplication
            }
            base = (base * base) % MOD;    // modular square
            exp >>= 1;
        }
        return ans;
    }
}
