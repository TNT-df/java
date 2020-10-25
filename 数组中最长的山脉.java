我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：

B.length >= 3
存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
（注意：B 可以是 A 的任意子数组，包括整个数组 A。）

给出一个整数数组 A，返回最长 “山脉” 的长度。

如果不含有 “山脉” 则返回 0。

 

示例 1：

输入：[2,1,4,7,3,2,5]
输出：5
解释：最长的 “山脉” 是 [1,4,7,3,2]，长度为 5。
示例 2：

输入：[2,2,2]
输出：0
解释：不含 “山脉”。
 
//双指针
class Solution {
	
	
	
    public int longestMountain(int[] A) {
 if(A.length == 0)
  return 0;
 int res = 0;
 int l = 0,r = 0;
 while (r < A.length){
     while(r+1 < A.length && A[r+1] > A[r])
     r++;  //从左扫描升序
     int temp = r;
     while(r > l &&r+1<A.length && A[r+1] < A[r])
     r++;  //从山顶扫描降序
     if(r == temp ){  //没有升序,从下一次开始
         r++;
         l=r;
     }else{
         res=Math.max(res,r-l+1); //比较山脉的最大长度，更新最大长度
         l=r; //进行下一次遍历
     }
     
 }
 return res;
    }
}

//动态规划
class Solution {
    public int longestMountain(int[] A) {
   if(A.length == 0){
       return 0;
   }
   int[] left = new int[A.length];
   for(int i = 1 ;i < A.length;i ++){
       left[i]=A[i -1] < A[i] ? left[i - 1] + 1: 0; //left[i] 记录当前位置的升序个数
   }
   int[] right = new int[A.length];
   for(int i = A.length - 2;i >= 0;i --){
       right[i] = A[i+1] < A[i] ?right [i+1] +1 : 0; //right[i]记录当前位置的降序个数
   }
   int res=0;
   for(int i = 0;i < A.length;i ++){
       if(left[i]>0 && right[i]>0){
          res=Math.max(res,right[i]+left[i] +1);   //两个交汇处即为山顶
       }
   }
   return res;
    }
}