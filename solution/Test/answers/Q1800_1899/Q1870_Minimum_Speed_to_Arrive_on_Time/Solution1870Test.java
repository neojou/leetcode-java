package answers.Q1800_1899.Q1870_Minimum_Speed_to_Arrive_on_Time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1870Test {
    Solution1870 sol = new Solution1870();
    @BeforeEach
    void setUp() {
    }

    void example1() {
        int[] dist = {1,3,2};
        double hour = 6.0;
        int expect = 1;

        int output = sol.minSpeedOnTime(dist, hour);
        //System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example2() {
        int[] dist = {1,3,2};
        double hour = 2.7;
        int expect = 3;

        int output = sol.minSpeedOnTime(dist, hour);
        //System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example3() {
        int[] dist = {1,3,2};
        double hour = 1.9;
        int expect = -1;

        int output = sol.minSpeedOnTime(dist, hour);
        //System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example4() {
        int[] dist = {1,1,100000};
        double hour = 2.01;
        int expect = 10000000;

        int output = sol.minSpeedOnTime(dist, hour);
        System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example5() {
        int[] dist = {5, 3, 4, 6, 2, 2, 7};
        double hour = 10.92;
        int expect = 4;

        int output = sol.minSpeedOnTime(dist, hour);
        System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example6() {
        int[] dist = {92,41,28,84,64,51,83,59,19,34,18,32,96,72,69,34,96,75,55,75,52,47,29,18,66,64,12,97,7,15,20,81,21,88,55,77,9,50,49,77,60,68,33,71,2,88,93,15,88,69,97,35,99,83,44,15,38,56,21,59,1,93,93,34,65,98,23,65,14,81,39,82,65,78,26,20,48,98,21,70,100,68,1,77,42,63};
        double hour = 107.52;
        int expect = 78;

        int output = sol.minSpeedOnTime(dist, hour);
        System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    @Test
    void minSpeedOnTime() {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
    }
}