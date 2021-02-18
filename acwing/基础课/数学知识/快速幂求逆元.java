给定n组ai,pi，其中pi是质数,求ai模pi的乘法逆元，若逆元不存在则输出impossible。

注意：请返回在0∼p−1之间的逆元。

乘法逆元的定义
若整数b，m互质，并且对于任意的整数 a，如果满足b|a，则存在一个整数x，使得a/b≡a∗x(mod m)，则称x为b的模m乘法逆元，记为b−1(mod m)。
b存在乘法逆元的充要条件是b与模数m互质。当模数m为质数时，bm−2即为b的乘法逆元。

输入格式
第一行包含整数n。

接下来n行，每行包含一个数组ai,pi，数据保证pi是质数。

输出格式
输出共n行，每组数据输出一个结果，每个结果占一行。

若ai模pi的乘法逆元存在，则输出一个整数，表示逆元，否则输出impossible。

数据范围
1≤n≤105,
1≤ai,pi≤2∗109
输入样例：
3
4 3
8 5
6 3
输出样例：
1
2
impossible

import java.util.*;

public class Main{
    
    static long qmi(long a,long b ,long q){
          long res = 1;
          while(b>0){
              if((b & 1) == 1) res = res*a%q;
              a = a*a%q;
              b>>=1;
          }
          return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n --  > 0){
            long a = in.nextLong();
            long p = in.nextLong();
          long res=  qmi(a,p-2,p);
          
          if(a%p==0)System.out.println("impossible");
          else{
              System.out.println(res);
          }
        }
    }
}