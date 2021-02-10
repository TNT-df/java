有 N 件物品和一个容量是 V 的背包。每件物品只能使用一次。

第 i 件物品的体积是 vi，价值是 wi。

求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
输出最大价值。

输入格式
第一行两个整数，N，V，用空格隔开，分别表示物品数量和背包容积。

接下来有 N 行，每行两个整数 vi,wi，用空格隔开，分别表示第 i 件物品的体积和价值。

输出格式
输出一个整数，表示最大价值。

数据范围
0<N,V≤1000
0<vi,wi≤1000
输入样例
4 5
1 2
2 4
3 4
4 5
输出样例：
8
//原始  
/*
f[i][j]：从前i个物品中选择，体积不超过j的物品的最大价值.s
*/
public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int V = in.nextInt();
        int f[][] = new int[N + 2][V + 2];
        int v[] =new int[N + 2];
        int w[] = new int[N + 2];
        for(int i = 1;i <=N; i ++){
            v[i] =in.nextInt();
            w[i] =in.nextInt();
        }
        for(int i = 1;i <= N;i++){
            for(int j = 0;j <= V;j++){
                if(j >= v[i])
                f[i][j] = Math.max(f[i-1][j],f[i-1][j-v[i]]+w[i]);
                else f[i][j] =f[i-1][j];
            }
        }
     System.out.println(f[N][V]);
    }
}
//优化版本
import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int V = in.nextInt();
        int f[] = new int[V + 2];
        int v[] =new int[N + 2];
        int w[] = new int[N + 2];
        for(int i = 1;i <=N; i ++){
            v[i] =in.nextInt();
            w[i] =in.nextInt();
        }
        for(int i = 1;i <= N;i++){
            for(int j = V;j >= v[i];j--){
                f[j] = Math.max(f[j],f[j-v[i]]+w[i]);
            }
        }
     System.out.println(f[V]);
    }
}


