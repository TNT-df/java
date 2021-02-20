问题描述
　　设有N*N的方格图(N<=10),我们将其中的某些方格中填入正整数,而其他的方格中则放入数字0。
　　某人从图的左上角的A 点(1,1)出发，可以向下行走，也可以向右走，直到到达右下角的B点(N,N)。在走过的路上，他可以取走方格中的数（取走后的方格中将变为数字0）。
　　此人从A点到B 点共走两次，试找出2条这样的路径，使得取得的数之和为最大。
输入格式
　　输入的第一行为一个整数N（表示N*N的方格图），接下来的每行有三个整数，前两个表示位置，第三个数为该位置上所放的数。一行单独的0表示输入结束。
输出格式
　　只需输出一个整数，表示2条路径上取得的最大的和。
样例输入
　　8
　　2 3 13
　　2 6 6
　　3 5 7
　　4 4 14
　　5 2 21
　　5 6 4
　　6 3 15
　　7 2 14
　　0 0 0
样例输出
　　67



import java.util.*;

/**
 * @Author: tnt-DF
 * @Date: 2021/2/19 16:14
 * @Description:
 3. 状态转移方程：当i==h&&j==k时，f[i][j][h][k]=max{f[i-1][j][h-1][k],f[i][j-1][h][k-1],f[i-1][j][h][k-1],f[i][j-1][h-1][k])+a[i][j];//取上上，左左，上左，左上四个方向的最大值加上当前的值；

当i!=h&&j!=k时，f[i][j][h][k]=max{f[i-1][j][h-1][k],f[i][j-1][h][k-1],f[i-1][j][h][k-1],f[i][j-1][h-1][k])+a[i][j]+a[h][k];//取上上，左左，上左，左上四个方向的最大值加上两条路径当前的值；
 * @Version: 1.0
 */
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n + 1][n + 1];
        while (true) {
            int x = in.nextInt();
            int y = in.nextInt();
            int val = in.nextInt();
            if (x == 0 && y == 0 && val == 0) break;
            a[x][y] = val;
        }
        int f[][][][] = new int[n + 1][n + 1][n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int m = 1; m <= n; m++) {
                    for (int k = 1; k <= n; k++) {
                        int temp1 = Math.max(f[i - 1][j][m - 1][k], f[i][j - 1][m][k - 1]);
                        int temp2 = Math.max(f[i - 1][j][m][k - 1], f[i][j - 1][m - 1][k]);
                        f[i][j][m][k] = Math.max(temp1, temp2) + a[i][j];
                        if (i != m && j != k) f[i][j][m][k] += a[m][k];
                    }
                }
            }
        }
        System.out.println(f[n][n][n][n]);
    }

}
