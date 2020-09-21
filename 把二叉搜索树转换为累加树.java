给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使
得每个节点的值是原来的节点值加上所有大于它的节点值之和。

 

思路：反选中序遍历

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
    int sum;
    public TreeNode convertBST(TreeNode root) {
      if(root!=null){
          convertBST(root.right);
          sum+=root.val;
          root.val=sum;
          convertBST(root.left);
      }
      return root;
    }
}