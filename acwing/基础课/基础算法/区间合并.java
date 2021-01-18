package com.df.tset;

import static java.lang.Math.max;

import java.util.*;



public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		List<int []> list = new ArrayList<>();
		int n =input.nextInt();
		for(int i = 0;i < n;i++) {
			int l = input.nextInt();
			int r = input.nextInt();
			list.add(new int[]{l,r});
		}
		merage(list);
	}
	public static void merage(List<int []> list) 
	{
		List<int []> res = new ArrayList<>();
		//将list中的元素按照数组的左端点进行排序
		list.sort(new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		int k=0;
         int l = Integer.MIN_VALUE;
         int r = Integer.MIN_VALUE;
         for (int[] a : list) {
			if(a[0] > r) {   //当前区间的左端点>上一个区间的右端点  
				if(l !=Integer.MIN_VALUE) {  //当前区间的左端点不为-无穷
					res.add(new int[]{l,r});  //将上个区间放入结果集中
					k++; 
				}
				l = a[0];                     //保留上个区间的左右端点
				r = a[1];
			}else {                        //若当前区间的左端点小于上个区间的右端点更新右端点
			 r = max(r, a[1]);
			}
		}
         if(l!=Integer.MIN_VALUE) {
        	 res.add(new int[] {l,r});  //判断区间是否为空
        	 k++;
         }
         System.out.println(k);
         System.out.println(res);
	}

}
