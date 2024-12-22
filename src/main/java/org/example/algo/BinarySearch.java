package org.example.algo;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        int l = 0, u = nums.length - 1, m = nums.length / 2;

        while(u >= l) {
            m = l + (u-l) / 2; // (u-l) prevents integer overflow
            if(target > nums[m]) {
                l = m + 1;
            } else if(target < nums[m]) {
                u = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static int searchInRotatedSortedArray(int[] nums, int target) {

        int lo = 0, hi = nums.length-1;

        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            if(nums[mid] == target) return mid;

            // check if left half is sorted or not
            if(nums[lo] < nums[mid]) {
                // check if target is betweem left half
                if(nums[mid] > target && nums[lo] <= target) {
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            } else {
                if(nums[mid] < target && target < nums[hi]) {
                    lo = mid+1;
                } else {
                    hi = mid-1;
                }
            }
        }

        return -1;
    }
}
