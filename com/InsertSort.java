package com;

public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {  //外层循环表示轮数
            for (int j = i - 1; j < i; j--) {      //内层循环表示比较相邻两元素大小
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else break;
            }
        }
    }
}