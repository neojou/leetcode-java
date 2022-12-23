package answers.Q0000_0099.Q0035_Search_Insert_Position;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0035Test {
    Solution0035 s;

    @BeforeEach
    void setUp() {
        s = new Solution0035();
    }

    private void searchInsertExam3() {
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        int result = 4;
        int pos;
        pos = s.searchInsert(nums, target);
        Assertions.assertEquals(pos, result);
    }

    private void searchInsertExam2() {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        int result = 1;
        int pos;
        pos = s.searchInsert(nums, target);
        Assertions.assertEquals(pos, result);
    }

    private void searchInsertExam1() {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        int result = 2;
        int pos;
        pos = s.searchInsert(nums, target);
        Assertions.assertEquals(pos, result);
    }

    @Test
    void searchInsert() {
        searchInsertExam1();
        searchInsertExam2();
        searchInsertExam3();
    }
}