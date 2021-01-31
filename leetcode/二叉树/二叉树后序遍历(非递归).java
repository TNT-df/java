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
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         if(root == null)
         return list;
         Deque<TreeNode> stack = new LinkedList<>();
         TreeNode pre = null;
         while(root != null ||!stack.isEmpty()){
             while(root != null){
                 stack.push(root);
                 root = root.left;
             }
             root = stack.pop();
             if(root.right ==null || root.right == pre){
                list.add(root.val);
                pre = root;
                root = null;
             }else{
             stack.push(root);
             root = root.right;
             }
         }
           return list;
    }
}