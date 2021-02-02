数独是一种流行的单人游戏。

目标是用数字填充9x9矩阵，使每列，每行和所有9个非重叠的3x3子矩阵包含从1到9的所有数字。

每个9x9矩阵在游戏开始时都会有部分数字已经给出，通常有一个独特的解决方案。

1.png

2.png

给定完成的N2?N2数独矩阵，你的任务是确定它是否是有效的解决方案。

有效的解决方案必须满足以下条件：

每行包含从1到N2的每个数字，每个数字一次。
每列包含从1到N2的每个数字，每个数字一次。
将N2?N2矩阵划分为N2个非重叠N?N子矩阵。 每个子矩阵包含从1到N2的每个数字，每个数字一次。
你无需担心问题的唯一性，只需检查给定矩阵是否是有效的解决方案即可。

输入格式
第一行包含整数T，表示共有T组测试数据。

每组数据第一行包含整数N。

接下来N2行，每行包含N2个数字（均不超过1000），用来描述完整的数独矩阵。

输出格式
每组数据输出一个结果，每个结果占一行。

结果表示为“Case #x: y”，其中x是组别编号（从1开始），如果给定矩阵是有效方案则y是Yes，否则y是No。

数据范围
1≤T≤100,
3≤N≤6
输入样例：
3
3
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
3
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
3
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 999 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
输出样例：
Case #1: Yes
Case #2: No
Case #3: No


import java.util.*;

public class Main{
    static final int N =40;
    static int[][] w =new int[N][N];
    static boolean b[] =new boolean[N];
    static int n;
    static int m;
	//判断列
    static boolean checkrow(){
        for(int i = 0;i < m;i++){
            Arrays.fill(b,false);
            for(int j = 0; j < m;j++){
                int t = w[i][j];
                if( t<1 || t > m) return false;
                if(b[t]) return false;
                b[t] = true;
            }
        }
        return true;
    }
    //判断行
static boolean checkcol(){
     for(int i = 0;i < m;i++){
         Arrays.fill(b,false);
            for(int j = 0;j < m;j++){
                int t = w[i][j];
                if( t<1 || t > m) return false;
                if(b[t]) return false;
                b[t] = true;
            }
        }
        return true;
}
//判断小方格是否满足条件
static boolean checkpart(){
    for(int i = 0;i < m;i+=n){
        for(int j = 0; j < m;j+=n){
             Arrays.fill(b,false);
            for(int dx = 0;dx<n;dx++){
                for(int dy = 0;dy<n;dy++){
                   int  t =w[i+dx][j+dy];
                    if(t < 1 || t > m) return false;
                    if(b[t]) return false;
                    b[t] = true;
                }
            }
        }
    }
    return true;
}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         int T =in.nextInt();

         int k = 1;
         for(;k<=T;k++){
           n = in.nextInt();
           m = n * n;
             for(int i = 0;i < m;i++)
                for(int j = 0;j < m ;j++)
                  w[i][j] = in.nextInt();
                  
                  
                  if(checkrow()&&checkcol()&&checkpart()){
                      System.out.println("Case #"+k+": Yes");
                  }else{
                      System.out.println("Case #"+k+": No");
                  }
 
         }
    }
}