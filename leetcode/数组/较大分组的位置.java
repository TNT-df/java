��һ����Сд��ĸ���ɵ��ַ��� s �У�������һЩ��������ͬ�ַ������ɵķ��顣

���磬���ַ��� s = "abbxxxxzyy"?�У��ͺ��� "a", "bb", "xxxx", "z" �� "yy" ������һЩ���顣

������������� [start, end] ��ʾ������ start �� end �ֱ��ʾ�÷������ʼ����ֹλ�õ��±ꡣ�����е� "xxxx" �����������ʾΪ [3,6] ��

���ǳ����а������ڻ�������������ַ��ķ���Ϊ �ϴ���� ��

�ҵ�ÿһ�� �ϴ���� �����䣬����ʼλ���±����˳������󣬷��ؽ����

?

ʾ��?1��

���룺s = "abbxxxxzzy"
�����[[3,6]]
���ͣ�"xxxx" ��һ����ʼ�� 3 ����ֹ�� 6 �Ľϴ���顣
ʾ�� 2��

���룺s = "abc"
�����[]
���ͣ�"a","b" �� "c" �����Ƿ���Ҫ��Ľϴ���顣
ʾ�� 3��

���룺s = "abcdddeeeeaabbbcd"
�����[[3,5],[6,9],[12,14]]
���ͣ��ϴ����Ϊ "ddd", "eeee" �� "bbb"
ʾ�� 4��

���룺s = "aba"
�����[]


class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int num =1;
       for(int i = 0;i < s.length();){
           int count = 0;
        while(i + count<s.length()&&s.charAt(i)==s.charAt(i+count)){
            count++;
        }
        if(count>=3){
            list.add(Arrays.asList(i,i+count-1));
        }
        i += count;
    }
    return list;
}
}