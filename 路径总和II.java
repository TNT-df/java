给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。

说明: 叶子节点是指没有子节点的节点。

示例:
给定如下二叉树，以及目标和 sum = 22，

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
返回:

[
   [5,4,11,2],
   [5,8,4,5]
]

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
    List<List<Integer>> list= new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
       List<Integer> arr= new ArrayList();
         dfs(root,sum,arr);
         return list;
    }
    public void dfs(TreeNode root,int sum ,List<Integer> arr){
       if(root == null){
           return;
       }
       arr.add(root.val);
       sum-=root.val;
       if(root.left == null &&root.right==null && sum ==0)
       {
           list.add(new ArrayList<Integer>(arr));
       }
       dfs(root.left,sum,arr);
       dfs(root.right,sum,arr);
       arr.remove(arr.size()-1);
        
    }
}