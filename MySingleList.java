

//火车类
public class MySingleList {
    // 链表中的节点数
    private int size;
    // 链表中的头节点
    private Node head;


    //在链表头部添加元素
    public void firstAdd(int data) {
        // 关注临界条件
        // 1.链表中有没有节点，判空
        // 2.链表中已经有节点了
        if (size == 0) {
            // 1. 先创建一个新节点存放 data 值
            Node node = new Node(data);
            // 2. 头节点变为新加入的节点
            head = node;
            size++;
        } else {
            // 1. 先创建一个新节点存放 data 值
            Node node = new Node(data);
            // 2. 将新节点与原来的第一个节点连接
            node.next = head;
            // 3. 将头节点变为新的节点
            head = node;
            size++;
        }
    }
    //在链表任意位置添加元素
    public void indexAdd(int index, int data) {
        // 边界条件：1. 链表是否为空 2. 索引是否合法 3. index 是否是第一个节点
        // 1. 链表是否为空
        if (size == 0) {
            System.err.println("链表为空！");
        } else if (index < 0 || index > size) { //2. 索引是否合法
            System.err.println("索引非法！");
        } else if (index == 0) {  // 3. index 是否是第一个节点
            firstAdd(data);
        } else {
            Node node = new Node(data);
            // 前驱节点,暂存 head 节点
            Node prev = head;
            // 遍历找到 index 的前驱节点
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            // 先将 index 位置的节点与插入的节点连接，index 位置的节点就是 prev.next
            node.next = prev.next;
            // 再将插入的节点与前驱节点连接
            prev.next = node;
            size++;
        }
    }
    //在链表尾部添加元素
    public void lastAdd(int data) {
        indexAdd(size,data);
        size++;
    }
    //删除链表元素
    // 索引是否合法
    private boolean rangeCheck(int index) {
        if (index < 0 || index >= size) {
            System.err.println("索引非法！");
            return false;
        }
        return true;
    }

    //删除第一个节点元素
    public void deleteFirst() {
        // 创建一个临时变量存放 head
        Node node = head;
        // 将头节点从第一个变为第二个
        head = head.next;
        // 将原来的第一个节点断开
        node.next = null;
        size--;
    }
    //删除任意位置 index 元素
    public void deleteIndex(int index) {
        // 边界条件：1. 链表为空 2. 索引合法 3. 删除的是第一个节点
        // 1. 链表为空
        if (size == 0) {
            System.out.println("链表为空！");
            // 2. 索引合法
        } else if (rangeCheck(index)) {
            // 3. 删除的是第一个节点
            if (index == 0) {
                deleteFirst();
            } else {
                // 暂存 head 节点
                Node prev = head;
                for (int i = 0; i < index; i++) {
                    prev = prev.next;
                }
                // prev 指向待删除节点的前驱节点
                // node 就是待删除节点
                Node node = prev.next;
                // 链接前驱节点和后继节点
                prev.next = node.next;
                // 将当前 node 节点的 next 置为空，断开待删除元素和链表的链接
                node.next = null;
                size--;
            }
        }
    }



}
