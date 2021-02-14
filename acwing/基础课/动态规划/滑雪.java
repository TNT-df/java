给定一个R行C列的矩阵，表示一个矩形网格滑雪场。

矩阵中第 i 行第 j 列的点表示滑雪场的第 i 行第 j 列区域的高度。

一个人从滑雪场中的某个区域内出发，每次可以向上下左右任意一个方向滑动一个单位距离。

当然，一个人能够滑动到某相邻区域的前提是该区域的高度低于自己目前所在区域的高度。

下面给出一个矩阵作为例子：

 1  2  3  4 5

16 17 18 19 6

15 24 25 20 7

14 23 22 21 8

13 12 11 10 9
在给定矩阵中，一条可行的滑行轨迹为24-17-2-1。

在给定矩阵中，最长的滑行轨迹为25-24-23-…-3-2-1，沿途共经过25个区域。

现在给定你一个二维矩阵表示滑雪场各区域的高度，请你找出在该滑雪场中能够完成的最长滑雪轨迹，并输出其长度(可经过最大区域数)。

输入格式
第一行包含两个整数R和C。

接下来R行，每行包含C个整数，表示完整的二维矩阵。

输出格式
输出一个整数，表示可完成的最长滑雪长度。

数据范围
1≤R,C≤300,
0≤矩阵中整数≤10000
输入样例：
5 5
1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
输出样例：
25

import java.util.*;

/**
 * @Author: tnt-DF
 * @Date: 2021/2/14 17:10
 * @Description:
 * @Version: 1.0
 */



public class Main{
    static int n;
    static int m;
    static int dx[]={-1,0,1,0};
    static int dy []={0,1,0,-1};
    static final int N = 301;
    static int f[][] = new int[N][N];
    static int h[][] = new int[N][N];

    static int dp(int x,int y) {
        if (f[x][y] == -1) {
            f[x][y] = 1;
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i];
                int b = y + dy[i];
                if (a >= 1 && a <= n && b >= 1 && b <= m && h[a][b] < h[x][y]) {
                    f[x][y] = Math.max(f[x][y], dp(a, b) + 1);
                }
            }
        }
        return f[x][y];
    }
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            m = scan.nextInt();
            for(int i = 1;i <= n;i++ )
                for(int j = 1; j<=m;j++){
                    h[i][j] = scan.nextInt();
                    f[i][j] = -1;
                }
            int res = 0;
            for(int i = 1 ;i <=n ;i++){
                for(int j = 1; j<=m;j++){
                    res =Math.max(res,dp(i,j));
                }
            }
            System.out.println(res);
        }
    }
