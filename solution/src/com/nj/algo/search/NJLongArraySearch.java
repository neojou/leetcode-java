package com.nj.algo.search;

public class NJLongArraySearch implements NJSearchAble {
    long[] nums;
    long target;

    public NJLongArraySearch(long[] nums) {
        this.nums = nums;
    }

    public boolean ifMeet(int k) {
        if (k < 0) return true;
        if (k >= nums.length) return false;

        return (nums[k] < target);
    }

    public int findPosToInsert(long target) {
        this.target = target;
        NJBinarySearch bs = new NJBinarySearch();
        int k = bs.biggestMeet(this, -1, nums.length);
        return (k + 1);
    }
}
