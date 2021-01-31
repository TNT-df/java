给定一个二叉树，返回它的 前序 遍历。

 示例:

输入: [1,null,2,3]  
   1
    \
     2
    /
   3 

输出: [1,2,3]


//迭代法
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
    while(!stack.isEmpty()||node!=null){
      while(node != null){
          list.add(node.val);
          stack.push(node);
          node=node.left;
      }
      node  =stack.pop();
      node=node.right;
    }
    return list;
    }
}
//非递归遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack =new LinkedList<>();
        LinkedList<Integer> list=new LinkedList<>();
             TreeNode node =root;     
             if(node==null)
             return list;  
             stack.push(node);
            while(!stack.isEmpty()){
                node = stack.pop();
            list.add(node.val);
            if(node.right!=null)
             stack.push(node.right);
             if(node.left!=null)
             stack.push(node.left);
            }
            return list;
       }
    }
