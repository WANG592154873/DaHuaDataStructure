package cn.sort.simple;

import java.util.Arrays;


public class SimpleSort {

    //交换元素
    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //标准冒泡排序
    public void BubbleSort(int arr[],int len){
        System.out.println("要排序的数组为："+Arrays.toString(arr));
        int m = 1;
        for(int i = 0;i < len-1;i++){
            /*
            冒泡外排序：数组长度为n，每进行一次比较减少一次循环次数，5个元素第一次
            循环4次，第二次循环3次，第三次循环2次，第四次循环1次...
             */
            for(int j = len-1;j >0;j--){
                /*
                冒泡内排序：数组的长度为n，最后一个元素为arr[n-1]，故j等于n-1
                从n-1开始，比较n-1和n-2，即比较j和j-1，如果是正序，从小到大，
                那就是左大又小，用大于号，反之同理。
                 */
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }
                System.out.println("第" + (m++)+"次冒泡排序结果："+Arrays.toString(arr));
            }

        }
    }
    //改进的冒泡排序 - 加入一个标志位，如果不存在交换，则结束排序
    public void BubbleSort_AddFlag(int arr[],int len){
        System.out.println("要排序的数组为："+Arrays.toString(arr));
        int m = 1;
        for(int i = 0;i < len-1;i++){
            boolean flag = false;
            /*
            冒泡外排序：数组长度为n，每进行一次比较减少一次循环次数，5个元素第一次
            循环4次，第二次循环3次，第三次循环2次，第四次循环1次...
             */
            for(int j = len-1;j >0;j--){
                /*
                冒泡内排序：数组的长度为n，最后一个元素为arr[n-1]，故j等于n-1
                从n-1开始，比较n-1和n-2，即比较j和j-1，如果是正序，从小到大，
                那就是左大又小，用大于号，反之同理。
                 */
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
            System.out.println("第" + (m++)+"次冒泡排序结果："+Arrays.toString(arr));
        }
    }
    //简单选择排序
    public void SimpleSelectSort(int arr[], int len){
        for(int i = 0;i < len-1;i++){
            int min = i;//设定最小值
            for(int j = i + 1;j< len;j++){
                /*
                 内循环：便利最小值后边的数字，如果小于最小值，则更换min记录的索引
                 */
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min!=i){//如果目前位置不是最小值，则跟最小值索引指向的数字更换
                swap(arr,min,i);
            }
        }
    }
    //直接插入排序
    public void InsertSort(int[] arr,int len){
        int temp,i,j;
        for(i=1;i<len;i++){
            temp = arr[i];//目前的数值存到temp中，作为待比较数值
            for(j=i-1;j>=0&&arr[j]>temp;j--){
                arr[j+1]=arr[j];//将大于temp的值整体后移一个单位
            }
            arr[j+1]=temp;

        }

    }


}
