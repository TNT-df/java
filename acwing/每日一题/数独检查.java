������һ�����еĵ�����Ϸ��

Ŀ�������������9x9����ʹÿ�У�ÿ�к�����9�����ص���3x3�Ӿ��������1��9���������֡�

ÿ��9x9��������Ϸ��ʼʱ�����в��������Ѿ�������ͨ����һ�����صĽ��������

1.png

2.png

������ɵ�N2?N2�����������������ȷ�����Ƿ�����Ч�Ľ��������

��Ч�Ľ������������������������

ÿ�а�����1��N2��ÿ�����֣�ÿ������һ�Ρ�
ÿ�а�����1��N2��ÿ�����֣�ÿ������һ�Ρ�
��N2?N2���󻮷�ΪN2�����ص�N?N�Ӿ��� ÿ���Ӿ��������1��N2��ÿ�����֣�ÿ������һ�Ρ�
�����赣�������Ψһ�ԣ�ֻ������������Ƿ�����Ч�Ľ���������ɡ�

�����ʽ
��һ�а�������T����ʾ����T��������ݡ�

ÿ�����ݵ�һ�а�������N��

������N2�У�ÿ�а���N2�����֣���������1000��������������������������

�����ʽ
ÿ���������һ�������ÿ�����ռһ�С�

�����ʾΪ��Case #x: y��������x������ţ���1��ʼ�������������������Ч������y��Yes������y��No��

���ݷ�Χ
1��T��100,
3��N��6
����������
3
3
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
3
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
3
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 999 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
���������
Case #1: Yes
Case #2: No
Case #3: No


import java.util.*;

public class Main{
    static final int N =40;
    static int[][] w =new int[N][N];
    static boolean b[] =new boolean[N];
    static int n;
    static int m;
	//�ж���
    static boolean checkrow(){
        for(int i = 0;i < m;i++){
            Arrays.fill(b,false);
            for(int j = 0; j < m;j++){
                int t = w[i][j];
                if( t<1 || t > m) return false;
                if(b[t]) return false;
                b[t] = true;
            }
        }
        return true;
    }
    //�ж���
static boolean checkcol(){
     for(int i = 0;i < m;i++){
         Arrays.fill(b,false);
            for(int j = 0;j < m;j++){
                int t = w[i][j];
                if( t<1 || t > m) return false;
                if(b[t]) return false;
                b[t] = true;
            }
        }
        return true;
}
//�ж�С�����Ƿ���������
static boolean checkpart(){
    for(int i = 0;i < m;i+=n){
        for(int j = 0; j < m;j+=n){
             Arrays.fill(b,false);
            for(int dx = 0;dx<n;dx++){
                for(int dy = 0;dy<n;dy++){
                   int  t =w[i+dx][j+dy];
                    if(t < 1 || t > m) return false;
                    if(b[t]) return false;
                    b[t] = true;
                }
            }
        }
    }
    return true;
}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         int T =in.nextInt();

         int k = 1;
         for(;k<=T;k++){
           n = in.nextInt();
           m = n * n;
             for(int i = 0;i < m;i++)
                for(int j = 0;j < m ;j++)
                  w[i][j] = in.nextInt();
                  
                  
                  if(checkrow()&&checkcol()&&checkpart()){
                      System.out.println("Case #"+k+": Yes");
                  }else{
                      System.out.println("Case #"+k+": No");
                  }
 
         }
    }
}