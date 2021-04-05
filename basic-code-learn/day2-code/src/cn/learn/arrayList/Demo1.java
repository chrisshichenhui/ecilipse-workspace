package cn.learn.arrayList;

import java.util.ArrayList;

/*
  数组的长度不可以发生改变
  但是ArrayList集合的长度是可以随意变化的

  对于ArrayList来说，有一个尖括号<E>代表泛型
  泛型，也就是装在集合当中的所有元素，全都是统一的什么类型
  注意：泛型只能是引用类型，不能是基本类型

  如果需要往集合ArrayList中添加基本类型数据，需要使用基本类型对应的"包装类"

  基本类型   包装类（引用类型，包装类都位于Java.lang包下）
  byte     Byte
  short    Short
  int      Integer【特殊】
  long     Long
  float    Float
  double   Double
  char     Character[特殊】
  Boolean  Boolean


* */
public class Demo1 {
    public static void main(String[] args) {

        //创建一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
        //备注：从JDK 1.7开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //添加一些数据,需要用到add方法
        list.add("赵丽颖");
        list.add("赵狂赢");
        list.add("李笑来");
        list.add("人生路");
        System.out.println(list);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(24);
        arrayList.add(58);
        int num = arrayList.get(1);
        System.out.println(num);
    }
}
