在图像编码的算法中，需要将一个给定的方形矩阵进行 Z 字形扫描(Zigzag Scan)。

给定一个 n×n 的矩阵，Z 字形扫描的过程如下图所示：

zig.png

对于下面的 4×4 的矩阵，

1 5 3 9
3 7 5 6
9 4 6 4
7 3 1 3
对其进行 Z 字形扫描后得到长度为 16 的序列：1 5 3 9 7 3 9 5 4 7 3 6 6 4 1 3。

请实现一个 Z 字形扫描的程序，给定一个 n×n 的矩阵，输出对这个矩阵进行 Z 字形扫描的结果。

输入格式
输入的第一行包含一个整数 n，表示矩阵的大小。

输入的第二行到第 n+1 行每行包含 n 个正整数，由空格分隔，表示给定的矩阵。

输出格式
输出一行，包含 n×n 个整数，由空格分隔，表示输入的矩阵经过 Z 字形扫描后的结果。

数据范围
1≤n≤500，
矩阵元素为不超过 1000 的正整数。

输入样例：
4
1 5 3 9
3 7 5 6
9 4 6 4
7 3 1 3
输出样例：
1 5 3 9 7 3 9 5 4 7 3 6 6 4 1 3
//每个对角线看作一行
import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a [][] = new int[n+10][n+10];
        for(int i = 1 ;i <= n; i++ ){
            for(int j = 1 ; j <= n ;j++)
             a[i][j] =in.nextInt();
        }
		//i表示当前元素的横纵坐标之和
        for(int i = 2 ;i<=2*n;i++){
            if(i % 2 == 1){
                for(int j =1;j<i;j++){
                    if(j>=1&&j<=n&&i-j<=n&&i-j>=1){
                        System.out.print(a[j][i-j]+" ");
                    }
                }
            }else{
                for(int j = i-1;j>=1;j--){
                    if(j>=1&&j<=n&&i-j>=1&&i-j<=n){
                        System.out.print(a[j][i-j]+" ");
                    }
                }
            }
        }
        
    }
}