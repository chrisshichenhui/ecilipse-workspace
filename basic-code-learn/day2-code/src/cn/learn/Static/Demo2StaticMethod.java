package cn.learn.Static;
/*
一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。



*
* */
public class Demo2StaticMethod {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        obj.methodStatic();// 正确，不推荐，这种写法在编译之后也会被javac翻译成为"类名称.静态方法。
        MyClass.methodStatic();//正确、推荐

    }
}
