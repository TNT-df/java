题目描述
有—棵无穷大的满二叉树，其结点按根结点一层—层地从左往右依次编号，根结点编号为1。现在有两个结点a，b。请设计—个算法，求出a和b点的最近公共祖先的编号。
给定两个int a,b。为给定结点的编号。请返回a和b的最近公共祖先的编号。
注意这里结点本身也可认为是其祖先。
测试样例:
2,3

import java.util.*;

public class LCA {
    public int getLCA(int a, int b) {
        // write code here
		
		//当a是b的祖先返回a
         if(a == b || a == b/2) return a;
		 //b是a的祖先返回b
         if( b == a/2) return b;
		 //迭代找祖先
         while( a != b){
             if(a >b) a=a/2;
             else b =b/2;
         }
        return a;
    }
}