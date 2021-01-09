在一条数轴上有 N 家商店，它们的坐标分别为 A1~AN。

现在需要在数轴上建立一家货仓，每天清晨，从货仓到每家商店都要运送一车商品。

为了提高效率，求把货仓建在何处，可以使得货仓到每家商店的距离之和最小。

输入格式
第一行输入整数N。

第二行N个整数A1~AN。

输出格式
输出一个整数，表示距离之和的最小值。

数据范围
1≤N≤100000,
0≤Ai≤40000
输入样例：
4
6 2 9 1
输出样例：
12

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int [] a = new int[n];
       for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
       }
       Arrays.sort(a);
       int sum =0;
       int k =a[a.length/2];
       for(int i = 0;i<n;i++){
           sum+= Math.abs(a[i]-k);
       }
       System.out.print(sum);
    }
  
    }