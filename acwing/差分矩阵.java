����һ��n��m�е���������������q��������ÿ�����������������x1, y1, x2, y2, c������(x1, y1)��(x2, y2)��ʾһ���Ӿ�������Ͻ���������½����ꡣ

ÿ��������Ҫ��ѡ�е��Ӿ����е�ÿ��Ԫ�ص�ֵ����c��

���㽫���������в�����ľ��������

�����ʽ
��һ�а�������n,m,q��

������n�У�ÿ�а���m����������ʾ��������

������q�У�ÿ�а���5������x1, y1, x2, y2, c����ʾһ��������

�����ʽ
�� n �У�ÿ�� m ����������ʾ���в���������Ϻ�����վ���

���ݷ�Χ
1��n,m��1000,
1��q��100000,
1��x1��x2��n,
1��y1��y2��m,
1000��c��1000,
1000�ܾ�����Ԫ�ص�ֵ��1000
����������
3 4 3
1 2 2 1
3 2 2 1
1 1 1 1
1 1 2 2 1
1 3 2 3 2
3 1 3 4 1
���������
2 3 4 1
4 3 4 1
2 2 2 2
import java.util.*;
public class Main{
    static final int N = 1010;
    static int[][] a =new int [N][N];
    static int[][] b =new int [N][N];

    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int m =input.nextInt();
        int q =input.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                a[i][j] = input.nextInt();
            }
        }
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                insert(i,j,i,j,a[i][j]);
            }
        }
        while(q-->0){
              int x1 = input.nextInt();
              int y1 =input.nextInt();
              int x2 =input.nextInt();
              int y2 =input.nextInt();
              int c =input.nextInt();
              insert(x1,y1,x2,y2,c);
        }
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=m;j++){
                b[i][j]+=b[i-1][j]+b[i][j-1]-b[i-1][j-1];
              
            }
        }
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=m;j++){
               System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void insert(int x1,int y1,int x2,int y2 ,int c){
        b[x1][y1]+=c;
        b[x2+1][y1]-=c;
        b[x1][y2+1]-=c;
        b[x2+1][y2+1] += c;
    }
}