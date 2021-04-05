package cn.learn.scanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个int数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个int数字：");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("输入的两个数字之和为：" + sum  );
    }
}
