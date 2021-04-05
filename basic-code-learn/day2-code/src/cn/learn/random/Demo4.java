package cn.learn.random;

import java.util.Random;
import java.util.Scanner;

/*
 * 题目
 * 用代码模拟猜数字的小游戏。
 *
 * 思路：
 * 1.首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
 * 2.需要键盘输入，所以用到了Scanner
 * 3.获取键盘输入的数字，用scanner当中的nextInt方法
 * 4.已经得到的两个数字，判断（if）一下
 *    如果太大了，提示太大，并且重试
 *    如果太小，提示太小，并且重试
 *    如果猜中了，游戏结束
 * 5.重试就是再来一次，循环次数不确定，用while（true）
 * */
public class Demo4 {


    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("请输入数字：");
            int gussNum = s.nextInt();

            if (gussNum < randomNum) {
                System.out.println("数字太小，请重新输入：");
            } else if (gussNum > randomNum) {
                System.out.println("数字太大，请重新输入：");
            } else {
                System.out.println("恭喜你，猜中啦！");
                break;
            }
        }

    }
}
