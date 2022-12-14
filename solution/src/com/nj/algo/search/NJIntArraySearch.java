package com.nj.algo.search;

public class NJIntArraySearch implements NJSearchAble {
    int[] nums;
    int target;

    public NJIntArraySearch(int[] nums) {
        this.nums = nums;
    }

    public boolean ifMeet(int k) {
        if (k < 0) return true;
        if (k >= nums.length) return false;

        return (nums[k] < target);
    }

    public int findPosToInsert(int target) {
        this.target = target;
        NJBinarySearch bs = new NJBinarySearch();
        int k = bs.biggestMeet(this, -1, nums.length);
        return (k + 1);
    }
}
