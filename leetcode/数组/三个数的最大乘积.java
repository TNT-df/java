给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。

?
  
示例 1：

输入：nums = [1,2,3]
输出：6
示例 2：

输入：nums = [1,2,3,4]
输出：24
示例 3：

输入：nums = [-1,-2,-3]
输出：-6
//若全为正数则为排序后三个数，若有负数为1、2和最后一个数
class Solution {
    public int maximumProduct(int[] nums) {
     Arrays.sort(nums);
     int len = nums.length;
     int k = nums[len-1]* nums[len -2] * nums[len -3];
     int y =nums[0]*nums[1]*nums[len -1];
     return Math.max(k,y);
    }
}