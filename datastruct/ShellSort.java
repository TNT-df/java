package com.df.Datastruct.sort;

import java.util.Arrays;

/**
 * @Author TNT-df
 * @Date 2020/12/17 12:59
 * @Description ShellSort排序
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] a = new int[]{5, 6, 9, 5, 4, 2, 4, 1, 1, 5};
        System.out.println(Arrays.toString(a));
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void shellSort(int a[]) {
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            //分成gap个组,分别对组中元素进行插入排序
            for (int i = gap; i < a.length; i++) {
                int j = i;
                int temp = a[j];
                if (a[j] < a[j - gap]) {
                    while (j - gap >= 0 && temp < a[j - gap]) {
                        //移动
                        a[j] = a[j - gap];
                        j -= gap;
                    }
                    //退出循环,找到插入位置
                    a[j] = temp;
                }
            }
        }
    }
}