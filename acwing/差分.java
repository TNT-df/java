����һ������Ϊn���������С�

����������m��������ÿ������������������l, r, c����ʾ��������[l, r]֮���ÿ��������c��

����������������в���������С�

�����ʽ
��һ�а�����������n��m��

�ڶ��а���n����������ʾ�������С�

������m�У�ÿ�а�����������l��r��c����ʾһ��������

�����ʽ
��һ�У�����n����������ʾ�������С�

���ݷ�Χ
1��n,m��100000,
1��l��r��n,
1000��c��1000,
1000������������Ԫ�ص�ֵ��1000
����������
6 3
1 2 2 1 2 1
1 3 1
3 5 1
1 6 1
���������
3 4 5 3 4 2
 /*
 
    a[i] = b[1]+b[2]+....+b[i];
    b[1]=a[1]-a[0];
    b[2]=a[2]-a[1];
    b[3]=a[3]-a[2];
    Ҫ��a[l,r]�����һ��c����
    b[l]+c,b[r+1]-c ;����  	
 */
import java.lang.*;
import java.util.*;
public class Main{
      static  final int N =1000010;
    static int [] a= new int[N];
    static int [] b= new int[N];
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        for(int i =1 ;i <= n;i++){
            a[i] =input.nextInt();
        }
        //��ʼ��b����
        for(int i =1;i<=n;i++){
            b[i]=a[i]-a[i-1];// insert(i,i,a[i]);
        }
        while(m-->0){
            int l=input.nextInt();
            int r=input.nextInt();
            int c=input.nextInt();
              insert(l,r,c);//������[l,r]�е��������޸�
        }
    for(int i = 1;i<=n;i++){
        b[i]+=b[i-1];
    }
    for(int i = 1;i<=n;i++){
        System.out.print(b[i]+" ");
    }
        
    }
    public static void insert(int l ,int r,int c){
        b[l]+=c;
        b[r+1]-=c;
    }
    
}