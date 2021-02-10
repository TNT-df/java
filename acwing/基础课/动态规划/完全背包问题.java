有 N 种物品和一个容量是 V 的背包，每种物品都有无限件可用。

第 i 种物品的体积是 vi，价值是 wi。

求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
输出最大价值。

输入格式
第一行两个整数，N，V，用空格隔开，分别表示物品种数和背包容积。

接下来有 N 行，每行两个整数 vi,wi，用空格隔开，分别表示第 i 种物品的体积和价值。

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
10
/*
  f[i][j] = f[i-1][j-v[i]*k]+w[i]*k;
*/
import java.util.*;

public class Main{
    static int n;
    static int m;
    static int [] f = new int[1010];
    static int[] v= new int[1010];
    static int[] w = new int[1010];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        
        for(int i = 1 ;i <= n ;i++){
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }
        
        for(int i = 1;i <=n ;i++){
            for(int j =v[i] ;j<=m;j++){

                    f[j] = Math.max(f[j],f[j-v[i]]+w[i]);
            }
        }
        System.out.println(f[m]);
    }
}

