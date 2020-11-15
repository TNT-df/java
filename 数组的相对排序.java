给你两个数组，arr1 和?arr2，

arr2中的元素各不相同
arr2 中的每个元素都出现在?arr1?中
对 arr1中的元素进行排序，使 arr1 中项的相对顺序和?arr2?中的相对顺序相同。未在?arr2?中出现过的元素需要按照升序放在?arr1?的末尾。


示例：

输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
输出：[2,2,2,1,4,3,3,9,6,7,19]


class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int max=0;
    for(int k:arr1){
      max=Math.max(k,max);  //temp开辟空间最大为arr1中最大数+1
     }  
     int temp [] = new int[max+1];//temp数组保存arr1个数字出现的次数
     
     for(int k:arr1)
     temp[k]++;      //arr1中出现的数放入temp中
     int res[] = new int[arr1.length];
     int index = 0;
   for(int k:arr2){ 
       for(int j =0;j<temp[k];j++){
           res[index++] = k;   //将temp[k]中的k放入结果数组
        }                   
      temp[k]=0;
       }
  for (int x = 0; x <=max; ++x) {
         for (int i = 0; i < temp[x]; ++i) {
          res[index++]=x;   //将未在arr2中出现的值，按升序放入结果数组，根据temp[i]进行放置
      }
    }
   
    return res;
   }
}

 