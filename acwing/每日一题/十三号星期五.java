ʮ������������ĺܲ�������

ÿ���µ�ʮ�������������Ƶ���Ƿ��һ���е���������ͣ�

���дһ�����򣬼��� N ����ÿ���µ� 13 ���������գ�����һ�����ڶ����������������ģ����������������Ƶ�ʡ�

���Ե�ʱ��ν��Ὺʼ�� 1900 �� 1 �� 1 �գ������� 1900+N?1 �� 12 �� 31�ա�

һЩ�����������Ķ�����Ϣ��

1900 �� 1 �� 1 ��������һ��
��һ���У�4 �¡�6 �¡�9 �¡�11 ��ÿ���� 30 �죬2 ��ƽ�� 28 �죬���� 29 �죬�����·�ÿ����31�졣
��������� 4 �ı����Ҳ��� 100 �ı��������Ϊ���꣬���� 1992 �������꣬1990 �겻�����ꡣ
��������������������� 400 �ı�����Ҳ�����꣬����1700�꣬1800�꣬1900�꣬2100�겻�����꣬2000�������ꡣ
�����ʽ
��һ�У�����һ������ N��

�����ʽ
��һ�У������߸�����������֮����һ���ո���������α�ʾ�������������գ�����һ�����ڶ����������������ģ���������ʮ���ų��ֵĴ�����

���ݷ�Χ
1��N��400
����������
20
���������
36 33 34 33 35 35 34
//����ö��
import java.util.*;

public class Main{
    static int[] months={0,31,28,31,30,31,30,31,31,30,31,30,31};
    static int[] week ={0,0,0,0,0,0,0};
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
         int days =0;
         int year = 1900;
        for(;year<1900+n;year++){
           for(int j = 1;j<13;j++){
              week[(days+12)%7]++;
              days+=months[j];
              if(isrun(year)&&j==2){
                  days++;
              }
           }
        }

        for(int i = 5,j=0;j<7;i=(i+1)%7,j++){
            System.out.print(week[i]+" ");
        }
    }
    static boolean isrun(int year){
        if( year%4==0&&year%100!=0  ||  year%100==0&&year%400==0)
        return true;
        return false;
    }
}


//����ö��
import java.util.*;

public class Main{
static int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
static int weekday[]=new int[7];

   static int get(int year,int month){
       if(month!=2)
           return days[month];
      
           if(year%4==0&&year%100!=0||year%100==0&&year%400==0)
               return 29;
           return 28;
       }
   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int year = 1900,day =1,month=1;
        int week=0;
        while(year<1900+n){
            if(day ==13) weekday[week]++;
            week = (week+1)%7;
            day++;
            if(get(year,month)<day) {
                month++;
                day=1;
            }
            if(month>12){
                year++;
                month =1;
            }
        }
        
        for(int i = 5,j=0;j<7;i=(i + 1)%7,j++){
            System.out.print(weekday[i]+" ");
        }
    }
}