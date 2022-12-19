package com.nj.algo.search;

public class NJFindMax {

    /** suppose intA is the array of positive integers. */
    public static int findMaxUnSorted(int[] intA) {
        int max = -1;
        for (int i = 0; i < intA.length; i++) {
            if (intA[i] > max)
                max = intA[i];
        }
        return max;
    }
}
