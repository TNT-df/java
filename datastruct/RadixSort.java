package com.df.Datastruct.sort;

import java.util.Arrays;

/**
 * @Author TNT-df
 * @Date 2020/12/27 17:59
 * @Description
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] a = new int[]{223, 581, 759};
        radixSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void radixSort(int[] a) {
        int[][] res = new int[10][a.length];//二维数组作为桶
        int[] k = new int[10];//记录每个桶中的数的个数
        int max = Integer.MIN_VALUE;
        for (int temp : a) {
            if (temp > max) {
                max = temp;
            }
        }
        int times = (max + "").length();
        //排序的次数根据数组中最大值的位数决定
        for (int m = 0, n = 1; m < times; m++, n *= 10){
            //分别根据个位、十位、百位、、进行排序
            for (int i = 0; i < a.length; i++) {
                int temp = a[i] / n % 10;
                res[temp][k[temp]] = a[i];//将当前数据加入对应的桶中
                k[temp]++;//对应桶中的数据+1
            }
            int index = 0;
            //将桶中的数据重新加入到a数组中
            for (int l = 0; l < 10; l++) {
                if (k[l] != 0) {//判断桶中数据是否为空
                    for (int j = 0; j < k[l]; j++) {
                        a[index] = res[l][j];
                        index++;
                    }
                }
                k[l] = 0;//将当前桶中的数的个数清0
            }
        }

    }
}
