package com.nj.algo.search;

public class NJBinarySearch {
    public  <T extends NJSearchAble> int biggestMeet(final T set, int lk, int rk) {
        if (lk >= rk)
            return lk;

        int mid = (lk + rk + 1) >>> 1;
        Boolean isMeet = set.ifMeet(mid);
        if (isMeet)
            return biggestMeet(set, mid, rk);
        else
            return biggestMeet(set, lk, mid - 1);
    }
}
