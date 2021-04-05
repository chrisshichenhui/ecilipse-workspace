package cn.java.Domo03;

public class Star {
    private String name;
    private int age;

    public Star() {
        System.out.println("无参构造方法执行了！");
    }

    //重载构造方法

    public Star(String name, int age) {
        System.out.println("有参构造方法执行了！");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
