package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
java.text.DateFormat:是日期/时间格式化子类的抽象类
但是它是一个抽象类，使用的时候无法直接创建对象进行使用，可以使用DateFormat类的子类

java.text.simpleDateFormat extends DateFormat

parse方法声明了一个异常叫ParseException
如果字符串和构造方法的模式不一样，那么程序就会抛出异常
调出一个抛出了异常的方法，就必须处理这个异常，要么throws继续抛出这个异常，要么try catch自己处理

* */
public class Demo3 {
    public static void main(String[] args) throws ParseException {
        demo1();
        demo2();

    }

    private static void demo2() throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");

        Date date=sdf.parse("2020年07月21日  20时42分32秒");
    }

    //把date日期格式化成字符串日期

    private static void demo1() {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");//一定要区分大小写
        Date date=new Date();
        String d=sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }
}
