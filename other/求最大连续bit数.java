题目描述
功能:求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
输入:一个byte型的数字
输出:无
返回:对应的二进制数字中1的最大连续数
输入描述:
输入一个byte数字
输出描述:
输出转成二进制之后连续1的个数

import java.util.*;

public class Main{
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
        
         while(in.hasNext()){
          int n = in.nextInt();
         int count = 0;
         int max = 0;
         while(n != 0){
			 //判断当前位是否为1
             if((n & 1 ) == 1){
                 count ++;
				 //更新个数
                 max = Math.max(count,max);              
             }else{
           count = 0;
             }
              n >>=1;
         }
         System.out.println(max);
     }
         }
}