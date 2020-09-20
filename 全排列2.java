给定一个可包含重复数字的序列，返回所有不重复的全排列。

示例:

输入: [1,1,2]
输出:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]

class Solution {
    List<List<Integer>> list = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
    List<Integer> ll = new LinkedList<>();
    boolean[]  b = new boolean[nums.length];
    if(nums.length==0){
        return list;
    } 
    Arrays.sort(nums);
    dfs(0,ll,b,nums);
    return list;
    }
    public void dfs(int index,List<Integer> ll,boolean[] b,int []  nums){
    if(index==nums.length){
     list.add(new LinkedList<Integer>(ll));
     return;
    }
    for(int i = 0 ;i<nums.length;i++){
        if(b[i]||(i > 0 && nums[i] == nums[i-1])&&!b[i-1])   //当前未被遍历，去除此元素之前出现
        continue;
     ll.add(nums[i]);
    b[i]=true ;
    dfs(index+1,ll,b,nums);
    b[i]=false;  //回溯
    ll.remove(ll.size()-1);
    }
    }
}