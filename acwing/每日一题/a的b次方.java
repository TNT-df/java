�� a �� b �η��� p ȡģ��ֵ��

�����ʽ
�������� a,b,p ,��ͬһ���ÿո������

�����ʽ
���һ����������ʾa^b mod p��ֵ��

���ݷ�Χ
0��a,b��109
1��p��109
����������
3 2 7
���������
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
            //�������ĳ˻�ҲҪȡģ����֤��resС��1e9�������´�res��a���ʱ�Ϳ��Ա�֤����������
            if((b&1)==1) res=(a*res)%p;
            b>>>=1;
            a=a*a%p;
        }

        System.out.println(res%p);
    }
}

