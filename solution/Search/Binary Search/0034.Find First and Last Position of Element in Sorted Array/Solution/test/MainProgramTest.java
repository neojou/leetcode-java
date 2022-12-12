import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MainProgramTest {
    MainProgram mp = null;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        mp = new MainProgram();
    }

    void searchRange1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] corret = {3, 4};

        int[] result = mp.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
        Assertions.assertTrue(Arrays.compare(corret, result) == 0);
    }

    void searchRange2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] corret = {-1, -1};

        int[] result = mp.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
        Assertions.assertTrue(Arrays.compare(corret, result) == 0);
    }

    void searchRange3() {
        int[] nums = {};
        int target = 0;
        int[] corret = {-1, -1};

        int[] result = mp.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
        Assertions.assertTrue(Arrays.compare(corret, result) == 0);
    }

    void searchRange4() {
        int[] nums = {1};
        int target = 1;
        int[] corret = {0, 0};

        int[] result = mp.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
        Assertions.assertTrue(Arrays.compare(corret, result) == 0);
    }

    void searchRange5() {
        int[] nums = {2, 2};
        int target = 2;
        int[] corret = {0, 1};

        int[] result = mp.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
        Assertions.assertTrue(Arrays.compare(corret, result) == 0);
    }

    void searchRange6() {
        int[] nums = {1, 4};
        int target = 4;
        int[] corret = {1, 1};

        int[] result = mp.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
        Assertions.assertTrue(Arrays.compare(corret, result) == 0);
    }

    void searchRange7() {
        int[] nums = {1, 2, 3};
        int target = 1;
        int[] corret = {0, 0};

        int[] result = mp.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
        Assertions.assertTrue(Arrays.compare(corret, result) == 0);
    }

    @org.junit.jupiter.api.Test
    void searchRange() {
        searchRange1();
        searchRange2();
        searchRange3();
        searchRange4();
        searchRange5();
        searchRange6();
        searchRange7();
    }

}