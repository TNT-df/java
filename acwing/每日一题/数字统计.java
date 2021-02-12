请统计某个给定范围[L, R]的所有整数中，数字 2 出现的次数。 

比如给定范围[2, 22]，数字 2 在数 2 中出现了 1 次，在数 12 中出现 1 次，在数 20 中出现 1 次，在数 21 中出现 1 次，在数 22 中出现 2 次，所以数字 2 在该范围内一共出现了 6 次。

输入格式
输入共 1 行，为两个正整数 L 和 R，之间用一个空格隔开。

输出格式
输出共 1 行，表示数字 2 出现的次数。

数据范围
1≤L≤R≤10000
输入样例：
2 22
输出样例：
6

import java.util.*;

public class Main{
    
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int res = 0;
        
        for(int i = n ;  i <= m;i ++){
            int k =i;
            while( k > 0){
                if( k % 10 == 2) {
                    res++;
                };
                k/=10;
            }
        }
         System.out.println(res);
    }
}