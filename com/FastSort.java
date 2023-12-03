package com;

import java.util.Arrays;

public class FastSort {
    public static void main(String[] args){
        int[] arr = {4,1,2,3,5,14,23,12,7,14};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int left, int right) {
        if(left >= right) {//终止条件，如果左边界下标等于右边界下标，或者大于右边界下标的时候，
            // 说明当前数组的长度已经是1乃至该数组物理上不存在了，
            // 因此就直接返回，终止递归，这里是递归出口。
            return ;
        }
        int i = left,j = right,base = arr[i];//根据传入的左右边界声明出两个游标，
        // 同时指定好基准数，我们命名为base
        while(i!=j) {//只要左右游标不相等，说明二者没有相遇，循环就会继续执行
            while(i<j && arr[j] >= base) {//j游标先行，只要j游标指向的数值大于基准数，
                // j游标就开始游移，需要注意的是在j游标游移的过程中也会时刻注意到i和j游标是否相遇了，
                // 只要相遇就停止
                j--;//j游标是往前走
            }
            while(i<j && arr[i] <= base) {//i游标后走，只要是i游标指向的数值小于基准数，
                // i游标就开始游移，需要注意的是i游标在游移的过程中也会时刻注意到i和j游标是否相遇了，
                // 只要相遇就停止
                i++;
            }
            int temp = arr[j];//在退出上边的外循环之后，说明二者均指向了需要被交换的元素，
            // 也就是说i指向了一个大于基准数的元素，j指向了一个小于基准数的元素，因此二者发生交换。
            // 如果此时两数不是因为这种指向情况而导致的交换，是由于相遇导致的交换，那么这个交换将没有意义
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[left] = arr[i];//与基准数交换，此时我们已经找到了基准数的准确位置，
        // 我们将基准数与当前位置上的元素进行一次交换
        arr[i] = base;


        quickSort(arr, left, i-1);//递归的处理当前两个游标位置的右边无序数组
        quickSort(arr, i+1,right);//递归的处理当前两个游标位置的左边无序数组
    }
}
