����һ����������������Ƿ��Ǿ���ԳƵġ�



���磬������?[1,2,2,3,4,4,3] �ǶԳƵġ�

    1
   / \
  2   2
 / \ / \
3  4 4  3


�����������[1,2,2,null,3,null,3] ���Ǿ���ԳƵ�:

    1
   / \
  2   2
   \   \
   3    3



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
    public boolean isSymmetric(TreeNode root) {
     if(root == null) return true;
      return pd(root.left,root.right);
    }
    public boolean pd(TreeNode L,TreeNode R){
        if(L == null && R== null) return true;
        if(L == null &&R != null || L !=null && R==null ) return false;
        if(L.val != R.val) return false;
        return pd(L.left,R.right) && pd(L.right,R.left);
    }
}