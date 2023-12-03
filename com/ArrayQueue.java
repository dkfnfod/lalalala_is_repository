package com;

public class ArrayQueue {
    public String[] items;
    public int n = 0;
    public int head = 0;//队头下标
    public int tail = 0;//队尾下标

    public ArrayQueue(int value){
        items = new String[value];
        n = value;
    }
    public boolean enqueue(String item){
        if (tail == n)return false;
        items[tail] = item;
        ++tail;
        return true;
    }
    public String dequeue(){
        if (head == tail) return null;
        String ret = items[head];
        ++head;
        return ret;
    }
}
