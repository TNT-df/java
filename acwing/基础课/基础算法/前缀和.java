
输入一个长度为n的整数序列。

接下来再输入m个询问，每个询问输入一对l, r。

对于每个询问，输出原序列中从第l个数到第r个数的和。

输入格式
第一行包含两个整数n和m。

第二行包含n个整数，表示整数数列。

接下来m行，每行包含两个整数l和r，表示一个询问的区间范围。

输出格式
共m行，每行输出一个询问的结果。

数据范围
1≤l≤r≤n,
1≤n,m≤100000,
1000≤数列中元素的值≤1000
输入样例：
5 3
2 1 3 6 4
1 2
1 3
2 4
输出样例：
3
6
10
import java.util.*;
public class Main{
    private static int N = 100010;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int [N];
        for(int i = 1;i <= n;i++){
            a[i] = input.nextInt();
        }
        
        int [] presum = new int[N];
        presum[0] =0;
        for(int i =1;i<=n;i++){
            presum[i] =presum[i-1]+a[i];
        }
        while(m-->0){
         int x = input.nextInt();
         int y = input.nextInt();
         System.out.println(presum[y]-presum[x-1]);
        
        }
    } 
}