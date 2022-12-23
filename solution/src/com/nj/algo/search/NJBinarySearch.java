package com.nj.algo.search;

public class NJBinarySearch implements NJSearchAlgorithm {
    @Override
    public int findPosToInsert(final int[] array, int item) {
        return searchPos(array, item, 0, array.length);
    }

    @Override
    public int findPosToInsert(final long[] array, long item) {
        return searchPos(array, item, 0, array.length);
    }

    @Override
    public <T extends Comparable<T>> int findPosToInsert(final T[] array, T item) {
        return searchPos(array, item, 0, array.length);
    }


    private  int searchPos(final int[] array, int item, int left, int right) {
        if (left >= right)
            return left;

        int mid = (left + right) >>> 1;
        if (item > array[mid])
            return searchPos(array, item, mid + 1, right);
        else
            return searchPos(array, item, left, mid);
    }

    private  int searchPos(final long[] array, long item, int left, int right) {
        if (left >= right)
            return left;

        int mid = (left + right) >>> 1;
        if (item > array[mid])
            return searchPos(array, item, mid + 1, right);
        else
            return searchPos(array, item, left, mid);
    }

    private  <T extends Comparable<T>> int searchPos(final T[] array, T item, int left, int right) {
        if (left >= right)
            return left;

        int mid = (left + right) >>> 1;
        int comp = item.compareTo(array[mid]);
        if (comp > 0)
            return searchPos(array, item, mid + 1, right);
        else
            return searchPos(array, item, left, mid);
    }
}
