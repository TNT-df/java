给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。


示例 1：

输入：
    3
   / \
  9  20
    /  \
   15   7
输出：[3, 14.5, 11]
解释：
第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> sum = new ArrayList<>(); //存放当前层的和
    List<Integer> counts = new ArrayList<>();//存放当前层的结点总数
    dfs(root,0,sum,counts);
    List<Double> avg= new ArrayList<>();
    for(int i=0;i<sum.size();i++){
        avg.add(sum.get(i)/counts.get(i));
    }
    return avg;
    }
  public void dfs(TreeNode root,int level,List<Double> sum,List<Integer> counts){
      if(root ==null){  //如果为空返回
          return;
      }
      if(level<sum.size()){ 
          sum.set(level,sum.get(level)+root.val); //将level层的结点的值加入level层的值中
          counts.set(level,counts.get(level)+1); //将leve层的结点数加1
      }else{
          sum.add(1.0*(root.val));
          counts.add(1);
      }
      dfs(root.left,level+1,sum,counts);
      dfs(root.right,level+1,sum,counts);
  }
}