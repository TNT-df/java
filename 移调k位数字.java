����һ�����ַ�����ʾ�ķǸ�����?num���Ƴ�������е� k λ���֣�ʹ��ʣ�µ�������С��

ע��:

num �ĳ���С�� 10002 �ҡ� k��
num ��������κ�ǰ���㡣
ʾ�� 1 :

����: num = "1432219", k = 3
���: "1219"
����: �Ƴ����������� 4, 3, �� 2 �γ�һ���µ���С������ 1219��
ʾ�� 2 :

����: num = "10200", k = 1
���: "200"
����: �Ƶ���λ�� 1 ʣ�µ�����Ϊ 200. ע������������κ�ǰ���㡣
ʾ�� 3 :

����: num = "10", k = 2
���: "0"
����: ��ԭ�����Ƴ����е����֣�ʣ��Ϊ�վ���0��

//����
class Solution {
    public String removeKdigits(String num, int k) {
    if(num == " "|| k >= num.length())
      return "0";
    char [] ch = num.toCharArray();
    Stack<Character> stack = new Stack<>();
    for(char c:ch){  //���������е�ÿһ��Ԫ��
        while(!stack.isEmpty()&&k>0&stack.peek()>c){  //��ǰջ��Ϊ�գ�Ҫ�Ƴ������ĸ�����Ϊ0��ջ��Ԫ�ش��ڵ�ǰԪ�ؽ����Ԫ���Ƴ�
            stack.pop();
            k--;
        }
        if(stack.isEmpty()&&c=='0') continue;       //ջΪ�գ���ǰ�ַ�Ϊ'0'��������ѭ��
        stack.push(c);
    }
   while(k>0){                               //�����������k��Ϊ0��ջ��k��Ԫ���Ƴ�
       stack.pop();
       k--;
   }
   if(stack.isEmpty())                       //���ջΪ�շ���'0';
   return "0";
   StringBuffer sb = new StringBuffer();
   while(!stack.isEmpty()){
       sb.append(stack.pop());       
   }
  
   return sb.reverse().toString(); //�������ջ��Ԫ��
    }
}