С��������һ������Ӳ�ҡ�����Ϸ��

���Ϸ����ų�һ�ŵ�����Ӳ�ҡ������� * ��ʾ���棬�� o ��ʾ���棨��Сд��ĸ�������㣩��

���磬���������ǣ�**oo***oooo

���ͬʱ��ת��ߵ�����Ӳ�ң����Ϊ��oooo***oooo

����С���������ǣ������֪�˳�ʼ״̬��Ҫ�ﵽ��Ŀ��״̬��ÿ��ֻ��ͬʱ��ת���ڵ�����Ӳ��,��ô���ض��ľ��棬����Ҫ�������ٴ��أ�

����Լ�����ѷ������ڵ�����Ӳ�ҽ���һ��������

�����ʽ
���еȳ����ַ������ֱ��ʾ��ʼ״̬��Ҫ�ﵽ��Ŀ��״̬��

�����ʽ
һ����������ʾ��С��������

���ݷ�Χ
�����ַ����ĳ��Ⱦ�������100��
���ݱ�֤��һ���н⡣

��������1��
**********
o****o****
�������1��
5
��������2��
*o**o***o***
*o***o**o***
�������2��
1

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
         
         int cnt = 0;
         char[] ch1 = str1.toCharArray();
          char[] ch2 = str2.toCharArray();
         for(int i = 0;i+1<str1.length();i++)
         {
             if(ch1[i] != ch2[i]){
                 cnt++;
                 reverse(ch1,i);
                 reverse(ch1,i+1);
             }
         }
         System.out.println(cnt);
    }
    static void reverse(char [] a,int x){
        if(a[x]=='o'){
            a[x] ='*';
        }else{
            a[x] ='o';
        }
    }
 
}