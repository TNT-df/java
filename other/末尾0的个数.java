输入一个正整数n,求n!(即阶乘)末尾有多少个0?
比如:n= 10; n! =3628800,所以答案为2
输入描述:
输入为一行，n (1 ≤ n ≤ 100)
/*
 2 * 5 才会产生10，所以只要考虑 2 和 5 的个数 显然5的个数比2的个数少，
 所以只需要考虑5的个数
*/

import java.util.*;

public class Main{
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int count = 0;
        while( n  > 0){
            count+=n/5;
               n= n /5;   
        }
        System.out.println(count);
    }
}