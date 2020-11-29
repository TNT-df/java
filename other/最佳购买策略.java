19.某商品有2种不同数量的包装，对应不同的价格;
同时提供满200元减50元的不限量购物券，试求解最佳购买策略，
在单次购买中以最低总价购买正好500个商品。
输入说明:两种包装的数量和价格(均为整数)
输出说明:两种商品各自购买数量（无解则输出:-1)
输入样例:100 80 200 150
输出样例:5 0
import java.util.Scanner;

public class test3 {
  public static void main(String[] args) {
	  Scanner in =new Scanner(System.in);
       
     int a = in.nextInt();
     int b = in.nextInt();
     int c = in.nextInt();
     int d = in.nextInt();
     int t1 =0,t2=0;
     int pre =Integer.MAX_VALUE;
     for(int i = 0;i<500;i++) {
    	 int sum =i*a;
    	 int p =i*b;
    	 if(sum > 500) {
    		 sum = 0;
    		 p=0;
    	 }
    	 for(int j=0;j<500;j++) {
    		 int ts =sum+j*c;
    		 int tp =p +j*d;
    		 tp -= (tp/200)*50;
    		 if(ts == 500 && tp<pre) { //当前总数量==500？并且价格是不是最低
    			 t1=i;
    			 t2=j;
    			 pre=tp;
    		 }
    	 }
     }
     System.out.println(t1+" "+t2);
  }
}
