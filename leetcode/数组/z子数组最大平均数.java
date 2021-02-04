给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。



示例：

输入：[1,12,-5,-6,50,3], k = 4
输出：12.75
解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75


/*
现将前k-1个元素的和记为最大值，从第k个元素开始，将第k个元素加入窗口，再将左端窗口移除，
每次比较当前窗口的最大值，直到数组遍历完成
*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double max = 0.0;
    double sum = 0.0;

    for(int i = 0;i < k ;i++){
        sum+=nums[i];
    }
     max = sum;
    for(int j = k;j < nums.length;j++){
        sum = sum+nums[j] - nums[j - k];
        max = Math.max(max,sum) ;
    }
    return max/k;
    }
}