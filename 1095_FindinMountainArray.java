/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        int peak = findPeakIndex(mountainArr, n);

        int firstTry = orderAgnosticBinarySearch(target, mountainArr, 0, peak);
        if (firstTry != -1) return firstTry;

        return orderAgnosticBinarySearch(target, mountainArr, peak + 1, n - 1);
    }

    // Function to find peak in mountain array
    private int findPeakIndex(MountainArray mountainArr, int n) {
        int start = 0, end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                // Peak is in the left half (including mid)
                end = mid;
            } else {
                // Peak is in the right half
                start = mid + 1;
            }
        }
        return start; // Peak index
    }

    // Order-agnostic Binary Search (works for both asc & desc arrays)
    private int orderAgnosticBinarySearch(int target, MountainArray mountainArr, int start, int end) {
        boolean isAscending = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) return mid;

            if (isAscending) {
                if (target < midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // descending order
                if (target < midValue) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
