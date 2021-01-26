给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。

 

示例 ：

输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \ 
1        7   9

输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9  



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
    List<Integer> list = new ArrayList<>();    
    public TreeNode increasingBST(TreeNode root) {
     get(root);
     return create( );
    }
    public void get(TreeNode root){
        if(root == null) return;
        get(root.left);
        list.add(root.val);
        get(root.right);
    } 
    public TreeNode create(){
        if(list.size() == 0) 
        return null;
        TreeNode node = new TreeNode(list.get(0));
        TreeNode temp =node;
        for(int i = 1;i < list.size();i++){
         temp.right = new TreeNode(list.get(i));
         temp =temp.right;
        }
        return  node;
    }
}