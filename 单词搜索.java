
给定一个二维网格和一个单词，找出该单词是否存在于网格中。

单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

示例:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

给定 word = "ABCCED", 返回 true
给定 word = "SEE", 返回 true
给定 word = "ABCB", 返回 false
 

class Solution {
    public boolean exist(char[][] board, String word) {
         for(int i=0;i<board.length;i++){
             for(int j=0 ;j<board[i].length;j++){
                 if(board[i][j]==word.charAt(0)){
                     if(dfs(board,i,j,word,0)){
                         return true;
                     }

                 }
             }
         }
        return false; 
    }
    public boolean dfs(char[][] board,int i,int j,String s,int k){
   if(k==s.length()){  //字符遍历完后返回true
       return true;
   }
   
   if(i<0||j<0||i>=board.length||j>=board[i].length){  //判断边界 
       return false;
   }
   if(board[i][j]!=s.charAt(k)){   
       return false;
   }
   char t=board[i][j];
   board[i][j]=' ';
   if(dfs(board,i+1,j,s,k+1)) return true;
    if(dfs(board,i-1,j,s,k+1)) return true;
    if(dfs(board,i,j+1,s,k+1)) return true;
    if(dfs(board,i,j-1,s,k+1)) return true;
    board[i][j]=t;    //回溯
    return false;

    }
}  