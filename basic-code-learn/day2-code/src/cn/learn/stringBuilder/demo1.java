package cn.learn.stringBuilder;
/*StringBuilder的常用方法：
public StringBuilder append（...):添加任意类型数据的字符串形式，并返回当前对象



* */
public class demo1 {
    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
        bu.append(12).append("hahahaha").append(true);
        System.out.println(bu);
    }
}
