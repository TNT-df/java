给定一个n个点m条边的无向图，图中可能存在重边和自环。

请你判断这个图是否是二分图。

输入格式
第一行包含两个整数n和m。

接下来m行，每行包含两个整数u和v，表示点u和点v之间存在一条边。

输出格式
如果给定图是二分图，则输出“Yes”，否则输出“No”。

数据范围
1≤n,m≤105
输入样例：
4 4
1 3
1 4
2 3
2 4
输出样例：
Yes

//二分图的条件 当且仅当图中不含奇数环
import java.util.*;

public class Main{
    static int n;
    static int m;
    static int idx = 0;
    static final int N = 100010;
    static final int M =N * 2;
    static int [] ne  = new int [M];
    static int [] h = new int[N];
    static int [] e = new int[M];
    static int [] color = new int [N];

    static void add(int a ,int b){
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }
    //染色
    static boolean dfs(int x, int c){
        color[x] = c;
        for(int i = h[x];i != -1 ;i = ne[i]){
            int j = e[i];
            if(color[j] == 0){
                if(!dfs(j,3 - c)) return false;
            }
            else if(color[j] == c) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Arrays.fill(h ,-1);
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        while( m -- > 0 ){
            int a =in.nextInt();
            int b = in.nextInt();
            add(a,b);
            add(b,a);
        }
        boolean flag = true;
        for(int i = 1; i <= n ;i++){
           if(color[i] == 0){
                if(!dfs(i,1)){
                flag = false;
                break;
            }
           }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}

