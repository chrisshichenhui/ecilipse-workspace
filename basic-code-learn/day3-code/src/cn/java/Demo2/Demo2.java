package cn.java.Demo2;

public class Demo2 {
    public static void main(String[] args) {
       Phone apple=new Phone();
       apple.brand="Apple";
       apple.price=5499.00;
       apple.color="红色";
       apple.call("小明");
       apple.sendMessage();
    }
}
