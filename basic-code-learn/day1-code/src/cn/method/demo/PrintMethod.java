package cn.method.demo;
/*
* 定义格式：
* public static void 方法名称（）{
* 方法体
* }
*
* 调用格式，
* 方法名称（）；
* 方法的注意事项：
* 1.方法之间是没有顺序的
* 2.方法里面是不能再写方法的
* 3.方法不调用是不会执行的
*
* */
public class PrintMethod {
    public static void main(String[] args) {
          printMethod();
    }

    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
