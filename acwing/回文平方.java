回文数是指数字从前往后读和从后往前读都相同的数字。

例如数字 12321 就是典型的回文数字。

现在给定你一个整数 B，请你判断 1～300 之间的所有整数中，有哪些整数的平方转化为 B 进制后，其 B 进制表示是回文数字。

输入格式
一个整数 B。

输出格式
每行包含两个在 B 进制下表示的数字。

第一个表示满足平方值转化为 B 进制后是回文数字那个数，第二个数表示第一个数的平方。

所有满足条件的数字按从小到大顺序依次输出。

数据范围
2≤B≤20,
对于大于 9 的数字，用 A 表示 10，用 B 表示 11，以此类推。

输入样例：
10
输出样例：
1 1
2 4
3 9
11 121
22 484
26 676
101 10201
111 12321
121 14641
202 40804
212 44944
264 69696

/*
先转换进制再进行判断
*/
import java.util.Scanner;

/**
 * @Author TNT-df
 * @Date 2021/1/13 18:22
 * @Description
 */
public class Main {
    static int b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         b = in.nextInt();
        for (int i = 1; i <= 300; i++) {
            String st = convert(i * i);
            if (checked(st)) {
                System.out.println(convert(i) + " " + convert(i * i));
            }
        }
    }

    static String convert(int x) {
        String str = "0123456789ABCDEFGHIJ";
        StringBuffer sb = new StringBuffer();

        while (x > 0) {
           int mod = x % b;
            x = x / b;
            sb.append(str.charAt(mod));
        }
        sb.reverse();
        return sb.toString();
    }

    static boolean checked(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

}
