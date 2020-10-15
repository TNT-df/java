package com.df.Stack;

public class ArrayStack {
    public int top = -1;
    public int[] maxsize;
    public int maxSize;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.maxsize = new int[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("栈满，无法添加数据");
            return;
        } else {
            top++;
            maxsize[top] = val;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空,无法出栈");
        }
        int temp = maxsize[top];
        top--;
        return temp;
    }

    public void showStack() {
        if(isEmpty()){
            System.out.println("栈为空");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(maxsize[i]+"  ");
        }
    }

    public int peek() {
        return maxsize[top];
    }

}
