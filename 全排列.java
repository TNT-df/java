给定一个 没有重复 数字的序列，返回其所有可能的全排列。

示例:

输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]



class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
    List<Integer> arr = new ArrayList<>();
    boolean[] choice = new boolean[nums.length];
    dfs(0,arr,nums,choice);
    return list;
    }
    public void dfs ( int start,List<Integer> arr,int[] nums,boolean [] choice){
        if(arr.size()== nums.length){
            list.add(new ArrayList<Integer>(arr));
            return ;
        }
        for(int i = 0;i < nums.length;i++ ){
           if(choice[i]==true)  //判断当前数字是否已被使用
            continue;
            choice[i]=true;
            arr.add(nums[i]);
            dfs(start+1,arr,nums,choice); 
            choice[i]=false;  //回溯
            arr.remove(arr.size()-1);
        }
    }
}