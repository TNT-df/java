用以太网线缆将 n 台计算机连接成一个网络，计算机的编号从 0 到 n-1。线缆用 connections 表示，其中 connections[i] = [a, b] 连接了计算机 a 和 b。

网络中的任何一台计算机都可以通过网络直接或者间接访问同一个网络中其他任意一台计算机。

给你这个计算机网络的初始布线 connections，你可以拔开任意两台直连计算机之间的线缆，并用它连接一对未直连的计算机。请你计算并返回使所有计算机都连通所需的最少操作次数。如果不可能，则返回 -1 。 

 输入：n = 4, connections = [[0,1],[0,2],[1,2]]
输出：1
解释：拔下计算机 1 和 2 之间的线缆，并将它插到计算机 1 和 3 上。


/*
  并查集
   n个计算机连接需要n-1条网线，
   先讲每个计算机归为一个连通分量n，将有连接计算机进行合并则连通分量的个数-1，
    当两个主机在一个连通分量中，则存在一条冗余边，直到遍历结束，
	当冗余边的个数小于 连通分量的个数-1时则不能将此网络进行连通，
	若只存在一个连通分量时，则计算机在一个网络里不需要操作
	若冗余边的条数大于连通分量的个数-1时，则只需要连通分量-1次操作即可
	例如 存在两个连通分量1 和2，只需要一条边即可进行连接
*/
class Solution {
    public int makeConnected(int n, int[][] connections) {
     int parent[] = new int[n];

     for(int i = 0 ;i < n;i++ ){
       parent[i] = i;
     }   
    int count = 0;//统计冗余边
    int temp =n;//连通分量的个数
    for(int i = 0;i < connections.length; i ++){
         int a = connections[i][0];
         int b = connections[i][1];
         if(find(parent,a)!=find(parent,b)){
             union(parent,a,b);
             temp--;
         }else{
             count++;
         }
     }
     if(temp == 1){
         return 0;
     }
     return count>=temp-1?temp-1:-1;//判断输出条件

  }

   public void union(int p[],int x,int y){
          p[find(p,x)]=find(p,y);
   }
   public int find(int p[], int x){
       if(p[x] != x){
           x = find(p,p[x]);
       }
       return x;
   }
}