package cn.learn.arrayList;
/*
* 生成6个1-33之间的随机整数，添加到集合，并遍历集合
* */

import java.util.ArrayList;
import java.util.Random;

public class Pritice1 {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            int num=random.nextInt(33)+1;
            arrayList.add(num);
            System.out.println("添加了："+num);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
