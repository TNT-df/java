求 a 的 b 次方对 p 取模的值。

输入格式
三个整数 a,b,p ,在同一行用空格隔开。

输出格式
输出一个整数，表示a^b mod p的值。

数据范围
0≤a,b≤109
1≤p≤109
输入样例：
3 2 7
输出样例：
2

import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();
        long p=in.nextLong();
        long res=1L;

        while(b!=0){
            //两个数的乘积也要取模，保证了res小于1e9，这样下次res和a相乘时就可以保证结果不会溢出
            if((b&1)==1) res=(a*res)%p;
            b>>>=1;
            a=a*a%p;
        }

        System.out.println(res%p);
    }
}

