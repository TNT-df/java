给定一个长度为n的数列，请你求出数列中每个数的二进制表示中1的个数。

输入格式
第一行包含整数n。

第二行包含n个整数，表示整个数列。

输出格式
共一行，包含n个整数，其中的第 i 个数表示数列中的第 i 个数的二进制表示中1的个数。

数据范围
1≤n≤100000,
0≤数列中元素的值≤109
输入样例：
5
1 2 3 4 5
输出样例：
1 1 2 1 2
import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] a = new int[100010];
          int[] b = new int[100010];
        int n = input.nextInt();
        for(int i = 0;i<n;i++){
            a[i] = input.nextInt();
        }
      for(int i = 0;i<n;i++){
          int count =0;
          while(a[i]>0){
               count += a[i] &1;
              a[i] =a[i] >>1;
          }
          b[i] =count;
      }
      for(int i = 0;i<n;i++){
          System.out.print(b[i]+" ");
      }
    }
}