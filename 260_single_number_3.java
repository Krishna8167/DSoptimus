class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums ) {
            xor ^=num;
        }

        int differbit = xor & (-xor);    //The operation guarentees the differnce between the unique bits. 

        int a = 0, b = 0;
        for (int num : nums) {
            if((differbit & num) != 0) {
                a ^= num;
            }
            else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
