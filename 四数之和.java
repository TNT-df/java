给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。

注意：

答案中不可以包含重复的四元组。

示例：

给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。

满足要求的四元组集合为：
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
   for(int i = 0;i < nums.length-3;i ++){
       if(i>0&&nums[i]==nums[i-1])
       continue;
       if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)
       break;
       if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)
       continue;
       for(int j = i+1; j < nums.length-2 ;j++){
           if(j > i+1 && nums[j] == nums[j-1] )
           continue;
           if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target)
           break;
       int third = j+1;
       int forth = nums.length-1;
       while(third< forth){
           int sum =nums[i]+nums[j]+nums[third]+nums[forth];
           if(sum==target){
               List<Integer> arr = new ArrayList<>();
               arr.add(nums[i]);
               arr.add(nums[j]);
               arr.add(nums[third]);
               arr.add(nums[forth]);
               list.add(arr);
               while(third < forth && nums[third] == nums[third+1]){
                 third++;
               }            
               third++;
              while(third < forth && nums[forth] == nums[forth-1]){
                  forth--;
              }        
              forth--;      
            }else if(sum < target){
                third++;
            } else{
                forth--;
            }
         
       }
       }
   }
   return list;
    }
}