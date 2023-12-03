package com;

public class LinkedStack {
    public static class Node<V>{
        public V value;
        public Node<V> next;
        public Node(V v){
            value=v;
            next=null;
        }
    }
    public static class MyStack<V>{
        private Node<V> head;
        private int size;
        public MyStack(){
            head=null;
            size=0;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public int size(){
            return size;
        }
        public void push(V value){
            Node<V> cur=new Node<>(value);//因为要传入实参所以要实例化对象
            if(head==null){
                head=cur;
            }else{
                cur.next=head;
                head=cur;
            }
            size++;
        }

        public V Pop(){
            V ans=null;
            if(head!=null){
                ans=head.value;
                head=head.next;
                size--;
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        MyStack<Integer> myStack=new MyStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        int ans1=myStack.Pop();
        int ans2=myStack.Pop();
        int ans3=myStack.Pop();
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
