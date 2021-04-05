package cn.learn.arrayList;
/*题目：
用一个大集合存入20个随机数字，然后筛选出其中的偶数元素，放到小集合当中
要求使用自定义的方法来实现筛选

分析：
需要创建一个大集合，用来存储int数字
随机数字需要使用Random nextInt
循环20次，把随机数字放入大集合，for循环，add方法
定义一个方法，用来进行筛选

筛选：根据大集合，筛选出要求的元素，得到小集合
* */
import java.util.ArrayList;
import java.util.Random;

public class Pritice4 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100) + 1;
            bigList.add(num);
        }

        System.out.println("随机生成的大集合" + bigList);
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("你想要的小集合长这个样子：" + smallList);

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num1 = bigList.get(i);
            if (num1 % 2 == 0) {
                smallList.add(num1);
            }
        }
        return smallList;
    }

}
