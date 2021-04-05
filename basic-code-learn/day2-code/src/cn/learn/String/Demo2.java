package cn.learn.String;
/*
==是进行对象的地址值比较，如果确实需要字符串的比较，可以使用两个方法
1.public boolean equals(Object obj):参数可以使任何对象，只有参数是一个字符串并且内容相同才会给true；否则返回false

注意事项：
1.任何对象都能用object进行接收
2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面。

推荐："abc".equals(str)  不推荐：str.equals("abc") 如果对象是空的，容易报空指针异常

public boolean equalsIgnoreCase(String str):忽略大小写，进行内容比较


String 当中常用的方法有：
public int length（）： 获取字符串的长度
public String concat(String str) 将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index): 获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str): 查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1

字符串的截取方法：
public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串。
备注：[begin,end),包含左边，不包含右边。

字符串当中与转换相关的方法：
public char[] toCharArray(): 将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes():获得当前字符串底层的字节数组
public String replace(CharSequence oldString,Charsequence newString);
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
*
* */
public class Demo2 {

    public static void main(String[] args){
        String str1="abc";
        String str2="abc";
        char[] charArray={'a','b','c'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));


        System.out.println(str1.concat("123"));

        String str4="HelloWorld";
        String str5=str4.substring(5);
        System.out.println(str5);
        String str6=str4.substring(1,5);
        System.out.println(str6);

        String str7=str4.replace("o","1");
        System.out.println(str7);

    }

}
