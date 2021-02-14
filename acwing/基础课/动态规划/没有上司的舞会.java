
Ural大学有N名职员，编号为1~N。

他们的关系就像一棵以校长为根的树，父节点就是子节点的直接上司。

每个职员有一个快乐指数，用整数 Hi 给出，其中 1≤i≤N。

现在要召开一场周年庆宴会，不过，没有职员愿意和直接上司一起参会。

在满足这个条件的前提下，主办方希望邀请一部分职员参会，使得所有参会职员的快乐指数总和最大，求这个最大值。

输入格式
第一行一个整数N。

接下来N行，第 i 行表示 i 号职员的快乐指数Hi。

接下来N-1行，每行输入一对整数L, K,表示K是L的直接上司。

输出格式
输出最大的快乐指数。

数据范围
1≤N≤6000,
−128≤Hi≤127
输入样例：
7
1
1
1
1
1
1
1
1 3
2 3
6 4
7 4
4 5
3 5
输出样例：
5
import java.util.*;

public class Main{
    
    static int n ;
    static int [] happy = new int[6010];
    static boolean [] b;
    static int[]ne = new int[6010];
    static int[] e= new  int [6010];
    static int[] h = new int[6010];
    static int idx=0;
    static int f[][] = new int[6010][2];
    
    //创建邻接表
    static void add(int a, int b){
        e[idx] = b;
        ne[idx] = h[a];
        h[a] =idx++;
    }
    //进行深度遍历
    static void dfs(int u){
        f[u][1] =happy[u];
        for(int i =h[u] ;i != -1;i=ne[i]){
            int j = e[i];
            dfs(j);
            f[u][0] +=Math.max(f[j][0],f[j][1]);
            f[u][1] +=f[j][0];
            
        }
    }
     public static void main(String[] args){
           Scanner in = new Scanner(System.in);
           n = in.nextInt();
           b = new boolean[n + 10];
           for(int i = 1 ;i<= n ; i++)
           happy[i] = in.nextInt();
           Arrays.fill(h,-1);
         for(int i = 0 ;i < n - 1;i++){
             int p =in.nextInt();
             int q =in.nextInt();
             add(q,p);
             b[p] = true;
         }
         //找根节点
           int root = -1;
           for(int i = 1 ;i <= n ;i++)
             if(!b[i]){
                 root = i;
                break;
             }
           dfs(root);
           
           System.out.println(Math.max(f[root][0],f[root][1]));
    }
}