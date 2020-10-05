给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

 

示例：

给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int first = 0; first < len ; first ++){
            if(first > 0 && nums[first] == nums [first - 1]){  //确保本次循环不重复
                continue;
            }
            int third  = len -1;
            for(int second = first +1 ; second < len ; second++){
               if(second>first+1 && nums[second]==nums[second-1]){
                 continue;
               }      
               //third 在 second 的左侧
             while(second < third && nums[second] + nums[third] + nums[first] >0){
                --third ;
             }
             if(second == third) //second == third 退出本次循环 
             break;
             if(nums[second] + nums[third] +nums[first] == 0){
                 List<Integer> arr = new ArrayList<>();
                 arr.add(nums[first]);
                 arr.add(nums[second]);
                 arr.add(nums[third]);
                 list.add(arr);
             }
           }
        }
        return list;
    }
}


