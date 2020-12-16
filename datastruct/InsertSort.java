package com.df.Datastruct.sort;

import java.util.Arrays;

/**
 * @Author TNT-df
 * @Date 2020/12/16 21:53
 * @Description 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int a[] = new int[]{3, 1, 2, 0, 2};
        System.out.println(Arrays.toString(a));
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int insertVal = a[i]; //待插入的数
            int insertIndex = i - 1; //待插入数前面的数的下标
            //insertIndex >= 0 保证插入位置没有越界
            // insertVal < a[insertIndex] 未找到合适的位置
            while (insertIndex >= 0 && insertVal < a[insertIndex]) {
                a[insertIndex + 1] = a[insertIndex];
                insertIndex--;
            }
            //判断是否需要赋值,若不赋值则说明待插入前的数有序,反之,将待插入的数插入适当的位置.
            if (i != insertIndex) {
                a[insertIndex + 1] = insertVal;
            }
        }
    }
}
