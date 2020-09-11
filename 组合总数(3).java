找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。

说明：

所有数字都是正整数。
解集不能包含重复的组合。 
示例 1:

输入: k = 3, n = 7
输出: [[1,2,4]]
示例 2:

输入: k = 3, n = 9
输出: [[1,2,6], [1,3,5], [2,3,4]]

class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(1,arr,k,n,0);
        return list;
    }
    public void dfs(int start,ArrayList<Integer> arr,int k,int n ,int sum){
        if(sum==n&&arr.size()==k){
            list.add(new ArrayList<Integer>(arr));
            return;
        }
        if(sum>n||arr.size()>k){
            return;
        }
        for(int i =start;i<=9;i++){
            if(i>start&&i==i-1)
            continue;
            arr.add(i);
            dfs(i+1,arr,k,n,sum+i);
           arr.remove(arr.size()-1);
        }
    }
}