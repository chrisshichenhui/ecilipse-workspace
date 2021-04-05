package cn.learn.math;

/*
题目：计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个

用for循环
起点位置应该转换成-10，两种办法
   可以使用Math.ceil 方法，向上（向正方向）取整
   强转成为int，自动舍弃所有小数位
每一个数字都是整数，所以步进表达式应该是num++,这样每次都是+1的。
如何拿到绝对值，Math.abs方法
一旦发现了一个数字，需要让计数器++进行统计

备注：如果使用Math.ceil方法，-10.8可以变成-10.0.注意double也是可以进行++的。

* */
public class Pritice {

    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
//        for (int i = (int) min; i < max; i++) {
        for (double i = Math.ceil(min); i < max; i++) {
            double num = Math.abs(i);
            System.out.println(num);
            if (num > 6 || num < 2.1) {
                count++;
            }
        }
        System.out.println("绝对值大于6或者小于2.1的整数有" + count + "个");

    }
}
