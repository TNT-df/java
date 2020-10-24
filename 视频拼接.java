你将会获得一系列视频片段，这些片段来自于一项持续时长为 T 秒的体育赛事。这些片段可能有所重叠，也可能长度不一。

视频片段 clips[i] 都用区间进行表示：开始于 clips[i][0] 并于 clips[i][1] 结束。我们甚至可以对这些片段自由地再剪辑，例如片段 [0, 7] 可以剪切成 [0, 1] + [1, 3] + [3, 7] 三部分。

我们需要将这些片段进行再剪辑，并将剪辑后的内容拼接成覆盖整个运动过程的片段（[0, T]）。返回所需片段的最小数目，如果无法完成该任务，则返回 -1 。

 

示例 1：

输入：clips = [[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]], T = 10
输出：3
解释：
我们选中 [0,2], [8,10], [1,9] 这三个片段。
然后，按下面的方案重制比赛片段：
将 [1,9] 再剪辑为 [1,2] + [2,8] + [8,9] 。
现在我们手上有 [0,2] + [2,8] + [8,10]，而这些涵盖了整场比赛 [0, 10]。

//贪心
class Solution {
    public int videoStitching(int[][] clips, int T) {
     int end=0; //上一个的结束位置(本次的起始位置)
     int pre=0; //当前的最大结束位置
     int count = 0;
     for(int i = 0;i < T;i ++){
         for(int j = 0 ;j < clips.length;j ++){
            if(clips[j][0] <= end){  //当前的起始位置小于上次的结束位置
               pre = Math.max(pre,clips[j][1]);  //更新最大结束位置
            }
         }
         count++;
         if(pre >= T){
             return count;
         }
         end = pre;
     }
     return -1;
    }
}