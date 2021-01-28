

boolean isCompleteTree(TreeNode root){
  if(root == null) return true;
  Queue<TreeNode> queue = new LinkedList<>();
  queue.offer(root);
  while(!queue.isEmpty()&& queue.peek()!= null){
	  TreeNode temp = queue.poll();
	  queue.offer(temp.left);
	  queue.offer(temp.right);
}

while(!queue.isEmpty()){
 TreeNode temp = queue.poll();
 if( temp £¡= null)  return false;
}
return true;
}