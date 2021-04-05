package cn.method.demo;
/*
求1-100的所有数字的和

* */
public class Demo5GetSum {
    public static void main(String[] args) {
        System.out.println("算出的结果是：" + getSum());
    }

    public static int getSum(){
        int sum = 0;

        for (int i = 1; i <=100; i++) {
            sum += i;
        }
        return sum;
    }
}
