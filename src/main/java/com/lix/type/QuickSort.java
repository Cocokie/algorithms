package com.lix.type;

import java.util.Arrays;

public class QuickSort {
    //快速排序，是冒泡排序的改进
    public static void main(String[] args) {
        int[] nums = {9, 5, 26, 65, 3, 45, 83, 12, 88, 45, 88};
        int low = 0;
        int high = nums.length - 1;
        quickSort(low, high, nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int thelow, int thehigh, int[] nums) {
        System.out.println(Arrays.toString(nums));

        int high = thehigh;
        int low = thelow;
        int flag = nums[low];
        if (low < high) {
            while (low != high) {
                while (flag <= nums[high] && low < high) {
                    high--;
                }
                nums[low] = nums[high];
                nums[high] = flag;
                while (flag >= nums[low] && low < high) {
                    low++;
                }

                nums[high] = nums[low];
                nums[low] = flag;
            }
            quickSort(thelow, low - 1, nums);
            quickSort(high + 1, thehigh, nums);
        }

    }


}
