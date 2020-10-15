给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。

岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。

此外，你可以假设该网格的四条边均被水包围。

 

示例 1：

输入：grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
输出：1
示例 2：

输入：grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
输出：3


class Solution {
    public int numIslands(char[][] grid) {
     int num=0;
     int row = grid.length;
     int col =grid[0].length;
     for(int i = 0;i < row;i++){
         for(int j =0;j < col;j++){
             if(grid[i][j]=='1'){
              num++;
              dfs(grid,i,j);
             } 
         }
     }
     return num;
}
     public void dfs(char[][] grid,int i,int j){
         int row = grid.length;
         int col =grid[0].length;
         if(i<0||j<0||i>=row||j>=col||grid[i][j]=='0'){ //判断边界
             return;
         }
         grid[i][j]='0';//回溯
         dfs(grid,i+1,j);
         dfs(grid,i-1,j); 
         dfs(grid,i,j+1);
         dfs(grid,i,j-1);
     }
   
}