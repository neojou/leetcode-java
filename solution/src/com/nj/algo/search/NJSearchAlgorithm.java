package com.nj.algo.search;

public interface NJSearchAlgorithm {
    public int findPosToInsert(final int[] array, int item);
    public <T extends Comparable<T>> int findPosToInsert(final T[] array, T item);
}
