package cn.learn.math;

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作

public static double abs(double num): 获取绝对值。
public static double ceil(double num):向上取整。
public static double floor(double num):向下取整。
public static double long round(double num):四舍五入。
Math.PI 代表近似的圆周率常量

* */
public class demoMath {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.13));//3.13
        System.out.println(Math.abs(-3));//3
        System.out.println(Math.abs(0));//0
        System.out.println("===========");

        //向上取整
        System.out.println(Math.ceil(3.8));//4.0
        System.out.println(Math.ceil(3.1));//4.0
        System.out.println(Math.ceil(3.0));//3.0
        System.out.println("==============");
        //向下取整
        System.out.println(Math.floor(3.2));//3.0
        System.out.println(Math.floor(4.5));//4.0
        System.out.println(Math.floor(3.9));//3.0
        System.out.println("==============");

        //四舍五入
        System.out.println(Math.round(3.99));//4
        System.out.println(Math.PI);

    }
}
