给定两个数组，编写一个函数来计算它们的交集。

 

示例 1：

输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2]
示例 2：

输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出：[9,4]

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<>();
    for(Integer temp:nums1){
        set1.add(temp);
    }
    HashSet<Integer> set2 =new HashSet<>();
    for(Integer temp:nums2){
        set2.add(temp);
    }
     if (set1.size() < set2.size()) return result(set1, set2);
    else return result(set2, set1);
    }
   public int[] result(HashSet<Integer> set1,HashSet<Integer> set2){
       int[] res =new int[set1.size()];
       int index = 0;
       for(Integer s:set1){
            if (set2.contains(s)) res[index++] = s;
       }
       return Arrays.copyOf(res,index);
   }
}