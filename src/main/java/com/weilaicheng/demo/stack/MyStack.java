package com.weilaicheng.demo.stack;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/16
 *
 * @author xiangzhi.meng
 */
public class MyStack {

    int arr[];
    int size;
    int top;

    /**
     * 初始化栈大小
     *
     * @param size
     */
    public MyStack(int size) {
        this.size = 0;
        this.arr = new int[size];
        this.top = -1;
    }

    /**
     * 入栈
     *
     * @param data
     */
    public void push(int data) {
        this.arr[++top] = data;
        this.size++;
    }

    /**
     * 出栈
     *
     * @return
     */
    public int pop() {
        this.size--;
        return this.arr[top--];
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(5);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }


}
