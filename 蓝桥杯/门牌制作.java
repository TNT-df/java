package ���ű�112;

import java.util.Scanner;

public class class01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       int res  = 0;
       for(int i = 1 ;i <= 2020;i++) {
    	   res += cal(i);
       }
       System.out.println(res);
	}
    public static int cal(int x) {
    	int res = 0;
    	while(x > 0 ) {
    		  int k = x % 10;
    		 if(k == 2) res++;
    		 x/=10;
    	}
    	return res;
    }
}
