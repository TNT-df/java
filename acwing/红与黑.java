有一间长方形的房子，地上铺了红色、黑色两种颜色的正方形瓷砖。

你站在其中一块黑色的瓷砖上，只能向相邻（上下左右四个方向）的黑色瓷砖移动。

请写一个程序，计算你总共能够到达多少块黑色的瓷砖。

输入格式
输入包括多个数据集合。

每个数据集合的第一行是两个整数 W 和 H，分别表示 x 方向和 y 方向瓷砖的数量。

在接下来的 H 行中，每行包括 W 个字符。每个字符表示一块瓷砖的颜色，规则如下

1）‘.’：黑色的瓷砖；
2）‘#’：白色的瓷砖；
3）‘@’：黑色的瓷砖，并且你站在这块瓷砖上。该字符在每个数据集合中唯一出现一次。

当在一行中读入的是两个零时，表示输入结束。

输出格式
对每个数据集合，分别输出一行，显示你从初始位置出发能到达的瓷砖数(记数时包括初始位置的瓷砖)。

数据范围
1≤W,H≤20
输入样例：
6 9 
....#. 
.....# 
...... 
...... 
...... 
...... 
...... 
#@...# 
.#..#. 
0 0
输出样例：
45

import java.io.*;
import java.util.Scanner;


/**
 * @Author TNT-df
 * @Date 2021/1/12 12:42
 * @Description 红与黑
 */

public class Main {
    static int n=0;
    static int m=0;
    static int m1=0;
    static int n1=0;
    static char a[][] = new char[25][25];
    static int[] z = {-1, 0, 1, 0};
    static int[] j = {0, 1, 0, -1};
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        while (true) {
            String[] str = reader.readLine().split(" ");

            m = Integer.parseInt(str[1]);
            n = Integer.parseInt(str[0]);
            if (m == 0 && n == 0) {
                break;
            }
            m1 = m;
            n1 =n;
            boolean b[][] = new boolean[m][n];
            int x = 0, y = 0;
            for (int i = 0; i < m; i++) {
                String s = reader.readLine();
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.charAt(j);
                    if (a[i][j] == '@') {
                        x = i;
                        y = j;
                    }
                }
            }
            System.out.println(dfs(x, y, b));
        }


    }
    public static int dfs(int x, int y, boolean[][] b) {

      if(x<0||x>=m1||y<0||y>=n1){
          return 0;
      }
      if(b[x][y] ||a[x][y] =='#'){
          return 0;
      }
      b[x][y] = true;
      return 1+dfs(x+1,y,b)+dfs(x-1,y,b)+dfs(x,y-1,b)+dfs(x,y+1,b);
    }

}
