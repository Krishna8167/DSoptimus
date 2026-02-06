class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            fast = square(square(fast));
            slow = square(slow);
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    public int square (int n) {
        int sum = 0;
        if (n == 0) {
            return n;
        }
        while (n > 0) {
            int r = n%10;
            sum = sum + (r * r);
            n = n/10;
        }
        return sum;
    }
}
