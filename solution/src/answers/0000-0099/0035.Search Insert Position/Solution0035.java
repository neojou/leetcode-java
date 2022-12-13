class Solution0035 {
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

