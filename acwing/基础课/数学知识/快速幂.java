给定n组ai,bi,pi，对于每组数据，求出abii mod pi的值。

输入格式
第一行包含整数n。

接下来n行，每行包含三个整数ai,bi,pi。

输出格式
对于每组数据，输出一个结果，表示abii mod pi的值。

每个结果占一行。

数据范围
1≤n≤100000,
1≤ai,bi,pi≤2∗109
输入样例：
2
3 2 5
4 3 9
输出样例：
4
1

//将幂的形式写成2进制进行乘法
import java.util.*;

public class Main{
    
    static void qmi(long a,long b,long c){
        long res =1;
        while(b>0){
            if((b & 1 )== 1) res =a*res %c;
            a = a *a%c;
            b>>=1;
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        while(n-->0){
             long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            qmi(a,b,c);
        }
    }
}