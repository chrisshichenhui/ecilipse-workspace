package cn.method.demo;
/*

使用方法的注意事项：
1.方法只能在类中定义，不能在方法中定义
2.方法的定义的顺序前后无所谓
3.方法定义后不会被执行，只能调用  三种定义方式：单独调用、打印调用、赋值调用
4.如果方法有返回值，必须写上"return返回值，不能没有
5.一个方法中可以有多个return语句，但是必须保证同时只有一个会被执行到，两个return不能连写
* */
public class Demo07notice {
    public static void main(String[] args) {
        System.out.println("较大的数是：" + max(12,16));
    }

    public static int max(int a ,int b){

        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}
