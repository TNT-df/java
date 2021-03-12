小明几乎每天早晨都会在一家包子铺吃早餐。

他发现这家包子铺有 N 种蒸笼，其中第 i 种蒸笼恰好能放 Ai 个包子。

每种蒸笼都有非常多笼，可以认为是无限笼。

每当有顾客想买 X 个包子，卖包子的大叔就会迅速选出若干笼包子来，使得这若干笼中恰好一共有 X 个包子。

比如一共有 3 种蒸笼，分别能放 3、4 和 5 个包子。

当顾客想买 11 个包子时，大叔就会选 2 笼 3 个的再加 1 笼 5 个的（也可能选出 1 笼 3 个的再加 2 笼 4 个的）。

当然有时包子大叔无论如何也凑不出顾客想买的数量。

比如一共有 3 种蒸笼，分别能放 4、5 和 6 个包子。

而顾客想买 7 个包子时，大叔就凑不出来了。

小明想知道一共有多少种数目是包子大叔凑不出来的。

输入格式
第一行包含一个整数 N。

接下来 N 行，每行包含一个整数 Ai。

输出格式
输出一个整数代表答案。

如果凑不出的数目有无限多个，输出INF。

数据范围
1≤N≤100,
1≤Ai≤100
输入样例1：
2
4
5
输出样例1：
6
输入样例2：
2
4
6
输出样例2：
INF
样例解释
对于样例1，凑不出的数目包括：1, 2, 3, 6, 7, 11。
对于样例2，所有奇数都凑不出来，所以有无限多个。



/*
任意两个数的组合必定是他们gcd的任意两个数的组合必定是他们gcd的倍数
会出现有无限个数被凑不出来的， 说明这些数的gcd不是1.
然后使用完全背包进行求解
*/
import java.util.*;

public class Main{
    
    static int gcd (int a, int b){
        return b > 0 ? gcd(b, a % b) : a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f[] = new int[n + 10];
        int d = 0;
        for(int i = 1;i <= n;i++){
             f[i] = in.nextInt();
             d = gcd(d,f[i]);
        }
        boolean dp[][] = new boolean[n+10][10010];
        if(d != 1){
            System.out.println("INF");
        }else{
            dp[0][0] = true;
            for (int i = 1;i <= n ;i++){
                for(int j = 0 ;j <=10000;j++){
                    dp[i][j] = dp[i - 1][j] || (j >= f[i] ? dp[i][j - f[i]] : false);
                }
            }
            int ans = 0;
            for(int j = 0;j <= 10000;j++){
                if(!dp[n][j]) ans ++;
            }
            System.out.println(ans);
        }
    }
}