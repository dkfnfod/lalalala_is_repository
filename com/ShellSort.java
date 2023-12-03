package com;

import java.util.Arrays;

public class ShellSort {

    public static void shellSort(int[] arr){
        int n = arr.length;
        // 初始化增量为 n/2，不断缩小增量直到 1
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 对每个子序列进行插入排序
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 4, 2 };
        shellSort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

    }

}
