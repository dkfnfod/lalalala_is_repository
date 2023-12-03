package com;

//顺序栈
public class ArrayStack {
    private String[] items;
    private int count;//元素的个数
    private int n;//栈的大小

    public ArrayStack(int n){
        this.items = new String[n];
        this.count = 0;
        this.n = 0;
    }
    public boolean push(String item){
        if (count == n) return false;
        items[count] = item;
        ++count;
        return true;
    }
    public String pop(){
        if (count == 0) return null;
        String tmp = items[count - 1];
        --count;
        return tmp;
    }
}
