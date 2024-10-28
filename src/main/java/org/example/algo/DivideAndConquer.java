package org.example.algo;

public class DivideAndConquer {

    public static int findMin(int[] n, int lo, int hi) {

        if (lo > hi) return Integer.MAX_VALUE;

        if (lo == hi) return n[lo];

        int mid = (lo + hi) / 2;

        int leftMin = findMin(n, lo, mid);
        int rightMin = findMin(n, mid+1, hi);

        return Math.min(leftMin, rightMin);
    }
}
