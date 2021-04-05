package cn.learn.calendar;

import java.util.Calendar;
import java.util.Date;

/*
* java.util.Calendar类：日历类
* Calendar类是一个抽象类，里边提供了很多操作日历字段的方法（Year/ month/day_of  Hour等
* static Calendar getInstance()使用默认时区和语言环境获得一个日历
*常用的4个方法：
* public int get(int field) 返回给定日历字符的值
* public void set(int field,int value) 将给定的日历字段设置为给定值
* public abstract void add(int field,int amount) 根据日历的规则，为给定的日历字段添加或者减去指定的时间量
* public Date getTime()：  返回一个表示此Calendar 时间值的Date对象
*
*
* */
public class Demo1 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        Date date =c.getTime();
        System.out.println(date);



       c.set(Calendar.YEAR,2011);




        c.add(Calendar.YEAR,3);


        int year=c.get(Calendar.YEAR);
        System.out.println(year);
    }
}
