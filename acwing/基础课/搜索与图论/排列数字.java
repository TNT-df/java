����һ������n��������1~n�ų�һ�ţ������кܶ������з�����

���ڣ����㰴���ֵ������е����з��������

�����ʽ
��һ�У�����һ������n��

�����ʽ
���ֵ�������������з�����ÿ������ռһ�С�

���ݷ�Χ
1��n��7
����������
3
���������
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
 * @Description  DFS����
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
