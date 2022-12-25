package answers.Q0000_0099.Q0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array;

import com.nj.algo.search.NJIntArraySearch;

public class Solution0034 {

    public int[] searchRange(int[] nums, int target) {
        NJIntArraySearch ias = new NJIntArraySearch(nums);
        int l = ias.findPosToInsert(target);
        int r = ias.findPosToInsert(target + 1);
        if (l == r)
            return new int[]{-1, -1};
        return new int[]{l, r - 1};
    }
}

