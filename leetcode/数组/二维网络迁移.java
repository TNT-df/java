����һ�� m �� n�еĶ�ά����grid?��һ������k������Ҫ��grid?Ǩ��?k?�Ρ�

ÿ�Ρ�Ǩ�ơ��������������������

λ�� grid[i][j]��Ԫ�ؽ����ƶ���grid[i][j + 1]��
λ��grid[i][n?- 1] ��Ԫ�ؽ����ƶ���grid[i + 1][0]��
λ�� grid[m?- 1][n - 1]?��Ԫ�ؽ����ƶ���?grid[0][0]��
���㷵��k ��Ǩ�Ʋ��������յõ��� ��ά����



ʾ�� 1��



���룺grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
�����[[9,1,2],[3,4,5],[6,7,8]]
ʾ�� 2��



���룺grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
�����[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
ʾ�� 3��

���룺grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
�����[[1,2,3],[4,5,6],[7,8,9]]

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