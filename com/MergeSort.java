package com;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,7,4,2,0,3,1,6};
        mergeSort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);

    }
    //需要注意的是整个合并过程中并没有将两个被合并的数组单独拎出来，二者始终是存在于一个数组地址上的
    public static void merge(int[] arr,int left,int mid,int right){
        int s1 = left;//根据拿到的左边界，我们定其为第一个数组的指针
        int s2 = mid+1;//根据中间位置，让中间位置右移一个单位，那就是第二个数组的指针
        int[] temp = new int[right - left+1];//根据左右边界相减我们得到这片空间的长度，以此声明额外空间
        int i = 0;//定义额外空间的指针
        while(s1<=mid && s2 <=right){
            if(arr[s1]<=arr[s2]){//如果第一个数组的指针数值小于第二个数组的，那么其放置在临时空间上
                temp[i++] = arr[s1++];
            }else{//否则是第二个数组的数值放置于其上
                temp[i++] = arr[s2++];
            }
        }
        while(s1<=mid){//如果这是s1仍然没有到达其终点，那么说明它还有剩
            temp[i++] = arr[s1++];//因为我们知道每个参与合并的数组都是有序数组，因此直接往后拼接即可
        }
        while(s2<=right){//同上
            temp[i++] = arr[s2++];
        }
        for(int j = 0;j<temp.length;j++){//数组复制
            arr[j+left] = temp[j];
        }
    }

}
