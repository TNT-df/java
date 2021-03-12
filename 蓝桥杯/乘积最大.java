给定 N 个整数 A1,A2,…AN。

请你从中选出 K 个数，使其乘积最大。

请你求出最大的乘积，由于乘积可能超出整型范围，你只需输出乘积除以 1000000009 的余数。

注意，如果 X<0， 我们定义 X 除以 1000000009 的余数是负(−X)除以 1000000009 的余数，即：0−((0−x)%1000000009)
输入格式
第一行包含两个整数 N 和 K。

以下 N 行每行一个整数 Ai。

输出格式
输出一个整数，表示答案。

数据范围
1≤K≤N≤105,
−105≤Ai≤105
输入样例1：
5 3
-100000
-10000
2
100000
10000
输出样例1：
999100009
输入样例2：
5 3
-100000
-100000
-2
-100000
-100000
输出样例2：
-999999829

/*
 1. 先将数组进行排序。
 2.判断数组中是否为全负数。
  2.1 若k为奇数，则结果为负数，应从后向前取最大
  2.2 若k为偶数，则结果为偶数，应从前向后取最大
 3.若既有负数也有正数
  3.1 若k为奇数，则 res先存储最大值，按照 偶数处理
  3.2 若k为偶数，则分别比较两端,讲大的结果放入乘res，k-2，直到k为0；
*/
import java.util.*;

public class Main{
    static final long mod = 1000000009;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long f[] = new long[n];
        for(int i = 0;i < n;i++)
            f[i] = in.nextLong();
            Arrays.sort(f);
        long res = 1;
        boolean flag = false;
        if(f[n - 1] < 0)
            flag  = false;
        else flag = true;
        if(!flag){
            if((k & 1) == 1){
                for(int i = n-1,j = 0;j < k;i--,j++){
                    res = (res * f[i]) %mod;
                }
            }else{
                for(int i = 0;i<k;i++){
                    res = (res *f[i]) %mod;
                }
            }
        }else{
             int l = 0, r = n -1;
            if((k & 1) == 1){
                res = f[r--];
                 k--;
            }
             while(k > 0){
                 long temp = f[l] * f[l + 1];
                 long temp1 = f[r] * f[r - 1];
                 if(temp >  temp1){
                     res =  (res * (temp % mod)) % mod;
                     l +=2;
                 }else{
                      res = (res * (temp1% mod)) %mod;
                     r -=2;
             }
              k -= 2;
        }
    }
    System.out.println(res);
 }
 }