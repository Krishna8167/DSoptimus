class Solution {
    public int[] sortArray(int[] nums) {
        QuickSort(nums, 0, nums.length - 1);
        return nums;
    }

    void QuickSort(int[]arr, int low, int hi) {
        
        if (hi <= low) {
            return;
        }
        
        int s = low;
        int e = hi;
        int mid = s +(e - s) /2;
        int pivot = arr[mid];
        
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            
            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            
        }
        
        QuickSort(arr, low, e);
        QuickSort(arr, s, hi);
        
    }
}
