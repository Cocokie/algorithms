package com.lix.type;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {9, 5, 26, 65, 3, 45, 83, 12, 88, 45, 88};
        SelectSort(nums);
    }

    public static void SelectSort(int[] nums) {
        int sd = 0;
        while (sd != nums.length) {
            minNum(nums, sd++);
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void minNum(int[] nums, int sd) {
        int indexmin = 0;
        int min = nums[sd];
        for (int i = sd; i < nums.length; i++) {
            if (min >= nums[i]) {
                min = nums[i];
                indexmin = i;
            }
        }
        nums[indexmin] = nums[sd];
        nums[sd] = min;
    }
}
