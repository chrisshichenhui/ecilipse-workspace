package cn.method.demo;
/*
* 方法其实就是若干个语句的功能集合
*
* 方法好比是一个工厂
* 比如  蒙牛工厂     原料  奶牛  饲料 水
*                  产出物   奶制品
*      钢铁厂        原料  铁矿石   煤
*                   产出物  钢铁
*
* 参数  （原料）   就是进入方法的数据
* 返回值（产出物）  就是从方法中出去的数据
*
*
* 定义方法的完整格式：
*
* 修饰符  返回值类型  方法名称（参数类型 参数名称，....){
*          方法体
*          return 返回值；
* }
*
* 修饰符，现阶段的固定写法，public static
* 返回值类型  方法最终产生数据的类型
* 方法名称  方法的名字  规则和变量名称一样   小驼峰
* 参数类型，  进入方法的数据是什么类型
* 参数名称，进入方法的数据对应的变量名称
* 参数如果有多个，用逗号隔开
* 方法体，方法需要做的事情  若干行代码
* return  两个作用  第一停止当前方法，第二将后面的返回值还给调用处
* 返回值，也就是方法执行后最终产生的数据结果
*
* 定义一个  两个int数字相加的方法，三要素
* 返回值类型，int
* 方法的名称  num
* 参数列表   int a , int b
*
* 方法的三种调用方式
* 1.单独调用，方法名称（参数）
* 2.打印调用  System.out.println(方法名称（参数））；
* 3.赋值调用  数据类型  变量名称 = 方法名称（参数）；
* 注意：返回值固定类型写为void，这种方法只能单独调用，不能进行打印调用或者赋值调用
*
* */
public class Demo2 {


    public static void main(String[] args) {
        //单独调用
        num(12,13);

        System.out.println("=======");

        //打印调用
        System.out.println(  num(1,2));

        //赋值调用
        int number = num(12,12);
        System.out.println("变量的值：" + number);
  }

    public static int num(int a,int b){
        System.out.println("方法执行了");
        int result = a + b;
        return result;
    }
}
