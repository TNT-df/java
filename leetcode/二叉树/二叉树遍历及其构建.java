编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。 例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
输入描述:
输入包括1行字符串，长度不超过100。
输出描述:
可能有多组测试数据，对于每组数据，
输出将输入字符串建立二叉树后中序遍历的序列，每个字符后面都有一个空格。
每个输出结果占一行。
示例1
输入
复制
abc##de#g##f###
输出
复制
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