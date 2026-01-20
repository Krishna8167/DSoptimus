class Solution {
    public int findKthLargest(int[] nums, int k) {
        int kth_index = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, kth_index); 
    }

    int quickSelect(int[] arr, int low, int hi, int target) {
        if (low >= hi) {
            return arr[low];
        }

        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // Now array is partitioned into:
        // low ... e | s ... hi

        if (target <= e) {
            return quickSelect(arr, low, e, target);
        } else if (target >= s) {
            return quickSelect(arr, s, hi, target);
        } else {
            // target lies between e and s.
            return arr[target];
        }
    }
}
