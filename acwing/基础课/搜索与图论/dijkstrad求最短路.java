给定一个n个点m条边的有向图，图中可能存在重边和自环，所有边权均为正值。

请你求出1号点到n号点的最短距离，如果无法从1号点走到n号点，则输出-1。

输入格式
第一行包含整数n和m。

接下来m行每行包含三个整数x，y，z，表示存在一条从点x到点y的有向边，边长为z。

输出格式
输出一个整数，表示1号点到n号点的最短距离。

如果路径不存在，则输出-1。

数据范围
1≤n≤500,
1≤m≤105,
图中涉及边长均不超过10000。

输入样例：
3 3
1 2 2
2 3 1
1 3 4
输出样例：
3

1.先初始化距离dist[1]=0,dist[2~n-1]=0x3f3f3f;
2.迭代n次，找没有确定最短路的点中距离最近的点
2.1 将2中的点进行标记
2.2用2中的点更新其他所有点的距离
import java.util.*;

public class Main{
    static final int MAX= 0x3f3f3f3f;
    static final int N =  510;
    static int n;
    static int m;
    static int [][] g = new int[N][N];//邻接矩阵存储稠密图
    static int[]dist = new int[N]; //1号点到当前点的最短距离是多少
    static boolean st[] = new boolean[N];//每个点的最短路是否被确定

    static int dijkstra(){
        for(int i= 1 ;i<=n;i++)
        dist[i] = MAX;
        dist[1] = 0;

        for(int i =0 ;i<n;i++){
            //找到当前没有确定最短路长度点当中距离最短的最小值
             int t = -1;
             for(int j = 1 ;j<=n;j++){
                 if(!st[j] &&( t==-1||dist[t]>dist[j])){
                      t = j;
                 }
             }
             st[t] = true;
             for(int j = 1;j<=n;j++)
                 dist[j] = Math.min(dist[j],dist[t]+g[t][j]);
        }
        if(dist[n] == MAX) return -1;
        else return dist[n];
    }
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
         n = in.nextInt();
         m = in.nextInt();
         for(int i = 1 ;i <= n;i++){
             for(int j =1 ;j<=n;j++)
             g[i][j] = MAX;
         }
     while(m -- >0){
         int a = in.nextInt();
         int b = in.nextInt();
         int w = in.nextInt();
         g[a][b] =Math.min(g[a][b],w);//去掉重边和自环
     }
     System.out.println(dijkstra());
    }
}
。