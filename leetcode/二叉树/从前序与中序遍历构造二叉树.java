根据一棵树的前序遍历与中序遍历构造二叉树。

注意:
你可以假设树中没有重复的元素。

例如，给出

前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
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
     public int i = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      if(preorder.length == 0 || inorder.length == 0)
         return null;
        return createInorder(preorder,inorder,0,inorder.length -1);
    }

    public TreeNode createInorder(int pre [],int [] post,int begin,int end){
        if(begin > end) return null;
        TreeNode root = new TreeNode(pre[i]);
        int idx = find(post,begin,end,pre[i]);
        i++;
        root.left = createInorder(pre,post,begin,idx-1);
        root.right = createInorder(pre,post,idx+1,end);
        return root;
             
    }
    public int find (int post[], int begin ,int end ,int val){
        for(int i= begin; i<= end;i++){
            if(post[i] == val){
                return i;
            }
        }
        return -1;
    }
}