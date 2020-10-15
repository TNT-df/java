

给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。

初始状态下，所有 next 指针都被设置为 NULL。
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
        if(root == null){
            return null;
        }
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
          int size = queue.size();
          for(int i =0;i<size;i++){
              Node node =  queue.poll(); 
			  //建立连接
               if(i<size - 1){
                   node.next = queue.peek();
               }
              if(node.left != null){
                  queue.add(node.left); //加入左子树
              }
              if(node.right !=null){    //加入右子树
                  queue.add(node.right);
              }
          }
      }
      return root;
    }
}