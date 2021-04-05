package cn.learn.scanner;

import java.util.Scanner;

public class Demo3ScannerMax {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+ i +"个数字：");
            int num = sc.nextInt();

            if (num >max){
                max=num;
            }
        }
        System.out.println("这三个最大的数是：" + max);
    }
}
