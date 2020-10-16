给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，
要求也按非递减顺序排序。
示例 1：

输入：[-4,-1,0,3,10]
输出：[0,1,9,16,100]
示例 2：

输入：[-7,-3,2,3,11]
输出：[4,9,9,49,121]
 

class Solution {
    public int[] sortedSquares(int[] A) {
   int len = A.length;
   int[] res = new int [len];
   int k =len -1;
   for (int i =0,j=len-1 ;i<=j;){
       int m=A[i]*A[i];
       int n=A[j]*A[j];
       if(m<=n){
           res[k--]=n;
           j--;
       }else{
          res[k--]=m;
          i++;
       }
   }
       return res;
   }  
}