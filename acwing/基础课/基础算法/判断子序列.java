����һ������Ϊ n ���������� a1,a2,��,an �Լ�һ������Ϊ m ���������� b1,b2,��,bm��

�����ж� a �����Ƿ�Ϊ b ���е������С�

������ָ���е�һ�����ԭ�д������ж��õ����У��������� {a1,a3,a5} ������ {a1,a2,a3,a4,a5} ��һ�������С�

�����ʽ
��һ�а����������� n,m��

�ڶ��а��� n ����������ʾ a1,a2,��,an��

�����а��� m ����������ʾ b1,b2,��,bm��

�����ʽ
��� a ������ b ���е������У����һ�� Yes��

������� No��

���ݷ�Χ
1��n��m��105,
109��ai,bi��109
����������
3 5
1 3 5
1 2 3 4 5
���������
Yes
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        int m = input.nextInt();
        int[] a= new int[n+10];
        int[] b =new int[m+10];
        for(int i = 1;i<=n;i++)
           a[i] =input.nextInt();
         for(int i = 1;i<=m;i++)
         b[i] = input.nextInt();
         int index =1;
         for(int i =1;i<=m;i++){
             if(b[i]==a[index]){
                 index++;
             }
         }
         if(index-1==n){
         System.out.print("Yes");
         }else
         System.out.print("No");
    }
}