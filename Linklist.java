public class Linklist {
    public Node head;
    public void creatlinkedlist(){
       //创建对象
       Node node1 = new Node(1);
       Node node2 = new Node(2);
       Node node3 = new Node(3);
       Node node4 = new Node(4);
       Node node5 = new Node(5);
       //创建链表
       head = node1;
       node1.next = node2;
       node2.next = node3;
       node3.next = node4;
       node4.next = node5;
   }
   //头插法
    public void addFist(int date){
       Node node = new Node(date);
       node.next = head;
       head = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = head;
        while (cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //尾插法,需判断head是否为空
    public void addLast(int data){
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur = head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

}
class Node{
    // 存储具体元素
    int data;
    // 存储下一个节点的地址
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}



