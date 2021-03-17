package 蓝桥杯112;

import java.util.HashSet;
import java.util.Scanner;

public class class09 {
 static String string = null;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
     Scanner in = new Scanner(System.in);
     string = in.nextLine();
     int len =string.length();
     int res = 0;
     for(int i = 0 ;i <len;i++){
    	 for(int j=0;j<len;j++) {
    		 res+=cal(i,j);
    	 }
     }
     System.out.println(res);
	}
	static int cal(int i, int j) {
		int res = 0;
		HashSet<Character> set = new HashSet<Character>();
		for( ;i<=j;i++) {
			if(!set.contains(string.charAt(i))) {
				set.add(string.charAt(i));
				res++;
			}
		}
		return res;
	}

}
