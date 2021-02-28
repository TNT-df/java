给定一个n个点m条边的有向图，图中可能存在重边和自环， 边权可能为负数。

请你求出1号点到n号点的最短距离，如果无法从1号点走到n号点，则输出impossible。

数据保证不存在负权回路。

输入格式
第一行包含整数n和m。

接下来m行每行包含三个整数x，y，z，表示存在一条从点x到点y的有向边，边长为z。

输出格式
输出一个整数，表示1号点到n号点的最短距离。

如果路径不存在，则输出”impossible”。

数据范围
1≤n,m≤105,
图中涉及边长绝对值均不超过10000。

输入样例：
3 3
1 2 5
2 3 -3
1 3 4
输出样例：
2

import java.util.*;

public class Main{
    static int n;
    static int m;
    static int idx;
    static final int N = 100010;
    static int e[] = new int[N*2];
    static int ne[] = new int[N * 2];
    static int h[] = new int [N];
    static int dist[]  = new int[N];
    static int w[] = new int[N];
    static boolean st[] = new boolean[N];
    
    static void add(int x ,int y ,int z){
        e[idx] = y;
        w[idx] = z;
        ne[idx] = h[x];
        h[x] = idx++;
    }
    static int spfa(){
        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(dist,0x3f3f3f3f);
        dist[1] = 0;
        st[1] = true;
        q.offer(1);
        while(!q.isEmpty()){
            int temp  = q.poll();
            st[temp] = false;
            for(int i = h[temp]; i != -1 ;i = ne[i]){
                int j = e[i];
                if(dist[j]>dist[temp]+w[i]){
                    dist[j] = dist[temp]+w[i];
                if(!st[j]){
                    q.offer(j);
                    st[j] = true;
                }
                }
            }
        }
        return dist[n];
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m  =in.nextInt();
        Arrays.fill(h,-1);
        while(m -- >0){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            add(x,y,z);
        }
       int t =spfa();
       if(t == 0x3f3f3f3f) System.out.println("impossible");
       else  System.out.println(t);
    }
}