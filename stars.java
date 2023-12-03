public class  stars{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
    }
}
class Cat {
    public void jump() {
        System.out.println("这个猫在跳！！！");
    }
    public void run() {
        jump();        // 在run方法中用this.方法名调用当前对象的一个成员方法jump
        System.out.println("这个猫在跑！！！");
    }
}


