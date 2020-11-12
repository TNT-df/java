给定一个非负整数数组A， A 中一半整数是奇数，一半整数是偶数。

对数组进行排序，以便当A[i] 为奇数时，i也是奇数；当A[i]为偶数时， i 也是偶数。

你可以返回任何满足上述条件的数组作为答案。


示例：

输入：[4,2,5,7]
输出：[4,5,2,7]
解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受


class Solution {
    public int[] sortArrayByParityII(int[] A) { 
        int[] res = new int[A.length]; 
        int odd =1 ;
        int even=0 ;
        for(int i =0;i<A.length;i++){
           if(A[i]%2==0){
               res[even] = A[i];
               even+=2;
            }
            if(A[i]%2!=0)
            {
               res[odd]= A[i];
                odd=odd+2;
           }
        }
       return res;
    }
}