package com.nj.algo.search;

public class NJBinarySearch {
    protected int searchInsertRange(final int[] nums, int left, int right, int target) {
        if (left > right)
            return right + 1;

        if (left == right) {
            if (target > nums[right])
                return right + 1;
            return right;
        }

        int mid = (left + right)/2;
        int bound = nums[mid];
        if (target == bound)
            return mid;
        else if (target < bound)
            return searchInsertRange(nums, left, mid - 1, target);
        return searchInsertRange(nums, mid + 1, right, target);
    }

    protected int searchSmallerRange(final int[] nums, int left, int right, int target) {
        if (left >= right)
            return left;

        int mid = (left + right) >>> 1;
        if (nums[mid] >= target)
            return searchSmallerRange(nums, left, mid, target);
        else
            return searchSmallerRange(nums, mid + 1, right, target);
    }

    public int searchInsert(int[] nums, int target) {
        return searchSmallerRange(nums, 0, nums.length, target);

    }
}