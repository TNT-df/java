����һ�����ظ�Ԫ�ص������������� nums ��

���� ǡ�ø����������������� �� ��С���� ���䷶Χ�б�Ҳ����˵��nums ��ÿ��Ԫ�ض�ǡ�ñ�ĳ�����䷶Χ�����ǣ����Ҳ���������ĳ����Χ�������� nums ������ x ��

�б��е�ÿ�����䷶Χ [a,b] Ӧ�ð����¸�ʽ�����

"a->b" ����� a != b
"a" ����� a == b
?

ʾ�� 1��

���룺nums = [0,1,2,4,5,7]
�����["0->2","4->5","7"]
���ͣ����䷶Χ�ǣ�
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
ʾ�� 2��

���룺nums = [0,2,3,4,6,8,9]
�����["0","2->4","6","8->9"]
���ͣ����䷶Χ�ǣ�
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
ʾ�� 3��

���룺nums = []
�����[]
ʾ�� 4��

���룺nums = [-1]
�����["-1"]
ʾ�� 5��

���룺nums = [0]
�����["0"]


class Solution {
    public List<String> summaryRanges(int[] nums) {
   List<String> list = new ArrayList<>();
   if(nums.length == 0)
       return  list;
    StringBuilder sb = new StringBuilder();
    for(int i=0,j=i+1;j<nums.length;i++,j++){
        if(nums[j] -1 != nums[i]){
            sb.append(nums[i]);
            list.add(sb.toString());
            sb = new StringBuilder();
        }else{
            if(sb.length() == 0){
                sb.append(nums[i]+"->");
            }
        }
    }
    list.add(sb.append(nums[nums.length-1]).toString());
    return list;
   
    }
}