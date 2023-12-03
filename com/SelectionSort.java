package com;

public class SelectionSort {
    public void selectSort(int[] arr){
        if (arr.length <= 1) return;
        /*
        * 先假定第一个元素 i = 0 为最小值的情况下，用j遍历剩下的元素确定最小值，然后两值比较大小并交换
        * 然后再假定第二个元素为最小值，遍历剩余
        * 因为i是0开始的，所以数组长度减一，又因为只需遍历长度减一次，所以<，综上i < arr.length - 1
        * */
        for (int i = 0; i < arr.length - 1; i++){
            /*因为不是找到最小元素就立即交换，而是要遍历一遍后再确定最小元素，
            期间可能存在多次交换最小元素，所以申请一个中间变量minIndex来存储临时最小值*/
            int minIndex = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
