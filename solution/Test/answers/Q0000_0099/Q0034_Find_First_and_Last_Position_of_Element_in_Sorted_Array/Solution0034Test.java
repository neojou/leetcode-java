package answers.Q0000_0099.Q0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0034Test {

    Solution0034 s;

    @BeforeEach
    void setUp() {
        s = new Solution0034();
    }

    private void searchInsertExam1() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = new int[]{3, 4};
        int[] pos;
        pos = s.searchRange(nums, target);
        Assertions.assertEquals(pos[0], result[0]);
        Assertions.assertEquals(pos[1], result[1]);
    }

    private void searchInsertExam2() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] result = new int[]{-1, -1};
        int[] pos;
        pos = s.searchRange(nums, target);
        Assertions.assertEquals(pos[0], result[0]);
        Assertions.assertEquals(pos[1], result[1]);
    }

    private void searchInsertExam3() {
        int[] nums = new int[]{};
        int target = 0;
        int[] result = new int[]{-1, -1};
        int[] pos;
        pos = s.searchRange(nums, target);
        Assertions.assertEquals(pos[0], result[0]);
        Assertions.assertEquals(pos[1], result[1]);
    }

    @Test
    void searchRange() {
        searchInsertExam1();
        searchInsertExam2();
        searchInsertExam3();
    }
}