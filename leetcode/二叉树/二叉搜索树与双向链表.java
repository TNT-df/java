����һ�ö��������������ö���������ת����һ�������˫������
Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public TreeNode prev = null;
    public void inorder(TreeNode root){
       if(root == null) return ;
        inorder(root.left);
        root.left = prev;
        if(prev !=null)
             prev.right = root;
        prev =  root;
        inorder(root.right);
      
     }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        inorder(pRootOfTree);
        TreeNode head = pRootOfTree;
        while(head.left !=null)
            head = head.left;
         return head;
    }
   
}