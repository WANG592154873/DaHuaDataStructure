package cn.sort.simple;

public class ComplexSort {
    /***
     * 快速排序
     * @param arr 输入数组
     * @param left 数组最左侧的索引
     * @param right 数组最右侧的索引
     */
    public void QuickSort(int[] arr, int left, int right){
        SimpleSort ss = new SimpleSort();
        if(left > right){
            return;
        }
        int base = arr[left];
        int i = left;
        int j = right;
        while(i!=j){
            while(arr[j]>=base&&j>i){//先找比base小的值，从right开始
                j--;
            }
            while(arr[i]<=base&&j>i){//从base开始，也就是left找比base大的
                i++;
            }
            ss.swap(arr,i,j);//进行交换

        }
        arr[left] = arr[i];
        arr[i] = base;//把之前的base和结束的位置做交换
        this.QuickSort(arr,left,i-1);
        this.QuickSort(arr,i+1,right);

    }

}
