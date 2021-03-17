package 蓝桥杯112;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class02 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
     BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\eclipse_workspace\\蓝桥杯\\src\\蓝桥杯112\\test.txt")));
     char[][] ch = new char[300][300];
     for(int i = 0 ;i<300;i++) {
    	 ch[i] = br.readLine().toCharArray();
     }
     int count = 0;
     //行检查
     for(int i = 0;i<ch.length-3;i++) {
    	 for(int j = 0;j<ch[i].length;j++) {
    		 if(ch[i][j]=='2'&&ch[i+1][j]=='0'&&ch[i+2][j]=='2'&&ch[i+3][j]=='0') {
    			 count++;
    		 }
    	 }
     }
     for(int i = 0;i<ch.length;i++) {
    	 for(int j = 0;j<ch[i].length-3;j++) {
    		 if(ch[i][j]=='2'&&ch[i][j+1]=='0'&&ch[i][j+2]=='2'&&ch[i][j+3]=='0') {
    			 count++;
    		 }
    	 }
     }
     for(int i = 0;i<ch.length-3;i++) {
    	 for(int j = 0;j<ch[i].length-3;j++) {
    		 if(ch[i][j]=='2'&&ch[i+1][j+1]=='0'&&ch[i+2][j+2]=='2'&&ch[i+3][j+3]=='0') {
    			 count++;
    		 }
    	 }
     }
     System.out.println(count);
	}

}
