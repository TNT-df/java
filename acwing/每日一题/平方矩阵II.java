输入整数N，输出一个N阶的二维数组。

数组的形式参照样例。

输入格式
输入包含多行，每行包含一个整数N。

当输入行为N=0时，表示输入结束，且该行无需作任何处理。

输出格式
对于每个输入整数N，输出一个满足要求的N阶二维数组。

每个数组占N行，每行包含N个用空格隔开的整数。

每个数组输出完毕后，输出一个空行。

数据范围
0≤N≤100
输入样例：
1
2
3
4
5
0
输出样例：
1

1 2
2 1

1 2 3
2 1 2
3 2 1

1 2 3 4
2 1 2 3
3 2 1 2
4 3 2 1

1 2 3 4 5
2 1 2 3 4
3 2 1 2 3
4 3 2 1 2  
5 4 3 2 1

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            int n = in.nextInt();
            if(n == 0) break;
            int a[][] = new int[n][n];
            for(int i = 0;i < n;i ++){
                for(int j = 0;j < n;j ++){
                    if(i == j) a[i][j] = 1;
                    else a[i][j] = Math.abs(i-j)+1;
                }
            }
            for(int []k:a){
                for(int m :k){
                    System.out.print(m+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}