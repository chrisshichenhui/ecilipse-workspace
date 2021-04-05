package cn.java.fengzhuang;

/*对于基本类型当中的Boolean值，Getter方法一定要写成isXXX的形式，而setXxx规则不变。
 * */
public class Demo03Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们：" + stu.isMale());

    }
}
