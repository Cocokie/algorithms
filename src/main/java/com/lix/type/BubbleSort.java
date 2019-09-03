package com.lix.type;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {9, 5, 26, 65, 3, 45, 83, 12,88,45,88};
        bubbleSort(nums);
    }


    //基本的冒泡排序,属于快速排序
    public static void bubbleSort(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i; j++) {
                if (nums[j] >= nums[j + 1]) {
                    k = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = k;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
