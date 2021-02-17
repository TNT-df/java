给定n对正整数ai,bi，请你求出每对数的最大公约数。

输入格式
第一行包含整数n。

接下来n行，每行包含一个整数对ai,bi。

输出格式
输出共n行，每行输出一个整数对的最大公约数。

数据范围
1≤n≤105,
1≤ai,bi≤2∗109
输入样例：
2
3 6
4 6
输出样例：
3
2

import java.util.*;

public class Main{
    
    static int gcd(int a ,int b){
        return b>0?gcd(b,a%b):a;
    }
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    int n = in.nextInt();
    
    while(n-- >0){
        int a = in.nextInt();
        int b = in.nextInt();
     System.out.println(   gcd(a,b));
    }
    }
}