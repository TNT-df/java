����һ���������� nums �����������ҳ�����������ɵ����˻������������˻���

?
<<<<<<< HEAD
  
=======

>>>>>>> 7af9e9265c2dc76b3b1b2b99853287c060b7a6d4
ʾ�� 1��

���룺nums = [1,2,3]
�����6
ʾ�� 2��

���룺nums = [1,2,3,4]
�����24
ʾ�� 3��

���룺nums = [-1,-2,-3]
�����-6
//��ȫΪ������Ϊ����������������и���Ϊ1��2�����һ����
class Solution {
    public int maximumProduct(int[] nums) {
     Arrays.sort(nums);
     int len = nums.length;
     int k = nums[len-1]* nums[len -2] * nums[len -3];
     int y =nums[0]*nums[1]*nums[len -1];
     return Math.max(k,y);
    }
}