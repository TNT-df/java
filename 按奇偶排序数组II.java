����һ���Ǹ���������A�� A ��һ��������������һ��������ż����

��������������Ա㵱A[i] Ϊ����ʱ��iҲ����������A[i]Ϊż��ʱ�� i Ҳ��ż����

����Է����κ���������������������Ϊ�𰸡�


ʾ����

���룺[4,2,5,7]
�����[4,5,2,7]
���ͣ�[4,7,2,5]��[2,5,4,7]��[2,7,4,5] Ҳ�ᱻ����


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