给定n个正整数ai，请你求出每个数的欧拉函数。

欧拉函数的定义
1 ~ N 中与 N 互质的数的个数被称为欧拉函数，记为ϕ(N)。
若在算数基本定理中，N=pa11pa22…pamm，则：
ϕ(N) = N∗p1−1p1∗p2−1p2∗…∗pm−1pm
输入格式
第一行包含整数n。

接下来n行，每行包含一个正整数ai。

输出格式
输出共n行，每行输出一个正整数ai的欧拉函数。

数据范围
1≤n≤100,
1≤ai≤2∗109
输入样例：
3
3
6
8
输出样例：
2
2
4

import java.util.*;


public class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        while(n -- >0){
            int a = in.nextInt();
            int res = a;
            for(int i = 2;i<=a/i;i++){
                if(a %i==0){
                      res = res/i*(i-1);
                    while(a %i==0){
                        a/=i;
                    }
                }
            }
            if(a > 1) res = res/a*(a-1);
            System.out.println(res);
        }
    }
}