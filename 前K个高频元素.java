给定一个非空的整数数组，返回其中出现频率前 k 高的元素。

 

示例 1:

输入: nums = [1,1,1,2,2,3], k = 2
输出: [1,2]
示例 2:

输入: nums = [1], k = 1
输出: [1]

//使用最小堆
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

     HashMap<Integer,Integer> map  = new HashMap<>();
     for(int temp:nums){
         if(map.containsKey(temp)){
             map.put(temp,map.get(temp)+1);
         }else{
             map.put(temp,1);
         }
     }
         PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
      for(Integer num : map.keySet()){
          if(pq.size()<k){
              pq.add(num);
          }else if(map.get(num)>map.get(pq.peek())){
              pq.remove();
              pq.add(num);
          }
          }
            ArrayList<Integer> arr= new ArrayList<>();
          while(!pq.isEmpty()){
              arr.add(pq.remove());
          }
          int[] a = new int[arr.size()];
          int i=0;
          for(Integer m:arr){
              a[i]=m;
              i++;
          }
return a;
    }
}