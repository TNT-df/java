package com.df.tset;

public class eightQueue {
	static int count =0;
	static int max=8;
	static int [] a = new int [max];
   public static void main(String[] args) {
	checked(0);	
}
   /*
    * 判断当前的位置是否发生冲突
    */
   public static void checked(int n) {
	   if(n==max) { //判断到最后一个直接退出
		   print();
		   return;
	   }
	   for(int i =0;i < max;i++) {
		   a[n]=i; 
		   if(pd(n)) {  //判断当前位置和前面已放置的位置是否冲突
			   checked(n+1);  //
		   }
		   //放到下一个位置
	   }
   }
   //判断任意两个皇后是否在同一列或者同一对角线
   public static boolean pd(int n) {
	   for(int i = 0;i<n;i++) {
		   if(a[i]==a[n]||Math.abs(n-i)==Math.abs(a[n]-a[i]))
			   return false;
	   }
	   return true;
   }

	public static void print() {
		count++;
		for (int i : a) {
			System.out.print(i + "");
		}
		System.out.println();
	}
}
