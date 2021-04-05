package cn.method.demo;
/*
*  有参数的方法：方法体执行需要传入数据
* 无参数的方法：方法执行不需要传入数据  比如打印10次HelloWorld
* */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(demo(12,3));
        System.out.println("===========");

        demo1();
    }


    //有参数的方法
    public static int demo(int a,int b){
        int result = a * b ;
        return result;
    }

    //无参数的方法
    public static void demo1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello" + i);
        }

    }
}
