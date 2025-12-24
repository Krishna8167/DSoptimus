class Solution {
    public int addDigits(int num) {
        int rev = sum(num);

        if(rev < 10) {
            return rev;
        }
        else {
            return addDigits(rev);
        }
    }

    int sum(int n) {

        if(n == 0) {
            return 0; 
        }

        return (n%10) + sum(n/10);
    }
}
