package com;

public class LinkedQueue {
    //构造节点类
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //构造队列类
    public class Queue{
        public Node head;//头节点
        public Node tail;//尾节点
        public int N;//元素数量
        public Queue(){
            head = null;
            tail = null;
            N = 0;
        }
        //向队尾添加元素
        public void enqueue(int value){
            Node newnode = new Node(value);
            if (tail == null) {
                tail = newnode;
            }else {
                tail.next = newnode;
                tail = newnode;
            }
            N++;
        }
        //从队头删除元素
        public int dequeue(){
            int ret = 0;
            if (head != null){
                ret = head.data;
                head = head.next;
                N--;
            }
            return ret;
        }
    }

}
