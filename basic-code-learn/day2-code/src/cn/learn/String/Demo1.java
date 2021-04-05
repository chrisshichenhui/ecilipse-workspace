package cn.learn.String;

/*
java.lang.String类代表字符串
API当中说：Java程序中的所有字符串字面值（如"ABC"）都作为此类的实例实现。
其实就是说：程序当中所有的双引号字符串，都是String类的对象。（就算没有new，也照样是。）

字符串的特点：
1.字符串的内容用不可变。[重点】
2.正式因为字符串不可改变，所以字符串是可以共享使用的。
3.字符串效果相当于是char[]字符数组，但是底层原理是byte[]字节数组

创建字符串的4种构造方法：
1.public String() ：创建一个空白字符串，不含有任何内容。
2.public String（char[] array): 根据字符数组的内容，来创建对应的字符串。
3.public String（byte【】array）：根据字节数组的内容，来创建对应的字符串。

一种是直接创建

* */
public class Demo1 {
    public static void main(String[] args) {

        String str1 = new String();
        System.out.println("第一个字符串是：" + str1);

        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串是：" + str2);

        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第3个字符串：" + str3);

        String str4 = "abc";
        System.out.println("第4个字符串：" + str4);


    }
}
