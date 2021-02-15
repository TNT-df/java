给定一个整数，请将该数各个位上数字反转得到一个新数。

新数也应满足整数的常见形式，即除非给定的原数为零，否则反转后得到的新数的最高位数字不应为零。

输入格式
输入共1行，1个整数N。

输出格式
输出共1行，1个整数表示反转后的新数。

数据范围
|N|≤109
输入样例：
123
输出样例：
321
输入样例：
-380
输出样例：
-83
/**
 * @Author: tnt-DF
 * @Date: 2021/2/15 23:29
 * @Description: 数字反转
 * @Version: 1.0
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if (str.charAt(0) == '-') {
            System.out.print('-');
            str = str.substring(1, str.length());
        }
        str = new StringBuffer(str).reverse().toString();
        int k = 0;
        //余留数字0
        while (k + 1 < str.length() && str.charAt(k) == '0') k++;
        while (k < str.length()) System.out.print(str.charAt(k++));

    }
}