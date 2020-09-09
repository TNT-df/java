给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

candidates 中的数字可以无限制重复被选取。

说明：

所有数字（包括 target）都是正整数。
解集不能包含重复的组合。 
示例 1：

输入：candidates = [2,3,6,7], target = 7,
所求解集为：
[
  [7],
  [2,2,3]
]
示例 2：

输入：candidates = [2,3,5], target = 8,
所求解集为：
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]

class Solution {
    List<List<Integer>> list =new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
   ArrayList<Integer> arr = new ArrayList<>();
     dfs(0,arr,candidates,target,0);
     return list;
    }
    public void dfs(int start,ArrayList<Integer> arr,int[] candidates,int target,int sum){
        if(sum==target){
            list.add(new ArrayList<Integer> (arr));
            return;
        }
        if(sum>target){
            //和大于目标数返回
            return;
        }
        for(int i=start;i<candidates.length;i++){
            arr.add(candidates[i]);
            //当前数加入arr
            dfs(i,arr,candidates,target,sum+candidates[i]);
            //进入下一次循环
            arr.remove(arr.size()-1);
        }
    }
}
