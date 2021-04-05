package cn.java.Domo03;
/*
一个标准的类要满足三个个条件：
1.所有的成员变量都要是private修饰
2.成员变量都要有get、set方法
3.要有无参构造方法，也要有全参构造方法


* */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
