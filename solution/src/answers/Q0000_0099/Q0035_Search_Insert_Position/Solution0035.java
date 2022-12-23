package answers.Q0000_0099.Q0035_Search_Insert_Position;

import com.nj.algo.search.NJBinarySearch;

public class Solution0035 {
    public int searchInsert(int[] nums, int target) {
        NJBinarySearch bs = new NJBinarySearch();
        return bs.findPosToInsert(nums, target);
    }
}

