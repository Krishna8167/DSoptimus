class Solution {
    public int subtractProductAndSum(int n) {
        return product(n) - sum(n);
    }

    int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n%10) + sum(n/10);
    }

    int product(int n) {

        if( n == 0 ) {
            return 1;
        }

            return (n%10) * product(n/10);
    }
}
