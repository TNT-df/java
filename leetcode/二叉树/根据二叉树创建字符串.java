����Ҫ����ǰ������ķ�ʽ����һ��������ת����һ�������ź�������ɵ��ַ�����

�սڵ�����һ�Կ����� "()" ��ʾ����������Ҫʡ�����в�Ӱ���ַ�����ԭʼ������֮���һ��һӳ���ϵ�Ŀ����Ŷԡ�

ʾ�� 1:

����: ������: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

���: "1(2(4))(3)"

����: ԭ�����ǡ�1(2(4)())(3())����
����ʡ�����в���Ҫ�Ŀ����Ŷ�֮��
�����ǡ�1(2(4))(3)����
ʾ�� 2:

����: ������: [1,2,3,null,4]
       1
     /   \
    2     3
     \  
      4 

���: "1(2()(4))(3)"

����: �͵�һ��ʾ�����ƣ�
�������ǲ���ʡ�Ե�һ�����������ж���������֮���һ��һӳ���ϵ��


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
    StringBuilder sb =new StringBuilder();
    public String tree2str(TreeNode t) {
      if(t== null) return "";
       preorder(t);
       return sb.toString();
    }
    public void preorder(TreeNode t){
        if(t == null) sb.append(")");
        if(t != null){
            sb.append(t.val+"");
        }
        if(t.left == null){
            if(t.right == null)
              return;
            else
                sb.append("()");
        }else{
            sb.append("(");
            preorder(t.left);
            sb.append(")");
        }
       if(t.right != null){
           sb.append("(");
           preorder(t.right);
           sb.append(")");
       }
    }
}