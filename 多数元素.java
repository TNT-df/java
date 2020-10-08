给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

 

示例 1:

输入: [3,2,3]
输出: 3
示例 2:

输入: [2,2,1,1,1,2,2]
输出: 


class Solution {
    public int majorityElement(int[] nums) {
   HashMap<Integer,Integer> map = new HashMap<>();
   for(int temp : nums){
       if(map.containsKey(temp)){
          map.put(temp,map.get(temp)+1);
       }else{
         map.put(temp,1);
       }
   }
   Map.Entry<Integer,Integer> Entry = null;
   for(Map.Entry<Integer,Integer> entry:map.entrySet()){
       if(Entry ==null||entry.getValue()>Entry.getValue()){
           Entry = entry;
       }
   }
   return Entry.getKey();
    }
}