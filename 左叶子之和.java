计算给定二叉树的所有左叶子之和。

示例：

    3
   / \
  9  20
    /  \
   15   7

在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
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
    int sum=0;  
    public int sumOfLeftLeaves(TreeNode root) {
      if( root == null)
      return 0;
      dfs(root);
      return sum;
    }
    public void dfs(TreeNode root){
        if(root.left!=null){
            if(isLeafNode(root.left)){
              sum+=root.left.val;
            }else {
                dfs(root.left);
            }         
        }
        if(root.right!=null&&!isLeafNode(root.right)){       //判断右子树不为空
                  dfs(root.right); 
        }
    }
    public boolean isLeafNode(TreeNode node){    //判断叶子结点
        return  node.left==null&&node.right==null;
    }
    
}