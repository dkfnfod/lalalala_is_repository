package com;

public class LinkkedList {
    //定义头节点空
    private Node head = null;
    //定义一个节点类
    public class Node{
        public int data;
        public Node next;
    }
    //查找data == valu的节点
    public Node find(int valu){
        Node p = head;
        while (p != null && p.data != valu){
            p = p.next;
        }
        return p;
    }
    //在节点b后插入节点x
    public void insert(Node b,Node x){
        if (b == null){  //在链表头部
            x.next = head;
            head = x;
        }else {
            x.next = b.next;
            b.next = x;
        }
    }
    //在未知前驱节点的情况下删除节点c
    public void remove(Node c){
        Node b = head;
        Node a = null;  //b的前驱节点
        while (b != null && b != c){
            a = b;
            b = b.next;
        }
        //找到了b = c,和b的前驱节点
        if (b != null){
            if (a == null){  //b是头节点
                b.next = head;
            }else {
                a.next = b.next;
            }
        }
    }
}
