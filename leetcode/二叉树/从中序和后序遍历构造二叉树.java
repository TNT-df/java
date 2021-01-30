根据一棵树的中序遍历与后序遍历构造二叉树。

注意:
你可以假设树中没有重复的元素。

例如，给出

中序遍历 inorder = [9,3,15,20,7]
后序遍历 postorder = [9,15,7,20,3]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7


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
    public int  idx = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      if(inorder == null || postorder == null) return null;
      if(inorder.length == 0 || postorder.length == 0) return null;
        idx = postorder.length-1;
    return createTree(inorder,postorder,0,postorder.length - 1);
    }
    public TreeNode createTree(int[] inorder,int postorder[],int beign,int end){
       if(beign > end) return null;
       TreeNode root = new TreeNode(postorder[idx]);
       int mid = find(inorder,beign,end,postorder[idx]);
       idx--;     
        root.right = createTree(inorder,postorder,mid + 1, end);
        root.left = createTree(inorder,postorder,beign,mid - 1);
         return root;
    }

    public int find(int[] inorder,int begin,int end,int val){
        for( ;begin <= end;begin ++){
            if(inorder[begin] == val)
            return begin;
        }
        return -1;
    }
}