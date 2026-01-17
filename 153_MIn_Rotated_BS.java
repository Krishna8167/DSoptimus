class Solution {
    public int findMin(int[] nums) {
        return minSearch(nums, 0, nums.length - 1, nums[0]);
    }

    int minSearch(int[] nums, int s, int e, int min) {

        if(s > e) {
            return min;
        }

        int mid =  s + (e - s) / 2;


        if(nums[s] <= nums[mid]) {
            min = Math.min(min, nums[s]);
            return minSearch(nums, mid + 1, e, min);
        }

        else {
            min = Math.min(min, nums[mid]);
            return minSearch(nums, s, mid - 1, min);
        }

    }
}
