给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。

让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：

A.length >= 3
在 0 < i < A.length - 1 条件下，存在 i 使得：
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]
示例 1：

输入：[2,1]
输出：false
示例 2：

输入：[3,5,5]
输出：false
示例 3：

输入：[0,3,2,1]
输出：true

//方法一
class Solution {
    public boolean validMountainArray(int[] A) {
    if(A.length < 3 )
    return false;
    int r=0;
        while(r+1<A.length&&A[r]<A[r+1])
        r++;
      if(r==0||r==A.length-1)
      return false;
      while(r+1<A.length&& A[r]>A[r+1])
      r++;
      return r==A.length-1;
    }
    }
//方法二 双指针
class Solution {
    public boolean validMountainArray(int[] A) {
if(A.length < 3){
    return false;
}
 int len = A.length;
 int left = 0;
 int right = len -1;

 while(left + 1 < len && A[left] < A[left + 1]){
 left++;
 }
 while(right -1 >0 && A[ right] < A[right - 1]){
    right--;
 }
 return left==right&&left!=len-1&&right!=0;
    }
}
