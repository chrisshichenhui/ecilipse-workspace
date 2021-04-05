package cn.learn.arrays;

import java.util.Arrays;
/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒叙打印
* */
public class ArrayPritice {
    public static void main(String[] args) {
        String s="832hkjshakjfhkasdjas";
//必须是一个数组，才能用Arrays.sort方法
        //String--》数组，用toCharArray
        char[] chars=s.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
