�����ĸ����������������б�?A , B , C , D ,�����ж��ٸ�Ԫ�� (i, j, k, l)?��ʹ��?A[i] + B[j] + C[k] + D[l] = 0��

Ϊ��ʹ����򵥻������е� A, B, C, D ������ͬ�ĳ���?N���� 0 �� N �� 500 �����������ķ�Χ�� -228 �� 228 - 1 ֮�䣬���ս�����ᳬ��?231 - 1 ��

����:

����:
A = [ 1, 2]
B = [-2,-1]
C = [-1, 2]
D = [ 0, 2]

���:
2

����:
����Ԫ������:
1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0

/*���
�ù�ϣ��洢A+B�ĸ���ȡֵ��Ȼ���ù�ϣ���е�ֵȥ�Ƚ� 
CD�еĸ���ȡֵ��������ͬ��ֵ��1.
A + B + C + D = 0  ��A + B = -C - D;
*/
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int ans = 0;
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i = 0;i < A.length;i++){
     for(int j = 0;j < B.length;j++){
          int sum = A[i] +B[j];  //��¼A��B��ȡֵ
          map.put(sum,map.getOrDefault(sum,0)+1); //����ϣ������sum ��value+1��û���������С�
         }
       }
    for(int i = 0;i < C.length;i++){
        for(int j = 0;j < D.length;j++){
            int sum = -C[i]-D[j];
            if(map.containsKey(sum)){ //�ڱ��в��� C�� D�Ľ��
               ans+=map.get(sum); 
            }
        }
    }
   return ans;
    }
}