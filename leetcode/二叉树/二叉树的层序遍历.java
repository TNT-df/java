给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。

?

示例：
二叉树：[3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其层序遍历结果：

[
  [3],
  [9,20],
  [15,7]
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
        return list;
        Queue<TreeNode> q  = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> a = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode cur = q.poll();
               a.add(cur.val);
               if(cur.left != null) q.offer(cur.left);
               if(cur.right != null) q.offer(cur.right);
            }
            list.add(a);
        }
        return list;
    }
}