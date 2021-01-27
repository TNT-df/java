给定一个包含 N 个正整数的集合，请你将它划分为两个集合 A1 和 A2，其中 A1 包含 n1 个元素，A2 包含 n2 个元素。

集合中可以包含相同元素。

用 S1 表示集合 A1 内所有元素之和，S2 表示集合 A2 内所有元素之和。

请你妥善划分，使得 |n1?n2| 尽可能小，并在此基础上 |S1?S2| 尽可能大。

输入格式
第一行包含整数 N。

第二行包含 N 个正整数。

输出格式
再一行中输出 |n1?n2| 和 |S1?S2|，两数之间空格隔开。

数据范围
2≤N≤105,
保证集合中各元素以及所有元素之和小于 231。

输入样例1：
10
23 8 10 99 46 2333 46 1 666 555
输出样例1：
0 3611
输入样例2：
13
110 79 218 69 3721 100 29 135 2 6 13 5188 85
输出样例2：
1 9359
//贪心 判断n为奇数/偶数来进行划分
import java.util.*;

public class Main{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ;i < n ;i ++)
            a[i] = in.nextInt();
        Arrays.sort(a);
        int s1 = 0,s2 = 0;
        for(int i = 0;i < n / 2;i++)
            s1 += a[i];
        for(int i = n / 2;i < n;i++){
           s2 += a[i];
        }
        if(n % 2 == 0){
            System.out.printf("%d %d",0,s2-s1);
        }else   System.out.printf("%d %d",1,s2-s1);
    }

}

