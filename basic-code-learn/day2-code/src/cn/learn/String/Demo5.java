package cn.learn.String;

import java.util.Scanner;

/*
 * 题目：
 * 键盘输入一个字符串，并且统计其中各种字符出现的次数
 * 种类有  大写字母、小写字母、数字、其他
 *
 *String---char[],方法就是toCharArray()
 *
 *
 * */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = scanner.next();

        int countUpper = 0;//大写字母
        int countLower = 0;//小写字母
        int countNumber = 0;//数字
        int countOther = 0;//其他

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z') {  // char 类型数据可上升为int类型，可直接进行比较
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("大写字母一共：" + countLower + "个");
        System.out.println("小写字母一共：" + countLower + "个");
        System.out.println("数字一共：" + countNumber + "个");
        System.out.println("其他一共：" + countOther + "个");
    }
}
