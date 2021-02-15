已知正整数n是两个不同的质数的乘积，试求出较大的那个质数。

输入格式
输入只有一行，包含一个正整数n。

输出格式
输出只有一行，包含一个正整数p，即较大的那个质数。

数据范围
6≤n≤2∗109
输入样例：
21
输出样例：
7
import java.util.Scanner;

/**
 * @Author: tnt-DF
 * @Date: 2021/2/13 11:47
 * @Description:
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long max = 0;
        long k = 2;
        while (n > 1) {
            if (n % k == 0) {
              max  = n / k;
              break;
        }
         k++;
        }
        System.out.print(max);
    }
}


。