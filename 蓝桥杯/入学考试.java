问题描述
　　辰辰是个天资聪颖的孩子，他的梦想是成为世界上最伟大的医师。为此，他想拜附近最有威望的医师为师。医师为了判断他的资质，给他出了一个难题。医师把他带到一个到处都是草药的山洞里对他说：“孩子，这个山洞里有一些不同的草药，采每一株都需要一些时间，每一株也有它自身的价值。我会给你一段时间，在这段时间里，你可以采到一些草药。如果你是一个聪明的孩子，你应该可以让采到的草药的总价值最大。”
　　如果你是辰辰，你能完成这个任务吗？
输入格式
　　第一行有两个整数T（1 <= T <= 1000）和M（1 <= M <= 100），用一个空格隔开，T代表总共能够用来采药的时间，M代表山洞里的草药的数目。接下来的M行每行包括两个在1到100之间（包括1和100）的整数，分别表示采摘某株草药的时间和这株草药的价值。
输出格式
　　包括一行，这一行只包含一个整数，表示在规定的时间内，可以采到的草药的最大总价值。
样例输入
70 3
71 100
69 1
1 2
样例输出
3
数据规模和约定
　　对于30%的数据，M <= 10；
　　对于全部的数据，M <= 100。


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
        int T = in.nextInt();
        int M = in.nextInt();
        int[] t = new int[M + 10];
        int[] w = new int[M + 10];
        int[][] f = new int[M + 10][T+ 10];
        for (int i = 1; i <= M; i++) {
            t[i] = in.nextInt();
            w[i] = in.nextInt();
        }

        for (int i = 1; i <= M; i++) {
            for (int j = 0; j <= T; j++) {
                f[i][j] = f[i-1][j];
                if(j>=t[i])
                    f[i][j] = Math.max(f[i][j],f[i-1][j-t[i]]+w[i]);
            }
        }
        System.out.println(f[M][T]);
    }
}
