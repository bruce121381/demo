package com.weilaicheng.demo.bubblesort;

import java.util.Arrays;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/15
 *
 * @author xiangzhi.meng
 */
public class BubbleSort {


    /**
     * 冒泡排序
     *
     * @param array
     */
    public static void bubbleSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            //有序标记
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                //升序 ---> 稳定 && 优化不必要比较
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    //交换 --> 非有序排序
                    isSorted = false;
                }

            }
            if(isSorted){
                break;
            }
        }
    }


    public static void main(String[] args) {
        int array[] = new int[]{5, 9, 8, 1, 4, 2, 6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }




}
