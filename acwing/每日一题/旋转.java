图片旋转是对图片最简单的处理方式之一，在本题中，你需要对图片顺时针旋转 90 度。

我们用一个 n×m 的二维数组来表示一个图片，例如下面给出一个 3×4 的图片的例子：

1 3 5 7
9 8 7 6
3 5 9 7
这个图片顺时针旋转 90 度后的图片如下：

3 9 1
5 8 3
9 7 5
7 6 7
给定初始图片，请计算旋转后的图片。

输入格式
输入的第一行包含两个整数 n 和 m，分别表示行数和列数。

接下来 n 行，每行 m 个整数，表示给定的图片。图片中的每个元素（像素）为一个值为 0 至 255 之间的整数（包含 0 和 255）。

输出格式
输出 m 行 n 列，表示旋转后的图片。

数据范围
1≤n,m≤100
输入样例：
3 4
1 3 5 7
9 8 7 6
3 5 9 7
输出样例：
3 9 1
5 8 3
9 7 5
7 6 7

/*
下标变换
*/
import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for(int i = 0 ;i < n ;i++){
            for(int j = 0;j < m ;j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < m;i++){
            for(int j = n -1; j>=0;j--){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}