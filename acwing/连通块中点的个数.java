给定一个包含n个点（编号为1~n）的无向图，初始时图中没有边。

现在要进行m个操作，操作共有三种：

“C a b”，在点a和点b之间连一条边，a和b可能相等；
“Q1 a b”，询问点a和点b是否在同一个连通块中，a和b可能相等；
“Q2 a”，询问点a所在连通块中点的数量；
输入格式
第一行输入整数n和m。

接下来m行，每行包含一个操作指令，指令为“C a b”，“Q1 a b”或“Q2 a”中的一种。

输出格式
对于每个询问指令”Q1 a b”，如果a和b在同一个连通块中，则输出“Yes”，否则输出“No”。

对于每个询问指令“Q2 a”，输出一个整数表示点a所在连通块中点的数量

每个结果占一行。

数据范围
1≤n,m≤105
输入样例：
5 5
C 1 2
Q1 1 2
Q2 1
C 2 5
Q2 5
输出样例：
Yes
2
3

package com.df.acwing.DataSTRUCT;

import java.io.*;

/**
 * @Author TNT-df
 * @Date 2021/1/3 20:08
 * @Description  连通块中点的数量
 */
public class AC837 {
    static final int N = 100010;
    static int[] p = new int[N];
    static int[] size = new int[N]; //存储每个集合中节点的个数

    public static int find(int x) {
        if (p[x] != x) {
            x = find(p[x]);
        }
        return x;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        for (int i = 1; i <= n; i++) {
            p[i] = i;
            size[i] = 1;
        }
        while (m-- > 0) {
            String[] st = reader.readLine().split(" ");

            if (st[0].equals("C")) {
                int a = Integer.valueOf(st[1]);
                int b = Integer.valueOf(st[2]);
                a = find(a);
                b = find(b);
                if (a != b ) {
                    p[a] = b;   //集合a 和集合b 联通后将 集合a中的元素个数加入到集合b中
                    size[b] += size[a];
                }
            } else if (st[0].equals("Q1")) {
                int a = Integer.valueOf(st[1]);
                int b = Integer.valueOf(st[2]);
                if (find(a) == find(b)) {
                    writer.write("Yes\n");
                } else {
                    writer.write("No\n");
                }
            } else {
                int a = Integer.valueOf(st[1]);
                writer.write(size[find(a)] + "\n");
            }
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}

