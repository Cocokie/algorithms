package com.lix.type;

import java.util.Arrays;

public class InsertSort {
    //简单直接插入排序
    public static void main(String[] args) {
        int[] nums = {9, 5, 26, 65, 3, 45, 83, 12, 88, 45, 88};
        insertSort(nums);
    }


    public static void insertSort(int[] nums) {
        int k = 0;
        int s = 0;
        for (int i = 1; i < nums.length; i++) {
            k = nums[i];
            if (nums[i] >= nums[i - 1]) {
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (k <= nums[j]) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
                s = j;
            }
            nums[s] = k;
        }
        System.out.println(Arrays.toString(nums));
    }
}
