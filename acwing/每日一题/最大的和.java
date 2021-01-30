给定一个包含整数的二维矩阵，子矩形是位于整个阵列内的任何大小为1 * 1或更大的连续子阵列。

矩形的总和是该矩形中所有元素的总和。

在这个问题中，具有最大和的子矩形被称为最大子矩形。

例如，下列数组：

0 -2 -7 0 
9 2 -6 2 
-4 1 -4 1 
-1 8 0 -2 
其最大子矩形为：

9 2 
-4 1 
-1 8 
它拥有最大和15。

输入格式
输入中将包含一个N*N的整数数组。

第一行只输入一个整数N，表示方形二维数组的大小。

从第二行开始，输入由空格和换行符隔开的N2个整数，它们即为二维数组中的N2个元素，输入顺序从二维数组的第一行开始向下逐行输入，同一行数据从左向右逐个输入。

数组中的数字会保持在[-127,127]的范围内。

输出格式
输出一个整数，代表最大子矩形的总和。

数据范围
1≤N≤100
输入样例：
4
0 -2 -7 0 9 2 -6 2
-4 1 -4  1 -1

8  0 -2
输出样例：
15

import java.util.*;

public class Main{
    static final int N = 110;
    static int a[][] = new int [N][N];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n;j++)
            {
                a[i][j] = in.nextInt();
            a[i][j] +=a[i-1][j];
            }

    }

        int max=Integer.MIN_VALUE;
        for(int i =1 ;i <= n;i++){
            for(int j = i;j <= n; j++){
                int res = 0;
                for(int k = 1; k <= n ; k++){
                    res = Math.max(res,0) + a[j][k]-a[i - 1][k];
                    max =Math.max(res,max);
                }
            }
        }
        System.out.println(max);

    }
}

���ߣ�-TNT-
���ӣ�https://www.acwing.com/activity/content/code/content/775798/
��Դ��AcWing
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������