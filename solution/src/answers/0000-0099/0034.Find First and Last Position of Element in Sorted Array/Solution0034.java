public class Solution0034 {
    protected int searchSmallerRange(final int[] nums, int left, int right, int target) {
        if (left >= right)
            return left;

        int mid = (left + right) >>> 1;
        if (nums[mid] >= target)
            return searchSmallerRange(nums, left, mid, target);
        else
            return searchSmallerRange(nums, mid + 1, right, target);
    }

    public int[] searchRange(int[] nums, int target) {
        int l = searchSmallerRange(nums, 0, nums.length, target);
        int r = searchSmallerRange(nums, 0, nums.length, target + 1);
        if (l == r)
            return new int[]{-1, -1};
        return new int[]{l, r - 1};
    }
}

