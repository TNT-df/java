给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。

假定 BST 有如下定义：

结点左子树中所含结点的值小于等于当前结点的值
结点右子树中所含结点的值大于等于当前结点的值
左子树和右子树都是二叉搜索树
例如：
给定 BST [1,null,2,2],

   1
    \
     2
    /
   2
返回[2].

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /**
     中序遍历二叉搜索树得到一个递增序列
 */
class Solution {
    int num;  //存放当前结点的值
    int count; //当前值得个数
    int max; //最大数量
    List<Integer> arr = new ArrayList<>();
    public int[] findMode(TreeNode root) {
       inorderTraver(root);
       int[] result =new int [arr.size()];
       for(int i =0 ;i<arr.size();i++){
           result[i]=arr.get(i);
       }
       return result;

    }
    public void  inorderTraver(TreeNode root){
        if(root == null){
            return;
        }
         inorderTraver(root.left);
         int val =root.val;
         if(val==num){     //当前结点的值等于当前值 count++
             count++;
         }else{
             num=val;  //  不等于当前count值，讲count恢复为1
             count=1;
         }
        if(count==max){   // 当前值得个数==最大值 讲当前节点值加入数组
             arr.add(val);
        }else if(count>max){  //当前值得个数大于最大值,清空arr,更新max,并加入数组
             arr.clear();
               max = count;
               arr.add(val);
        }
      inorderTraver(root.right);
    }
}