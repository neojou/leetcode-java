import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import com.nj.algo.search.NJBinarySearch;

class NJBinarySearchTest {
    NJBinarySearch nj_search;

    @BeforeEach
    void setUp() {
        nj_search = new NJBinarySearch();
    }

    private void searchInsertExam3() {
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        int result = 4;
        int pos;
        pos = nj_search.searchInsert(nums, target);
        Assertions.assertEquals(pos, result);
    }

    private void searchInsertExam2() {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        int result = 1;
        int pos;
        pos = nj_search.searchInsert(nums, target);
        Assertions.assertEquals(pos, result);
    }

    private void searchInsertExam1() {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        int result = 2;
        int pos;
        pos = nj_search.searchInsert(nums, target);
        Assertions.assertEquals(pos, result);
    }

    @Test
    void searchInsert() {
        searchInsertExam1();
        searchInsertExam2();
        searchInsertExam3();
    }
}