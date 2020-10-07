
给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

注意:
不能使用代码库中的排序函数来解决这道题。

示例:

输入: [2,0,2,1,1,0]
输出: [0,0,1,1,2,2]
//解法一 单指针 先把0放在最前面，再把1放在0后面
class Solution {
    public void sortColors(int[] nums) {
        int pre =0 ;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[pre];
                nums[pre] = temp;
                pre++;
            }
        }
        for(int i = pre ; i <nums.length;i++){
             if(nums[i]==1){
                int temp = nums[i];
                nums[i] = nums[pre];
                nums[pre] = temp;
                pre++;
            }
        }
    }
}
//解法二 双指针
class Solution {
    public void sortColors(int[] nums) {
        int p0=0,p1=0;
   for(int i = 0 ;i < nums.length ;i ++){
       if( nums[i] == 1){
           int temp = nums[i];
           nums[i] =  nums[p1];
           nums[p1] = temp;
           ++ p1;
       }else if( nums [i] ==0){
            int temp = nums[i];
           nums[i] =  nums[p0];
           nums[p0] = temp;
           if(p0 < p1){
               temp = nums[i];
               nums[i] = nums[p1];
               nums[p1] = temp;
           }
           ++p0;
           ++p1;
       }
      }   
    }
}