��һ���������� N ���̵꣬���ǵ�����ֱ�Ϊ A1~AN��

������Ҫ�������Ͻ���һ�һ��֣�ÿ���峿���ӻ��ֵ�ÿ���̵궼Ҫ����һ����Ʒ��

Ϊ�����Ч�ʣ���ѻ��ֽ��ںδ�������ʹ�û��ֵ�ÿ���̵�ľ���֮����С��

�����ʽ
��һ����������N��

�ڶ���N������A1~AN��

�����ʽ
���һ����������ʾ����֮�͵���Сֵ��

���ݷ�Χ
1��N��100000,
0��Ai��40000
����������
4
6 2 9 1
���������
12

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int [] a = new int[n];
       for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
       }
       Arrays.sort(a);
       int sum =0;
       int k =a[a.length/2];
       for(int i = 0;i<n;i++){
           sum+= Math.abs(a[i]-k);
       }
       System.out.print(sum);
    }
  
    }