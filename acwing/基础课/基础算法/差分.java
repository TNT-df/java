输入一个长度为n的整数序列。

接下来输入m个操作，每个操作包含三个整数l, r, c，表示将序列中[l, r]之间的每个数加上c。

请你输出进行完所有操作后的序列。

输入格式
第一行包含两个整数n和m。

第二行包含n个整数，表示整数序列。

接下来m行，每行包含三个整数l，r，c，表示一个操作。

输出格式
共一行，包含n个整数，表示最终序列。

数据范围
1≤n,m≤100000,
1≤l≤r≤n,
1000≤c≤1000,
1000≤整数序列中元素的值≤1000
输入样例：
6 3
1 2 2 1 2 1
1 3 1
3 5 1
1 6 1
输出样例：
3 4 5 3 4 2
 /*
 
    a[i] = b[1]+b[2]+....+b[i];
    b[1]=a[1]-a[0];
    b[2]=a[2]-a[1];
    b[3]=a[3]-a[2];
    要在a[l,r]中添加一个c即在
    b[l]+c,b[r+1]-c ;由于  	
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
        //初始化b数组
        for(int i =1;i<=n;i++){
            b[i]=a[i]-a[i-1];// insert(i,i,a[i]);
        }
        while(m-->0){
            int l=input.nextInt();
            int r=input.nextInt();
            int c=input.nextInt();
              insert(l,r,c);//对区间[l,r]中的数进行修改
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