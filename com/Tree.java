package com;

public class Tree {

    static class  Node{
        private  Integer data;
        private Node left,right;

        public Node(Integer data) {
            this.data = data;
        }
    }
    //前序遍历
    public static void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    //中序遍历
    public static void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    //后序遍历
    public static void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preOrder(root);
        System.out.println("====先序遍历====");
        inOrder(root);
        System.out.println("====中序遍历====");
        postOrder(root);
        System.out.println("====后续遍历====");

    }
}
