问题描述
　　将整数n分成k份，且每份不能为空，任意两份不能相同(不考虑顺序)。
　　例如：n=7，k=3，下面三种分法被认为是相同的。
　　1，1，5; 1，5，1; 5，1，1;
　　问有多少种不同的分法。
输入格式
　　n，k
输出格式
　　一个整数，即不同的分法
样例输入
7 3
样例输出
4 {四种分法为：1，1，5;1，2，4;1，3，3;2，2，3;}
数据规模和约定
　　6<n<=200，2<=k<=6
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
        int k = in.nextInt();
        int f[][] = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            // f[i][j] //表示 整数i的有j种划分方式
            f[i][1] = 1; //f[3][1] 只有一种划分形式 3
            for (int j = 2; j <= k; j++) {
                if (i == j) f[i][j] = 1;//例如  f[3][3] 可划分为1，1，1
                if (i > j) f[i][j] = f[i - 1][j - 1] + f[i - j][j];
            }
        }
        System.out.println(f[n][k]);
    }

}
