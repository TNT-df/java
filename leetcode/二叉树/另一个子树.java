给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。

示例 1:
给定的树 s:

     3
    / \
   4   5
  / \
 1   2
给定的树 t：

   4 
  / \
 1   2
返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。

示例 2:
给定的树 s：

     3
    / \
   4   5
  / \
 1   2
    /
   0
给定的树 t：

   4
  / \
 1   2
返回 false。


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
     if(s == null && t ==null) return true;
     if(s == null && t != null) return false;
      if( isSameTree(s,t)) return true;
       return isSubtree(s.left,t) || isSubtree(s.right,t);
         
    }
     public boolean isSameTree(TreeNode p, TreeNode q) {
   if(p == null && q != null || p != null && q== null)
       return false;
   if(q==null && q ==null) return true;
   if(p.val == q.val)
    return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    else return false;
    }
}