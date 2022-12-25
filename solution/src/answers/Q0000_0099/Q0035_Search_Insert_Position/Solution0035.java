package answers.Q0000_0099.Q0035_Search_Insert_Position;

import answers.Q1800_1899.Q1898_Maximum_Number_of_Removable_Characters.Solution1898;
import com.nj.algo.search.NJBinarySearch;
import com.nj.algo.search.NJSearchAble;
import com.nj.lang.NJString;

public class Solution0035 {

    class integer_insert implements NJSearchAble {
        int[] nums;
        int target;

        integer_insert(int[] nums, int target) {
            this.nums = nums;
            this.target = target;
        }

        public boolean ifMeet(int k) {
            if (k < 0) return true;
            if (k >= nums.length) return false;

            boolean ret = (nums[k] < target);
            if (ret)
                System.out.println("nums[" + k + "]=" + nums[k] + " < " + target);
            else
                System.out.println("nums[" + k + "]=" + nums[k] + " >= " + target);
            return ret;
        }
    }

    public int searchInsert(int[] nums, int target) {
        integer_insert ii = new integer_insert(nums, target);
        NJBinarySearch bs = new NJBinarySearch();
        int k = bs.biggestMeet(ii, -1, nums.length);
        return (k + 1);
    }
}

