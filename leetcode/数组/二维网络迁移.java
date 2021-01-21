给你一个 m 行 n列的二维网格grid?和一个整数k。你需要将grid?迁移?k?次。

每次「迁移」操作将会引发下述活动：

位于 grid[i][j]的元素将会移动到grid[i][j + 1]。
位于grid[i][n?- 1] 的元素将会移动到grid[i + 1][0]。
位于 grid[m?- 1][n - 1]?的元素将会移动到?grid[0][0]。
请你返回k 次迁移操作后最终得到的 二维网格。



示例 1：



输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
输出：[[9,1,2],[3,4,5],[6,7,8]]
示例 2：



输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
示例 3：

输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
输出：[[1,2,3],[4,5,6],[7,8,9]]

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
       while( k> 0){
           int ret[][] = new int[grid.length][grid[0].length];
          for(int i = 0;i < grid.length ;i ++){
              for(int j = 0; j < grid[0].length - 1;j++){
                  ret[i][j + 1] = grid[i][j];
              }
          }
          for(int i = 0;i < grid.length -1 ;i ++){
              ret[i+1][0] = grid[i][grid[0].length - 1];
          }
         ret[0][0] = grid[grid.length-1][grid[0].length - 1];
         grid = ret;
         k--;
       }
    List<List<Integer>> list = new ArrayList<>();
    for(int[] m : grid){
        List<Integer> list1 = new ArrayList<>();
        list.add(list1);
        for(int tmep : m)
            list1.add(tmep);      
    }
    return list; 
    }
}