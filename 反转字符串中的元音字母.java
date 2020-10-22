编写一个函数，以字符串作为输入，反转该字符串中的元音字母。

 

示例 1：

输入："hello"
输出："holle"
示例 2：

输入："leetcode"
输出："leotcede"
 


class Solution {
    public String reverseVowels(String s) {
    char[] arr= s.toCharArray();
    int left = 0;
    int right = arr.length-1;
    while(left < right){
        while(left < arr.length &&!isVowel(arr[left])){
            left++;
        }
        while(right > 0 && !isVowel(arr[right])){
            right--;
        }
        if(left >= right){
            break;
        }
        swap(arr,left,right);
        left ++;
        right--;
     }
     return new String(arr);
    }
    public void swap(char a[],int left,int right){
        char temp=a[left];
        a[left]=a[right];
        a[right]=temp;
    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
              ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}