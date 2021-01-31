有一堆石头，每块石头的重量都是正整数。

每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：

如果 x == y，那么两块石头都会被完全粉碎；
如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。

 

示例：

输入：[2,7,4,1,8,1]
输出：1
解释：
先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。

//堆排序每次取出堆头两个元素进行作差，再将元素放入堆中，直到堆的元素为1个即为所求
class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer o1 ,Integer o2){
                  return o2 -o1;
            }     
        });
      for(int i = 0;i < stones.length ;i++)
      pq.offer(stones[i]);
       
      while(pq.size()>1){
          int a = pq.poll();
          int b = pq.poll();
          pq.offer(Math.abs(a-b));
      }
      return pq.poll();
    }
}