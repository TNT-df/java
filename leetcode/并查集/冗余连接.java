在本问题中, 树指的是一个连通且无环的无向图。

输入一个图，该图由一个有着N个节点 (节点值不重复1, 2, ..., N) 的树及一条附加的边构成。附加的边的两个顶点包含在1到N中间，这条附加的边不属于树中已存在的边。

结果图是一个以边组成的二维数组。每一个边的元素是一对[u, v]?，满足?u < v，表示连接顶点u?和v的无向图的边。

返回一条可以删去的边，使得结果图是一个有着N个节点的树。如果有多个答案，则返回二维数组中最后出现的边。答案边?[u, v] 应满足相同的格式?u < v。

示例 1：

输入: [[1,2], [1,3], [2,3]]
输出: [2,3]
解释: 给定的无向图为:
  1
 / \
2 - 3
示例 2：

输入: [[1,2], [2,3], [3,4], [1,4], [1,5]]
输出: [1,4]
解释: 给定的无向图为:
5 - 1 - 2
    |   |
    4 - 3

/*
n个顶点的树有n-1条边，在无向图中n个顶点n条边一定有环。
~初始时，每个节点都属于不同的连通分量。遍历每一条边，
判断这条边连接的两个顶点是否属于相同的连通分量。
~如果两个顶点属于不同的连通分量，则说明在遍历到当前的边之前，
这两个顶点之间不连通，因此当前的边不会导致环出现，合并这两
个顶点的连通分量。
~如果两个顶点属于相同的连通分量，
则说明在遍历到当前的边之前，
这两个顶点之间已经连通，因此当前的边导致环出现，为附加的边，将当前的边作为答案返回。


*/
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] p = new int[edges.length+1];
        for(int i =1;i<edges.length+1;i++){
            p[i] = i;
        }
       for(int i =0;i<edges.length;i++){
		   //判断是否在同一个连通分量
          if(find(p,edges[i][0])!=find(p,edges[i][1])){
              union(p,edges[i][0],edges[i][1]);
          }else{
              return edges[i];
          }
       }
       return null;
    }
    public void union(int p[],int x,int y){
         p [find(p,x)]= find(p,y);
    }
    public int find(int p[],int x){
        if(p[x]!=x){
            x = find(p,p[x]);
        }
        return x;
    }
}