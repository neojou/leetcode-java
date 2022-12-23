package com.nj.algo.search;

public interface NJSearchAlgorithm {
    public int findPosToInsert(final int[] array, int item);
    public int findPosToInsert(final long[] array, long item);
    public <T extends Comparable<T>> int findPosToInsert(final T[] array, T item);
}
