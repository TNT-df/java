给定一个n个点m条边的有向图，图中可能存在重边和自环， 边权可能为负数。

请你判断图中是否存在负权回路。

输入格式
第一行包含整数n和m。

接下来m行每行包含三个整数x，y，z，表示存在一条从点x到点y的有向边，边长为z。

输出格式
如果图中存在负权回路，则输出“Yes”，否则输出“No”。

数据范围
1≤n≤2000,
1≤m≤10000,
图中涉及边长绝对值均不超过10000。

输入样例：
3 3
1 2 -1
2 3 4
3 1 -4
输出样例：
Yes

import java.util.*;

public class Main{
    static int idx;
    static int n;
    static int m;
    static final int N = 100010;
    static int[] e =  new int [N * 2];
    static int[] ne = new int[N * 2];
    static int[]  h = new int[N];
    static int[]  dist = new int[N];
    static boolean [] st = new boolean[N];
    static int cnt[] = new int [N];
    static int w[] = new int [N];

    static void add(int x ,int y, int z){
        e[idx] = y;
        ne[idx] = h[x];
        w[idx] =z;
        h[x] = idx++;
    }

    static boolean spfa(){
        Arrays.fill(dist,0x3f3f3f3f);
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        dist[1] = 0;
		//先将所有点加入队列
        for(int i = 1; i<=n;i++){
            st[i] = true;
            q.offer(i);
        }
        while(!q.isEmpty()){
            int temp = q.poll();
            st[temp] = false;
            for(int i = h[temp] ;i != -1 ;i = ne[i]){
                int j = e[i];
                   if(dist[j]> dist[temp]+w[i]){
                      dist[j] = dist[temp] +w[i];
                      cnt[j] = cnt[temp] +1;
                    if(cnt[j] >= n) return true;//抽屉原理，n个点最多有n-1条边；
					
                    if(!st[j]){
                    q.offer(j);
                    st[j] = true;
                }
             }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        Arrays.fill(h,-1);
         while(m -- >0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            add(a,b,c);
        }
        if(spfa()) System.out.println("Yes");
        else System.out.println("No");
    }
}

