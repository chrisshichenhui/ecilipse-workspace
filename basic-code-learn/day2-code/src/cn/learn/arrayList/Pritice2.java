package cn.learn.arrayList;

import java.util.ArrayList;

//自定义4个学生对象，添加到集合，并遍历。
public class Pritice2 {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();

        Person p1 = new Person("赵丽颖", 12);
        Person p2 = new Person("李荣浩", 32);
        Person p3 = new Person("王力宏", 33);
        Person p4 = new Person("大冰", 40);

        //将对象元素添加到集合

        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);

        for (int i = 0; i < arrayList.size(); i++) {
            Person p = arrayList.get(i);
            System.out.println(p.getName() + "====" + p.getAge());
        }
    }
}
