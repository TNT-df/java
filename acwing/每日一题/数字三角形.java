给定一个如下图所示的数字三角形，从顶部出发，在每一结点可以选择移动至其左下方的结点或移动至其右下方的结点，一直走到底层，要求找出一条路径，使路径上的数字的和最大。

        7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5
输入格式
第一行包含整数n，表示数字三角形的层数。

接下来n行，每行包含若干整数，其中第 i 行表示数字三角形第 i 层包含的整数。

输出格式
输出一个整数，表示最大的路径数字和。

数据范围
1≤n≤500,
10000≤三角形中的整数≤10000
输入样例：
5
7
3 8
8 1 0 
2 7 4 4
4 5 2 6 5
输出样例：
30

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int[][] dp = new int[n][n];
        for(int i = 0;i < n;i ++){
            for(int j = 0;j <=i;j++){
                a[i][j] = in.nextInt();
            }
        }
        dp[0][0] = a[0][0];
        for(int i = 1;i < n;i++){
            for(int j = 0;j <= i;j++){
                if(j == 0){
                    dp[i][j] =dp[i-1][j]+a[i][j];
                }else if(i == j){
                    dp[i][j] =a[i][j]+dp[i-1][j-1];
                }
                else dp[i][j] =Math.max(a[i][j]+dp[i-1][j],a[i][j]+dp[i-1][j-1]);
            }
        }
        int max=0;
     for(int j=0;j<n;j++){
         max = Math.max(dp[n-1][j],max);
     }
        System.out.print(max);
    }
}