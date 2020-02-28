package com.weilaicheng.demo.linked;

import java.math.BigDecimal;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/15
 *
 * @author xiangzhi.meng
 */
public class MyLinked {

    //头指针
    private Node head;

    //尾指针
    private Node last;

    //链表长度
    private int size;

    public MyLinked(int size) {
        this.size = size;
    }

    /**
     * 链表节点
     */
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * 根据链表第index的值获取当前链表Node
     *
     * @param index
     * @return
     * @throws Exception
     */
    public Node get(int index) throws Exception {
        if (index < 0 || index > this.size) {
            throw new Exception("链表长度超出范围");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }


    /**
     * 向链表中插入元素
     *
     * @param data
     * @param index
     */
    public void insert(int data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("超出链表范围");
        }
        Node insertNode = new Node(data);
        // -->空链表 插入头部
        if (size == 0) {
            head = insertNode;
            last = insertNode;
        } else if (index == 0) {
            //头插
            insertNode.next = head;
            head = insertNode;
        } else if (index == size) {
            //尾插
            last.next = insertNode;
            last = insertNode;
        } else {
            //中间插
            Node node = get(index - 1);
            insertNode.next = node.next;
            node.next = insertNode;
        }
        size++;
    }

    /**
     * 删除链表中的元素 ---> 1.删除头结点 2.删除尾节点 3.删除中间节点
     *
     * @param index
     * @return
     * @throws Exception
     */
    public Node delete(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("超出链表范围");
        }
        Node removeNode = null;
        //删除头部
        if (index == 0) {
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            //删除尾部
            Node node = get(index - 1);
            removeNode = node.next;
            node.next = null;
            last = node;
        } else {
            //删除中间
            Node node = get(index - 1);
            removeNode = node.next;
            node.next = removeNode.next;
        }
        size--;
        return removeNode;
    }

    /**
     * 输出链表
     */
    public void output() {
        Node head = this.head;

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new BigDecimal(0.1));
        double a = 0.01;

        if(a == 0.01){
            System.out.println(true);
        }

    }

}
