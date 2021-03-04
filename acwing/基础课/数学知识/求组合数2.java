给定n组询问，每组询问给定两个整数a，b，请你输出Cba mod (109+7)的值。

输入格式
第一行包含整数n。

接下来n行，每行包含一组a和b。

输出格式
共n行，每行输出一个询问的解。

数据范围
1≤n≤10000,
1≤b≤a≤105
输入样例：
3
3 1
5 3
2 2
输出样例：
3
10
1
import java.util.*;
//快速幂求逆元
public class Main{
    static final long mod = (int)1e9 + 7;
    static int n ;
    static final int N = 100010;
    static long  fac[] = new long [N];
    static long infac[] = new long[N];

    static long qmi(long a,long b,long p ){
        long res = 1 ;
        while(b>0){
            if((b & 1) == 1) res =res * a %p;
            a = a *a %p;
            b>>=1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
         fac[0] = infac[0] = 1;
         for(int i = 1 ;i < N;i++){
             fac[i] = i * fac[i - 1] % mod;
             infac[i] = infac[i -1] * qmi(i, mod -2 ,mod)%mod ;
         }
        while(n -- >0){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println( fac[a]*infac[b]%mod *infac[a-b] %mod);
        }
    }
}

