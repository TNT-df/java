����һ������Ϊn�����У��������������ÿ�����Ķ����Ʊ�ʾ��1�ĸ�����

�����ʽ
��һ�а�������n��

�ڶ��а���n����������ʾ�������С�

�����ʽ
��һ�У�����n�����������еĵ� i ������ʾ�����еĵ� i �����Ķ����Ʊ�ʾ��1�ĸ�����

���ݷ�Χ
1��n��100000,
0��������Ԫ�ص�ֵ��109
����������
5
1 2 3 4 5
���������
1 1 2 1 2
import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] a = new int[100010];
          int[] b = new int[100010];
        int n = input.nextInt();
        for(int i = 0;i<n;i++){
            a[i] = input.nextInt();
        }
      for(int i = 0;i<n;i++){
          int count =0;
          while(a[i]>0){
               count += a[i] &1;
              a[i] =a[i] >>1;
          }
          b[i] =count;
      }
      for(int i = 0;i<n;i++){
          System.out.print(b[i]+" ");
      }
    }
}