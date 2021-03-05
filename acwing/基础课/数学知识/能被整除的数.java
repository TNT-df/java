给定一个整数n和m个不同的质数p1,p2,…,pm。

请你求出1~n中能被p1,p2,…,pm中的至少一个数整除的整数有多少个。

输入格式
第一行包含整数n和m。

第二行包含m个质数。

输出格式
输出一个整数，表示满足条件的整数的个数。

数据范围
1≤m≤16,
1≤n,pi≤109
输入样例：
10 2
2 3
输出样例：
7

import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int []p = new int[m];
        for(int i = 0 ;i < m ;i++) p[i] = in.nextInt();

        int res = 0;
        for(int i = 1;i< 1<<m;i++){
            //枚举每一种方案
            long cnt =0,t=1;
            for(int j = 0;j < m;j++){
                if((i>>j&1)==1){
                    //需要加long否则会爆溢出
                    if(t*p[j]>n){
                        t= -1;
                        break;
                    }
                    t *= p[j];
                    cnt++;
                }
            }
            if(t != -1){
                //为奇数项说明要加
                if(cnt % 2 ==1) res+= n/t;
                // 偶数项要进行减法
                else res -= n/t;
            }
        }
        System.out.println(res);
    }
}

