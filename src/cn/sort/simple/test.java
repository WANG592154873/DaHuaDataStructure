package cn.sort.simple;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {2,5,7,55,3,23};

        System.out.println("原始的数组为："+ Arrays.toString(arr));

        System.out.println("===============简单排序===============");
        SimpleSort ss = new SimpleSort();
        int[] BubbleSort_arr = Arrays.copyOf(arr,arr.length);
        ss.BubbleSort_AddFlag(BubbleSort_arr,BubbleSort_arr.length);
        System.out.println("改进的冒泡排序："+Arrays.toString(BubbleSort_arr));


        int[] SimpleSelectSort_arr = Arrays.copyOf(arr,arr.length);
        ss.SimpleSelectSort(SimpleSelectSort_arr,SimpleSelectSort_arr.length);
        System.out.println("简单选择排序："+Arrays.toString(SimpleSelectSort_arr));

        int[] InsertSort_arr = Arrays.copyOf(arr,arr.length);
        ss.InsertSort(InsertSort_arr,InsertSort_arr.length);
        System.out.println("简单插入排序："+Arrays.toString(InsertSort_arr));


        System.out.println("===============高级排序===============");
        ComplexSort cs = new ComplexSort();
        int[] QuickSort_arr = Arrays.copyOf(arr,arr.length);
        cs.QuickSort(QuickSort_arr,0,QuickSort_arr.length-1);
        System.out.println("快速排序："+Arrays.toString(QuickSort_arr));
    }
}
