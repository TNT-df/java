19.ĳ��Ʒ��2�ֲ�ͬ�����İ�װ����Ӧ��ͬ�ļ۸�;
ͬʱ�ṩ��200Ԫ��50Ԫ�Ĳ���������ȯ���������ѹ�����ԣ�
�ڵ��ι�����������ܼ۹�������500����Ʒ��
����˵��:���ְ�װ�������ͼ۸�(��Ϊ����)
���˵��:������Ʒ���Թ����������޽������:-1)
��������:100 80 200 150
�������:5 0
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
    		 if(ts == 500 && tp<pre) { //��ǰ������==500�����Ҽ۸��ǲ������
    			 t1=i;
    			 t2=j;
    			 pre=tp;
    		 }
    	 }
     }
     System.out.println(t1+" "+t2);
  }
}
