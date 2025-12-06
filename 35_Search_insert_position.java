Solution 1 : using regular binary search

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start; 
    }
}


Solution 2: using recursion.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        return search(start, end , nums, target);
    }

    public int search(int start, int end , int[]nums, int target) {
        if (start > end) {
            return start;
        }
        int mid = start + (end - start) / 2;

        if (target == nums[mid]) {
            return mid;
        }

        else if (target > nums[mid]) {
            return search(mid + 1, end, nums, target);
        }

        else {
            return search(start, mid - 1, nums, target);
        }
    }
}
