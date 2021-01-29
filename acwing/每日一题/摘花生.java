Hello Kitty想摘点花生送给她喜欢的米老鼠。

她来到一片有网格状道路的矩形花生地(如下图)，从西北角进去，东南角出来。

地里每个道路的交叉点上都有种着一株花生苗，上面有若干颗花生，经过一株花生苗就能摘走该它上面所有的花生。

Hello Kitty只能向东或向南走，不能向西或向北走。

问Hello Kitty最多能够摘到多少颗花生。

1.gif

输入格式
第一行是一个整数T，代表一共有多少组数据。

接下来是T组数据。

每组数据的第一行是两个整数，分别代表花生苗的行数R和列数 C。

每组数据的接下来R行数据，从北向南依次描述每行花生苗的情况。每行数据有C个整数，按从西向东的顺序描述了该行每株花生苗上的花生数目M。

输出格式
对每组输入数据，输出一行，内容为Hello Kitty能摘到得最多的花生颗数。

数据范围
1≤T≤100,
1≤R,C≤100,
0≤M≤1000

import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        while(T-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int [][] w = new int[a+1][b+1];
            int [][] dp = new int[a+1][b+1];
            for(int i = 1;i <= a;i++){
                for(int j = 1;j <= b ;j++)
                w[i][j] = in.nextInt();
            }

            for(int i =1 ;i<=a;i++){
                for(int j = 1 ; j <= b ;j++){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+w[i][j];
                }
            }
            System.out.println(dp[a][b]);
        }
    }
}