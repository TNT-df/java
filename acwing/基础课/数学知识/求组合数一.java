给定n组询问，每组询问给定两个整数a，b，请你输出Cba mod (109+7)的值。

输入格式
第一行包含整数n。

接下来n行，每行包含一组a和b。

输出格式
共n行，每行输出一个询问的解。

数据范围
1≤n≤10000,
1≤b≤a≤2000
输入样例：
3
3 1
5 3
2 2
输出样例：
3
10
1
//递推 c(n,m) = c(n-1,m-1)+c(n-1,m);
import java.util.*;

public class Main{
    static final int N = 2010;
    static final int mod = (int)1e9+7;
    static int n;
    static int c[][] = new int[N][N];

    static void init(){
        for(int i = 0;i < N; i++){
            for(int j = 0 ;j <= i;j++){
                if(j == 0){
                    c[i][j] = 1;
                }else{
                    c[i][j] = (c[i-1][j]+c[i - 1][j - 1]) % mod;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        init();
        while(n -- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(c[a][b]);
        }
    }
}

