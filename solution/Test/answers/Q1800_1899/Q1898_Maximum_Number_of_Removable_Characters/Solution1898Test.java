package answers.Q1800_1899.Q1898_Maximum_Number_of_Removable_Characters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1898Test {
    Solution1898 sol;
    @BeforeEach
    void setUp() {
        sol = new Solution1898();
    }

    private void exam1() {
        String s = new String("abcacb");
        String p = new String("ab");
        int removable[] = {3, 1, 0};
        int expected = 2;
        int ret;
        ret = sol.maximumRemovals(s, p, removable);
        Assertions.assertEquals(expected, ret);
    }

    private void exam2() {
        String s = new String("abcbddddd");
        String p = new String("abcd");
        int removable[] = {3, 2, 1, 4, 5, 6};
        int expected = 1;
        int ret;
        ret = sol.maximumRemovals(s, p, removable);
        Assertions.assertEquals(expected, ret);
    }

    private void exam3() {
        String s = new String("abcab");
        String p = new String("abc");
        int removable[] = {0,1,2,3,4};
        int expected = 0;
        int ret;
        ret = sol.maximumRemovals(s, p, removable);
        Assertions.assertEquals(expected, ret);
    }

    private void exam4() {
        String s = new String("qobftgcueho");
        String p = new String("obue");
        int removable[] = {5,3,0,6,4,9,10,7,2,8};
        int expected = 7;
        int ret;
        ret = sol.maximumRemovals(s, p, removable);
        Assertions.assertEquals(expected, ret);
    }

    @Test
    void maximumRemovals() {
        exam1();
        exam2();
        exam3();
        exam4();
    }
}