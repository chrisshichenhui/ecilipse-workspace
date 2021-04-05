package cn.java.Domo03;
/*
* 构造方法：创建对象的时候使用的方法，当我们通过关键字new来创建对象的时候，其实就是在调用构造方法。；
*构造方法的格式
* public 类名（可有参数或者无参数）{
* 方法体
* }
* 注意事项：
* 构造方法跟类名相同，区分大小写，不能写错了
* 构造方法不要写返回值类型，连void都不写
* 未创建构造方法，系统会默认创建一个无参数的构造方法
* 构造方法可以重载：方法名称相同，参数列表不同
*
*
* */
public class DemoStar {
    public static void main(String[] args) {
        Star s = new Star();
        Star s1 = new Star("欧阳娜娜", 21);
        System.out.println(s1.getName() + s1.getAge());
    }
}
