给定四个包含整数的数组列表?A , B , C , D ,计算有多少个元组 (i, j, k, l)?，使得?A[i] + B[j] + C[k] + D[l] = 0。

为了使问题简单化，所有的 A, B, C, D 具有相同的长度?N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过?231 - 1 。

例如:

输入:
A = [ 1, 2]
B = [-2,-1]
C = [-1, 2]
D = [ 0, 2]

输出:
2

解释:
两个元组如下:
1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0

/*题解
用哈希表存储A+B的各种取值，然后用哈希表中的值去比较 
CD中的各种取值，若有相同则值加1.
A + B + C + D = 0  ；A + B = -C - D;
*/
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int ans = 0;
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i = 0;i < A.length;i++){
     for(int j = 0;j < B.length;j++){
          int sum = A[i] +B[j];  //记录A和B的取值
          map.put(sum,map.getOrDefault(sum,0)+1); //若哈希表中有sum 则value+1；没有则加入表中。
         }
       }
    for(int i = 0;i < C.length;i++){
        for(int j = 0;j < D.length;j++){
            int sum = -C[i]-D[j];
            if(map.containsKey(sum)){ //在表中查找 C和 D的结果
               ans+=map.get(sum); 
            }
        }
    }
   return ans;
    }
}