给定 V 种货币（单位：元），每种货币使用的次数不限。

不同种类的货币，面值可能是相同的。

现在，要你用这 V 种货币凑出 N 元钱，请问共有多少种不同的凑法。

输入格式
第一行包含两个整数 V 和 N。

接下来的若干行，将一共输出 V 个整数，每个整数表示一种货币的面值。

输出格式
输出一个整数，表示所求总方案数。

数据范围
1≤V≤25,
1≤N≤10000
答案保证在long long范围内。

输入样例：
3 10
1 2 5
输出样例：
10

### 二维
```
import java.util.*;


public class Main{
    static final int N = 30;
    static final int M =10010;
    static long  dp[][] = new long [N][M];
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  
        int m = in.nextInt();
        dp[0][0] = 1;
        for(int i = 1;i <= n ;i++){
            int b =in.nextInt();
            for(int j = 0;j <= m;j++){
               dp[i][j] +=dp[i - 1][j];
               if(j >= b){
                   dp[i][j] +=dp[i][j - b];
               }
            }
        }
        System.out.print(dp[n][m]);
    }
}
```
### 一维
```
import java.util.*;


public class Main{
    static final int N = 30;
    static final int M =10010;
    static long[] dp= new long[M];
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  
        int m = in.nextInt();
        dp[0] = 1;
        for(int i = 1;i <= n ;i++){
            int b =in.nextInt();
            for(int j = b;j <= m;j++){
               dp[j] =dp[j]+dp[j-b];
            }
        }
        System.out.print(dp[m]);
    }
}
```