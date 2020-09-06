给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其自底向上的层次遍历为：

[
  [15,7],
  [9,20],
  [3]
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
    //存放最终结果
     List<List<Integer>> list = new LinkedList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       
     if(root==null){
         return list;
     }
     //先将根节点存入队列
     Queue<TreeNode> queue = new LinkedList<TreeNode>();
     queue.offer(root);
     while(!queue.isEmpty()){
         //每次遍历为队列的长度
         int size = queue.size();
         List<Integer> arr= new ArrayList<>();
         //将当前层的元素全部出去，放入临时数组,若左右孩子都不为空将其加入队列
         for(int i =0;i<size;i++){      
         TreeNode node = queue.remove();
         arr.add(node.val);
         if(node.left!=null){
              queue.offer(node.left);
         }
         if(node.right!=null){
             queue.offer(node.right);  
          }
         }
       list.add(arr);
       //对当前一层节点加入list中
     }
     Collections.reverse(list);
     //将list 逆置
     return list;
} 
}