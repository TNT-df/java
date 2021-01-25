农夫约翰的农场上有 N 个山丘，每座山的高度都是整数。

在冬天，约翰经常在这些山上举办滑雪训练营。

不幸的是，从明年开始，国家将实行一个关于滑雪场的新税法。

如果滑雪场的最高峰与最低峰的高度差大于17，国家就要收税。

为了避免纳税，约翰决定对这些山峰的高度进行修整。

已知，增加或减少一座山峰 x 单位的高度，需要花费 x2 的金钱。

约翰只愿意改变整数单位的高度。

请问，约翰最少需要花费多少钱，才能够使得最高峰与最低峰的高度差不大于17。

输入格式
第一行包含整数 N。

接下来 N 行，每行包含一个整数，表示一座山的高度。

输出格式
输出一个整数，表示最少花费的金钱。

数据范围
1≤N≤1000,
数据保证，每座山的初始高度都在 0～100 之间。

输入样例：
5
20
4
1
24
21
输出样例：
18
样例解释
最佳方案为，将高度为 1 的山峰，增加 3 个单位高度，将高度为 24 的山峰，减少 3 个单位高度。

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
      for(int i = 0;i < N; i++){
          a[i] = in.nextInt();
      }
      int res = Integer.MAX_VALUE;
      for(int i = 0;i+17<100;i++){
          int l = i, r = i + 17;
          int count = 0;
          for(int j = 0;j < N ;j++){
              if(a[j] <l)
              count+=(a[j] - l) * (a[j] - l);
              if(a[j]> r )
               count+=(a[j] - r) * (a[j] - r);
          }
          res =Math.min(res,count);
      }
      System.out.println(res);

    }
}

