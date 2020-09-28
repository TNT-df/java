给定一个二叉树

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。

初始状态下，所有 next 指针都被设置为 NULL。

 

进阶：

你只能使用常量级额外空间。
使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 

示例：



输入：root = [1,2,3,4,5,null,7]
输出：[1,#,2,3,#,4,5,7,#]
解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。


/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
          if(root == null)
            return null;
        Queue<Node> queue= new LinkedList<>();
       queue.offer(root);
    while(!queue.isEmpty()){
        //当前行结点的个数
        int n = queue.size();
        Node pre= null;
        for(int i =0 ;i<n;i++){
          Node temp = queue.poll();
          //pre ==null 说明 temp为此行第一个结点
          if(pre != null){
              pre.next = temp;
          }
          //pre成为前一个节点
           pre =temp;
           if(temp.left != null){
               queue.offer(temp.left);
           }
           if(temp.right!= null){
               queue.offer(temp.right);
           }
        }
    }
    return root;
      }
}