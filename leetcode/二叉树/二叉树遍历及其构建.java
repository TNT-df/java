��һ�����򣬶����û������һ����������ַ��������ݴ��ַ�������һ������������ָ�뷽ʽ�洢���� �������µ���������ַ����� ABC##DE#G##F### ���С�#����ʾ���ǿո񣬿ո��ַ����������������˶������Ժ��ٶԶ������������������������������
��������:
�������1���ַ��������Ȳ�����100��
�������:
�����ж���������ݣ�����ÿ�����ݣ�
����������ַ���������������������������У�ÿ���ַ����涼��һ���ո�
ÿ��������ռһ�С�
ʾ��1
����
����
abc##de#g##f###
���
����
c b e g d f a 

import java.util.*;

class Node {
 public char val;
 public Node left;
 public Node right;
    
    public Node(char ch){
     this.val = ch;
    }
    
}

public class Main{
    static int i = 0;
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
       Node root= CreateTree(str);
        inorder(root);
}
   static Node CreateTree(String str){
       if(str == null) return null ;
       Node node =null;
     if(str.charAt(i) != '#'){
          node = new Node(str.charAt(i));
          i++;
          node.left = CreateTree(str);
          node.right = CreateTree(str);
        }else
           i++;
       return node;
}
 static  void inorder(Node root){
     if(root == null)
        return ;
     inorder(root.left);
     System.out.print(root.val+" ");
     inorder(root.right);
}
}