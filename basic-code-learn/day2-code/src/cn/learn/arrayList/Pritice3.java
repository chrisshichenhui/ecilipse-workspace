package cn.learn.arrayList;

import java.util.ArrayList;

/*
题目
定义以指定格式打印集合的方法（ArrayList 类型作为参数），使用{}括起来集合，使用@分隔每个元素，格式参照{元素@元素@元素}
* */
public class Pritice3 {
    public static void main(String[] args) {
        ArrayList<String> arr1 =new ArrayList<>();
        arr1.add("黄渤");
        arr1.add("孙红雷");
        arr1.add("黄磊");
        arr1.add("罗志祥");
        System.out.print("{");
        for (int i = 0; i < arr1.size(); i++) {
            String s=arr1.get(i);

            if(i<arr1.size()-1){
                System.out.print(s+"@");
            }else {
                System.out.print(s);
            }

        }
        System.out.println("}");
    }


}
