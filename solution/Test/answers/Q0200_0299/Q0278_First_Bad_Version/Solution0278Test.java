package answers.Q0200_0299.Q0278_First_Bad_Version;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0278Test {
    Solution0278 sol;
    @BeforeEach
    void setUp() {
        sol = new Solution0278();
    }
    @Test
    void firstBadVersion() {
        int n = 5;
        int expected = 4;
        int actual = sol.firstBadVersion(n);
        Assertions.assertEquals(expected, actual);
    }
}