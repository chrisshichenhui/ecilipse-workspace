package cn.learn.Static;

/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在类。多个对象共享同一份数据。


* */
public class Demo1 {
    public static void main(String[] args) {
        Student one = new Student("黄药师",90);
        one.room = "初一教室";
        System.out.println("姓名：" + one.getName() + "，年龄：" + one.getAge()+",教室搁哪屋："+one.room);

        Student two = new Student("黄蓉", 99);
        System.out.println("姓名：" + two.getName() + "，年龄：" + two.getAge()+",教室搁哪屋："+two.room);

    }
}
