给定一个正整数k,把所有k的方幂及所有有限个互不相等的k的方幂之和构成一个递增的序列，例如，当k=3时，这个序列是：

1，3，4，9，10，12，13，…

该序列实际上就是：30，31，30+31，32，30+32，31+32，30+31+32，…
请你求出这个序列的第N项的值（用10进制数表示）。?

例如，对于k=3，N=100，正确答案应该是981。

输入格式
输入文件只有1行，为2个正整数，用一个空格隔开：k?N。

输出格式
输出文件为计算结果，是一个正整数（在所有的测试数据中，结果均不超过2.1?109）。（整数前不要有空格和其他符号）。

数据范围
3≤k≤15,
10≤N≤1000
输入样例：
3 100
输出样例：
981
//映射为二进制
import java.util.*;

public class Main{


    static int power(int a ,int b){
        int ret =1;
        while(b-- > 0){
            ret*=a;
        }
        return ret;
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();

        int res = 0;
        for(int i = 0;i < 10;i++){
            if((n >> i &1)==1){
                res += power(k,i);
            }
        }
        System.out.println(res);
    }
}

