����������?0?��?1?��ɵ����� A�����Ƕ���?N_i����?A[0] ��?A[i]?�ĵ� i?�������鱻����Ϊһ�������������������Чλ�������Чλ����

���ز���ֵ�б�?answer��ֻ�е�?N_i?���Ա� 5?����ʱ����?answer[i] Ϊ?true������Ϊ false��

?

ʾ�� 1��

���룺[0,1,1]
�����[true,false,false]
���ͣ�
��������Ϊ 0, 01, 011��Ҳ����ʮ�����е� 0, 1, 3 ��ֻ�е�һ�������Ա� 5 ��������� answer[0] Ϊ�档
ʾ�� 2��

���룺[1,1,1]
�����[false,false,false]
ʾ�� 3��

���룺[0,1,1,1,1,1]
�����[true,false,false,false,true,false]
ʾ��4��

���룺[1,1,1,0,1]
�����[false,false,false,false,false]

// ��λΪ0 ��5��Ϊtrue

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
       List<Boolean> list = new ArrayList<>();
       int sum = 0;
       for(int i = 0;i<A.length;i++){
           sum  = sum * 2 + A[i];
            sum %=10;
            list.add(sum == 5||sum == 0);
            }
       return list;
    }
}