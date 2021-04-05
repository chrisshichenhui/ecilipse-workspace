package cn.java.fengzhuang;

public class Student {
    private String name;
    private int age;
    private boolean male;
    public void setName(String str){
        name=str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }

    public int getAge() {
        return age;
    }
}
