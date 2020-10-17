给你一个整数数组 arr ，请你删除最小 5% 的数字和最大 5% 的数字后，剩余数字的平均值。

与 标准答案 误差在 10-5 的结果都被视为正确结果。

 

示例 1：

输入：arr = [1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3]
输出：2.00000
解释：删除数组中最大和最小的元素后，所有元素都等于 2，所以平均值为 2 。
class Solution {
    public double trimMean(int[] arr) {
    int len=arr.length;
     double max_len=len/20;
     double min_len=len/20;
     double sum =0.0;
     Arrays.sort(arr);
        for(int i=(int)min_len;i<=len-max_len-1;i++){
            sum+=arr[i];
          }
        int length=len-(int)max_len-(int)min_len;
        return sum/length;
    }
}