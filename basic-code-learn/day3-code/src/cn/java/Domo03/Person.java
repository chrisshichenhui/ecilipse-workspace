package cn.java.Domo03;

/*
 * 当当方法的局部变量和类的成员变量重名的时候，根据"就近原则"，优先使用局部变量。
 * 如果需要访问本类当中的成员变量，需要使用格式：
 * this.成员变量*/
public class Person {


    String name;

    public void call(String name) {
        System.out.println(name + "你好，我是：" + this.name);
    }
}
