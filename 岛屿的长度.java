
给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。

网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。

岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。

 

示例 :

输入:
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

class Solution {     
    public int islandPerimeter(int[][] grid) {
        int perimeter=0;
        int m =grid.length;
        int n = grid[0].length;
      for(int i = 0;i < grid.length;i++){
          for(int j = 0;j<grid[0].length;j++){
              if(grid[i][j] == 1){
                  perimeter+=dfs(grid,i,j,m,n);
              }
          }
      }
      return perimeter;
    }
    public int dfs(int[][] grid ,int x ,int y,int m,int n){
        if(x<0||x>=m||y<0||y>=n||grid[x][y]==0){
            return 1;
        }
        if(grid[x][y] ==2){
            return 0;
        }
        grid[x][y]=2;
        int sum=0;
        sum=sum+dfs(grid,x+1,y,m,n)+dfs(grid,x-1,y,m,n)+dfs(grid,x,y-1,m,n)+dfs(grid,x,y+1,m,n);
        return sum;
    }
}