

给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

示例:

输入: n = 4, k = 2
输出:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]



class Solution {
    List<List<Integer>> list= new ArrayList<>();//存放结果
    public List<List<Integer>> combine(int n, int k) {
     ArrayList<Integer> arr = new ArrayList<>();//临时数组
     dfs(1,n,k,arr);
     return list;
    }
    public void dfs(int start,int n,int k,ArrayList<Integer> arr){
        if(arr.size()==k){ //临时数组大小==k ，放入结果集中
            list.add(new ArrayList<Integer> (arr));
            return;
        }
        for(int i = start;i<=n;i++){
            //当前值放入arr
            arr.add(i);
            //dfs
            dfs(i+1,n,k,arr);
            //删除当前arr中最后一个元素进行下次遍历
            arr.remove(arr.size()-1);
        }
    }
}


