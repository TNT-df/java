给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。

返回滑动窗口中的最大值。

 

示例 1：

输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
输出：[3,3,5,5,6,7]
解释：
滑动窗口的位置                最大值
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
示例 2：

输入：nums = [1], k = 1
输出：[1]
示例 3：

输入：nums = [1,-1], k = 1
输出：[1,-1]
示例 4：

输入：nums = [9,11], k = 2
输出：[11]
示例 5：

输入：nums = [4,-2], k = 2
输出：[4]
 



class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    List<Integer> list = new ArrayList<>();
    int q [] = new int[nums.length]; //数组模拟队列，存放元素下标
    int hh =0 ,tt=-1;
     for(int i = 0;i < nums.length;i ++){
         //判断对头是否超出滑动窗口，保证窗口中只有k个数
       if( hh <= tt && i-k +1 > q[hh]) hh ++;
       while(hh <= tt && nums[q[tt]]<=nums[i]) tt--; //判断队尾元素比当前元素小，出队
       q[++tt] = i;//将本轮下标加入队列中
       if( i+1 >= k) list.add(nums[q[hh]]); //窗口内最大元素为队头元素
      }
        int[] re =new int[nums.length-k+1];
        for(int i = 0;i <list.size();i++){
            re[i] = list.get(i);
        }
        return re;
    }
}