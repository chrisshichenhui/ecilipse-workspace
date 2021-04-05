package date;

import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();

    }
    /*
     * long getTime() 把日期转换为毫秒值（相当于System.currentTimeMillis()方法
     * 返回自1970年1月1日 00：00：00 GMT 以来的毫秒数
     * */

    private static void demo03() {

        Date date3 = new Date();
        long time = date3.getTime();
        System.out.println(time);
    }

    /*
     *   Date类的带参数构造方法
     * Date（long date）：传递毫秒值，把毫秒值转换为Date日期
     *
     * */
    private static void demo02() {
        Date date1 = new Date(1595330625237l);
        System.out.println(date1);//1970年1月1日 8：00：00
    }


    /*
    Date类的空参数构造方法
    * 调用空参构造方法，获取当前系统的日期和时间
    * */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }


}
