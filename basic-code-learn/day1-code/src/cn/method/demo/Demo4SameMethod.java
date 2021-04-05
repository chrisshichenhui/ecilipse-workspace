package cn.method.demo;
/*
*
* 创建一个方法  比较两个数大小
*
* 返回值数据类型  boolean
* 方法名称  isSame
* 参数 int a ,int b
*
* */
public class Demo4SameMethod {
    public static void main(String[] args) {
        System.out.println("这两个数相等是：" + isSame(12,34));
        System.out.println("这两个数相等是：" + isSame(34,34));
    }


    public static boolean isSame(int a , int b){


//        //几种写法
//        boolean same;
//        if (a == b){
//            same = true;
//        }else {
//            same = false;
//        }
//        return same;

//        same = a ==b;


//        boolean same = a==b ? true:false;
//        return same;


        return a==b;
    }
}
