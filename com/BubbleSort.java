package com;

public class BubbleSort {
    void bubbleSort(int[] arr){
        int n = arr.length;
        if (arr == null || n <= 1) return;

        for (int i = n - 1; i >= 1; i--){ //外层循环控制轮数
            for (int j = 0; j < i; j++){  //内层循环比较相邻元素
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arr[j];
                }
            }
        }
    }
}
