在一个定义了直角坐标系的纸上，画一个 (x1,y1) 到 (x2,y2) 的矩形指将横坐标范围从 x1 到 x2，纵坐标范围从 y1 到 y2 之间的区域涂上颜色。

下图给出了一个画了两个矩形的例子。

第一个矩形是 (1,1) 到 (4,4)，用绿色和紫色表示。

第二个矩形是 (2,3) 到 (6,5)，用蓝色和紫色表示。

图中，一共有 15 个单位的面积被涂上颜色，其中紫色部分被涂了两次，但在计算面积时只计算一次。

在实际的涂色过程中，所有的矩形都涂成统一的颜色，图中显示不同颜色仅为说明方便。

p21.png

给出所有要画的矩形，请问总共有多少个单位的面积被涂上颜色。

输入格式
输入的第一行包含一个整数 n，表示要画的矩形的个数。

接下来 n 行，每行 4 个非负整数，分别表示要画的矩形的左下角的横坐标与纵坐标，以及右上角的横坐标与纵坐标。

输出格式
输出一个整数，表示有多少个单位的面积被涂上颜色。

数据范围
1≤n≤100,
0≤ 横坐标、纵坐标 ≤100
输入样例：
2
1 1 4 4
2 3 6 5
输出样例：
15

import java.util.*;

public class Main{
    static final int N =110;
    static boolean[][]b= new boolean[N][N];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         while(n-->0){
             int x1 =in.nextInt();
             int y1 =in.nextInt();
             int x2 =in.nextInt();
             int y2 =in.nextInt();
            for(int i = x1;i<x2;i++){
                for(int j = y1 ;j < y2 ;j++){
                    b[i][j] =true;
                }
            }
         }
         int res = 0;
         for(int i = 0 ;i<N;i++){
             for(int j = 0 ;j<N;j++)
             if(b[i][j]){
                 res +=1;
             }
         }
         System.out.println(res);
    }
}

