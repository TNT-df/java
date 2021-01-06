给定一个整数n，将数字1~n排成一排，将会有很多种排列方法。

现在，请你按照字典序将所有的排列方法输出。

输入格式
共一行，包含一个整数n。

输出格式
按字典序输出所有排列方案，每个方案占一行。

数据范围
1≤n≤7
输入样例：
3
输出样例：
1 2 3
1 3 2
2 1 3
2 3 1
3 1 2
3 2 1

package com.df.acwing.SearchandGraph;

import java.util.Scanner;

/**
 * @Author TNT-df
 * @Date 2021/1/6 23:16
 * @Description  DFS排列
 */
public class AC842 {
    static final int N =10;
    static int[] ret = new int[N];
    static boolean[] b = new boolean[N];
    static int n;
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         n = in.nextInt();
        dfs(0);
    }

    public static void dfs(int k){
         if(k == n){
             for(int i = 0;i<n;i++){
                 System.out.print(ret[i]+" ");
             }
             System.out.println();
             return;
         }
         for(int i = 1 ;i <= n;i++){
             if(!b[i]){
                 ret[k] = i;
                 b[i] = true;
                 dfs(k+1);
                 b[i] =false;
             }

         }
    }
}
