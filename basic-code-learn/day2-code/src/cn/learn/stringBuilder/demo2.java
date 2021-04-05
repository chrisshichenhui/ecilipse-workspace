package cn.learn.stringBuilder;
/*
StringBuilder和String互换
* */
public class demo2 {
    public static void main(String[] args) {

        //String->StringBuilder
        String s="hello";
        System.out.println("String :"+s);

        StringBuilder bu = new StringBuilder(s);
        System.out.println("StringBuilder :"+bu);

        //StringBuilder->String
        String s1=bu.toString();
        System.out.println("s1:"+s);
    }
}
