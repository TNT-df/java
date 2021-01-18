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
		//��list�е�Ԫ�ذ����������˵��������
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
			if(a[0] > r) {   //��ǰ�������˵�>��һ��������Ҷ˵�  
				if(l !=Integer.MIN_VALUE) {  //��ǰ�������˵㲻Ϊ-����
					res.add(new int[]{l,r});  //���ϸ��������������
					k++; 
				}
				l = a[0];                     //�����ϸ���������Ҷ˵�
				r = a[1];
			}else {                        //����ǰ�������˵�С���ϸ�������Ҷ˵�����Ҷ˵�
			 r = max(r, a[1]);
			}
		}
         if(l!=Integer.MIN_VALUE) {
        	 res.add(new int[] {l,r});  //�ж������Ƿ�Ϊ��
        	 k++;
         }
         System.out.println(k);
         System.out.println(res);
	}

}
