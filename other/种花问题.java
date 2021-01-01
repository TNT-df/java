假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。

给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数?n?。能否在不打破种植规则的情况下种入?n?朵花？能则返回True，不能则返回False。

示例 1:

输入: flowerbed = [1,0,0,0,1], n = 1
输出: True
示例 2:

输入: flowerbed = [1,0,0,0,1], n = 2
输出: False
/*
1.若当前位置为1，则向后跳两格
2.若当前位置为0，下一位置是0，若为0则n--，向后跳两格
3.若当前位置为0，下一位置为1，则向后跳三格参考1
*/
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
  for(int i = 0;i<flowerbed.length&&n>0;){
      if(flowerbed[i]==1){
          i +=2;
      }else if(i==flowerbed.lenggth-1||flowerbed[i+1]==0){
          n--;
          i++;
      }else{
          i +=3;
      }
  }
  return n<=0;
    }
}