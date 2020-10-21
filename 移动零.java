给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:

输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:

class Solution {
    public void moveZeroes(int[] nums) {
   int i=0;
   for(int  j=0;j<nums.length;j++){
       if(nums[j]!=0){
           int temp=nums[j];
           nums[j]=nums[i];
           nums[i] =temp;
           i++;
       }
   }
    }
}