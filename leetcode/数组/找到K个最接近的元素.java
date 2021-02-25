给定一个排序好的数组 arr ，两个整数 k 和 x ，从数组中找到最靠近 x（两数之差最小）的 k 个数。返回的结果必须要是按升序排好的。

整数 a 比整数 b 更接近 x 需要满足：

|a - x| < |b - x| 或者
|a - x| == |b - x| 且 a < b
 

示例 1：

输入：arr = [1,2,3,4,5], k = 4, x = 3
输出：[1,2,3,4]
示例 2：

输入：arr = [1,2,3,4,5], k = 4, x = -1
输出：[1,2,3,4]

//要移除的元素个数为  数组长度减去k
// 双指针依次比较左右两边的数-x的绝对值大小，移动左/右指针只要退出循环，
//将left-right中的元素加入list中 
 



class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      int l = 0 ;
      int r = arr.length-1;
      int size = arr.length - k;
      while(size>0){
          if(Math.abs(arr[l]-x)>Math.abs(arr[r]-x))
          l++;
          else{
            r--;
          }
            size--;
      }
      List<Integer> list = new ArrayList<>();
      for(int i = l ;i<=r;i++){
          list.add(arr[i]);
      }
      return list;
    }
}