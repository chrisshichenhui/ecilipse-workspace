package cn.method.demo;
/*
打印指定次数的Hello world！
* */
public class Demo6methodPrint {
    public static void main(String[] args) {
        printCount(3);
    }

    public static void printCount(int num){
        for (int i = 1; i <=num; i++) {
            System.out.println("打印第" + i +"遍");
            System.out.println("hello,world!!!");
        }
    }
}
