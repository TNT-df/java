���� n ���������ҳ�ƽ��������ҳ���Ϊ k �����������飬����������ƽ������



ʾ����

���룺[1,12,-5,-6,50,3], k = 4
�����12.75
���ͣ����ƽ���� (12-5-6+50)/4 = 51/4 = 12.75


/*
�ֽ�ǰk-1��Ԫ�صĺͼ�Ϊ���ֵ���ӵ�k��Ԫ�ؿ�ʼ������k��Ԫ�ؼ��봰�ڣ��ٽ���˴����Ƴ���
ÿ�αȽϵ�ǰ���ڵ����ֵ��ֱ������������
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