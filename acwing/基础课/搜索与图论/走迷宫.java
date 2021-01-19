给定一个n*m的二维整数数组，用来表示一个迷宫，数组中只包含0或1，其中0表示可以走的路，1表示不可通过的墙壁。

最初，有一个人位于左上角(1, 1)处，已知该人每次可以向上、下、左、右任意一个方向移动一个位置。

请问，该人从左上角移动至右下角(n, m)处，至少需要移动多少次。

数据保证(1, 1)处和(n, m)处的数字为0，且一定至少存在一条通路。

输入格式
第一行包含两个整数n和m。

接下来n行，每行包含m个整数（0或1），表示完整的二维数组迷宫。

输出格式
输出一个整数，表示从左上角移动至右下角的最少移动次数。

数据范围
1≤n,m≤100
输入样例：
5 5
0 1 0 0 0
0 1 0 1 0
0 0 0 0 0
0 1 1 1 0
0 0 0 1 0
输出样例：
8
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] a = new int[110][110];
    static int[][] b = new int[110][110];
    static int tt = -1;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         n = in.nextInt();
         m = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = -1;
            }
        }
        b[0][0] = 0;
        bfs();
        System.out.println(b[n - 1][m - 1]);
    }

    static void bfs() {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        while (!queue.isEmpty()) {
            int t[] = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = t[0] + dx[i];
                int y = t[1] + dy[i];
                if (x >= 0 && x < n && y >= 0 && y <= m && b[x][y] == -1 && a[x][y] == 0) {
                    b[x][y] = b[t[0]][t[1]] + 1;
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }
}

