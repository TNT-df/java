����һ������Ϊn���������У����ҳ���Ĳ������ظ��������������䣬������ĳ��ȡ�

�����ʽ
��һ�а�������n��

�ڶ��а���n������������0~100000��Χ�ڣ�����ʾ�������С�

�����ʽ
��һ�У�����һ����������ʾ��Ĳ������ظ���������������ĳ��ȡ�

���ݷ�Χ
1��n��100000
����������
5
1 2 2 3 5
���������
3
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] a = new int [100010];
        int [] s = new int [100010]; //��¼��ǰԪ�س��ֵĴ���
        int res=0;
        for(int i = 0;i<n;i++){
            a[i] =input.nextInt();
        }
        for(int i = 0,j=0;i<n;i++){
            s[a[i]]++;
            while(s[a[i]]>1){ //˵�����ظ�Ԫ�ظ��� j��λ��
               s[a[j]]--;
               j++;
            }
             res =Math.max(res,i-j+1); 
        }
       System.out.print(res);
    }
}