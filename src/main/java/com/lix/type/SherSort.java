package com.lix.type;

import java.util.Arrays;

public class SherSort {
    public static void main(String[] args) {
        int[] nums = {9, 5, 26, 65, 3, 45, 83, 12, 88, 45, 88};
        //sherSort(nums, 5);
        shellSort2(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void sherSort(int[] nums, int i) {
        int k = nums.length;
        int sd = k / 2;
        for (int j = 0; j < sd; j++) {

        }
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

    private static void shellSort2(int[] a) {
        int n = a.length;
        int i, j, k, gap;
        for (gap = n / 2; gap > 0; gap /= 2) {
            for (i = 0; i < gap; i++) {
                for (j = i + gap; j < n; j += gap) {
                    int temp = a[j];
                    for (k = j - gap; k >= 0 && a[k] > temp; k -= gap) {
                        a[k + gap] = a[k];
                    }
                    a[k + gap] = temp;
                }
            }
        }
    }
}
