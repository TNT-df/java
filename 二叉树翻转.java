翻转一棵二叉树。

示例：

输入：

     4
   /   \
  2     7
 / \   / \
1   3 6   9
输出：

     4
   /   \
  7     2
 / \   / \
9   6 3   1

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
    public TreeNode invertTree(TreeNode root) {
     if(root==null)
     return null;
     TreeNode left = invertTree(root.left);
     TreeNode right = invertTree(root.right);
     root.left = right;
     root.right  = left;
     return root;
    }
}

//2
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
    public TreeNode invertTree(TreeNode root) {
      if(root == null)
      return null;
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);
    while(!queue.isEmpty()){
        TreeNode  temp = queue.poll();
        TreeNode left = temp.left;  //交换左右子树
			temp.left = temp.right;
			temp.right = left;
        if(temp.left!=null)
        queue.offer(temp.left);
        if(temp.right!=null)
        queue.offer(temp.right);
    }
    return root;
    }
}