package org.example;

import org.example.algo.DivideAndConquer;

public class Main {
    public static void main(String[] args) {

        int[] nums = {38, 27, 43, 10};

        System.out.println("min value: " + DivideAndConquer.findMin(nums, 0, nums.length-1));
    }
}