输入格式
　　输入的第一行包含两个整数n, m
　　n代表图中的点的个数，m代表边的个数
　　接下来m行，每行2个正整数，表示图中连通的两点。
输出格式
　　输出1个数，与1连通的点的个数。
样例输入
6 3
1 2
2 3
3 4
样例输出
4

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: tnt-DF
 * @Date: 2021/2/18 16:23
 * @Description:与1连通的点的个数
 * @Version: 1.0
 */
public class Main {
    static int[] p;
    static int[] s;
    static int n;
    static int m;

    static int find(int x) {
        if (x != p[x]) {
            x = find(p[x]);
        }
        return x;
    }

    static void union(int x, int y) {
        p[find(x)] = find(y);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        p = new int[n + 1];
        s = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = i;
            s[i] = 1;
        }

        while (m-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (find(a) != find(b)) {
                s[find(b)] += s[find(a)];
                union(a, b);
            }
        }

        System.out.print(s[find(1)]);
    }

}

