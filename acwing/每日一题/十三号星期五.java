十三号星期五真的很不常见吗？

每个月的十三号是星期五的频率是否比一周中的其他几天低？

请编写一个程序，计算 N 年内每个月的 13 号是星期日，星期一，星期二，星期三，星期四，星期五和星期六的频率。

测试的时间段将会开始于 1900 年 1 月 1 日，结束于 1900+N?1 年 12 月 31日。

一些有助于你解题的额外信息：

1900 年 1 月 1 日是星期一。
在一年中，4 月、6 月、9 月、11 月每个月 30 天，2 月平年 28 天，闰年 29 天，其他月份每个月31天。
公历年份是 4 的倍数且不是 100 的倍数的年份为闰年，例如 1992 年是闰年，1990 年不是闰年。
公历年份是整百数并且是 400 的倍数的也是闰年，例如1700年，1800年，1900年，2100年不是闰年，2000年是闰年。
输入格式
共一行，包含一个整数 N。

输出格式
共一行，包含七个整数，整数之间用一个空格隔开，依次表示星期六，星期日，星期一，星期二，星期三，星期四，星期五在十三号出现的次数。

数据范围
1≤N≤400
输入样例：
20
输出样例：
36 33 34 33 35 35 34
//按月枚举
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


//按天枚举
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