public class MainProgram {
    public int[] searchRange(int[] nums, int target) {
        int l = search(nums, target);
        int r = search(nums, target + 1);
        return l == r ? new int[] {-1, -1} : new int[] {l, r - 1};
    }

    private int search(int[] nums, int x) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    public int[] searchRange2(int[] nums, int target) {
        int start = -1;
        int end = -1;

        // Find the starting position of the target value using binary search
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (nums[mid] == target) {
                start = mid;
            }
        }

        // Find the ending position of the target value using binary search
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (nums[mid] == target) {
                end = mid;
            }
        }

        return new int[]{start, end};
    }

    public int[] searchRange1(int[] nums, int target) {
            int[] not_found = new int[]{-1, -1};
            int[] result;

            if (nums == null) return not_found;
            int len = nums.length;
            if (len == 0) return not_found;

            int first = 0;
            int last = len - 1;
            while (first < last) {
                int middle = (first + last)/2;
                int value = nums[middle];
                if (value == target) {
                    int start = middle;
                    int end = middle;
                    int pre_start = start - 1;
                    int post_end = end + 1;
                    while ((pre_start >= 0) && nums[pre_start] == target) {
                        start--; pre_start--;
                    }
                    while ((post_end < len) && nums[post_end] == target) {
                        end++; post_end++;
                    }
                    result = new int[]{start, end};
                    return result;
                } else {
                    if (target < value) {
                        last = middle - 1;
                    } else {
                        first = middle + 1;
                    }
                }
            }


            if (first == last) {
                if (nums[first] == target)
                    return new int[]{first, first};
            }

        return not_found;
    }
}