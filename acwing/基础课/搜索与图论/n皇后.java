package com.df.acwing.SearchandGraph;

import java.util.Scanner;



/**
 * @Author TNT-df
 * @Date 2021/1/7 23:07
 * @Description dfs nª ∫ÛŒ Ã‚
 */
public class AC843 {
    static final int N= 20;
    static int n;
    static char[][] g = new char[N][N];
    static boolean[] b = new boolean[N];
    static boolean[] zdj = new boolean[N];
    static boolean[] fdj = new boolean[N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                g[i][j] ='.';
            }
        }

        dfs(0);
    }

    public static void dfs(int x) {
        if (x == n) {
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    System.out.print(g[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++){
            if(!b[i]&&!zdj[i+x]&&!fdj[n-x+i]){
                g[x][i] ='Q';
                b[i] = zdj[i+x] =fdj[n-x+i]=true;
                dfs(x+1);
                b[i] = zdj[i+x] =fdj[n-x+i]=false;
                g[x][i] ='.';
            }
        }
    }
}
