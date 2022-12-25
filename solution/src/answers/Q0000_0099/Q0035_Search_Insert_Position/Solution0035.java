package answers.Q0000_0099.Q0035_Search_Insert_Position;

import com.nj.algo.search.NJIntArraySearch;

public class Solution0035 {
    public int searchInsert(int[] nums, int target) {
        NJIntArraySearch ias = new NJIntArraySearch(nums, target);
        return ias.findPosToInsert(target);
    }
}

