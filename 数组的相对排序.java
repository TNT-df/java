�����������飬arr1 ��?arr2��

arr2�е�Ԫ�ظ�����ͬ
arr2 �е�ÿ��Ԫ�ض�������?arr1?��
�� arr1�е�Ԫ�ؽ�������ʹ arr1 ��������˳���?arr2?�е����˳����ͬ��δ��?arr2?�г��ֹ���Ԫ����Ҫ�����������?arr1?��ĩβ��


ʾ����

���룺arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
�����[2,2,2,1,4,3,3,9,6,7,19]


class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int max=0;
    for(int k:arr1){
      max=Math.max(k,max);  //temp���ٿռ����Ϊarr1�������+1
     }  
     int temp [] = new int[max+1];//temp���鱣��arr1�����ֳ��ֵĴ���
     
     for(int k:arr1)
     temp[k]++;      //arr1�г��ֵ�������temp��
     int res[] = new int[arr1.length];
     int index = 0;
   for(int k:arr2){ 
       for(int j =0;j<temp[k];j++){
           res[index++] = k;   //��temp[k]�е�k����������
        }                   
      temp[k]=0;
       }
  for (int x = 0; x <=max; ++x) {
         for (int i = 0; i < temp[x]; ++i) {
          res[index++]=x;   //��δ��arr2�г��ֵ�ֵ����������������飬����temp[i]���з���
      }
    }
   
    return res;
   }
}

 