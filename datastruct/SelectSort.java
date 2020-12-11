package com.df.tnt;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
 int a []  = new int[]{3,4,2,1,5,6};
        System.out.println(Arrays.toString(a));
         selectSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void selectSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int midIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                    midIndex = j;
                }
            }
            if (midIndex != i) {
                a[midIndex] = a[i];
                a[i] = min;
            }
        }
    }
}
