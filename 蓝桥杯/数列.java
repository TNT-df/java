给定一个正整数k(3≤k≤15),把所有k的方幂及所有有限个互不相等的k的方幂之和构成一个递增的序列，例如，当k=3时，这个序列是：
　　1，3，4，9，10，12，13，…
　　（该序列实际上就是：30，31，30+31，32，30+32，31+32，30+31+32，…）
　　请你求出这个序列的第N项的值（用10进制数表示）。
　　例如，对于k=3，N=100，正确答案应该是981。


import java.util.*;

/**
 * @Author: tnt-DF
 * @Date: 2021/2/19 16:14
 * @Description:
 * @Version: 1.0
 */
public class Main {
    static int power(int a, int b) {
        int ret = 1;
        while (b-- > 0) {
            ret *= a;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int res = 0;
        for (int i = 0; i < 10; i++) {
            if ((m >> i & 1) == 1) {
                res += power(k,i);
            }
        }
        System.out.println(res);
    }


}
