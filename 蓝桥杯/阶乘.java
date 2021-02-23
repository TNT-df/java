
　一个整数n的阶乘可以写成n!，它表示从1到n这n个整数的乘积。阶乘的增长速度非常快，例如，13!就已经比较大了，已经无法存放在一个整型变量中；而35!就更大了，它已经无法存放在一个浮点型变量中。因此，当n比较大时，去计算n!是非常困难的。幸运的是，在本题中，我们的任务不是去计算n!，而是去计算n!最右边的那个非0的数字是多少。例如，5! = 1*2*3*4*5 = 120，因此5!最右边的那个非0的数字是2。再如：7! = 5040，因此7!最右边的那个非0的数字是4。请编写一个程序，输入一个整数n(n<=100)，然后输出n! 最右边的那个非0的数字是多少。
　　输入格式：输入只有一个整数n。
　　输出格式：输出只有一个整数，即n! 最右边的那个非0的数字。
输入输出样例
样例输入
6
样例输出
2
import java.util.*;

/**
 * @Author: tnt-DF
 * @Date: 2021/2/19 16:14
 * @Description:
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 1;
        int d2 = 0, d5 = 0;
        for (int i = 1; i <= n; i++) {
            res = res * i;
            while (res % 2 == 0) {
                d2++;
                res /= 2;
            }
            while (res % 5 == 0) {
                d5++;
                res /= 5;
            }
            res = res %10;
        }
        for (int i = 1; i <= (d2 - d5); i++) {
            res = res * 2 % 10;
        }
        System.out.println(res);
    }
}
