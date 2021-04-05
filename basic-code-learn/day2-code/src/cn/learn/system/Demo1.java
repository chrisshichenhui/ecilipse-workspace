package cn.learn.system;

import java.util.Arrays;

/*  常用方法
* static long	currentTimeMillis()
返回当前时间（以毫秒为单位）。
* static void	arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
将指定源数组中的数组从指定位置复制到目标数组的指定位置。
*
*
* 参数：
* src  原数组
* srcPos 原数组的起始位置
* dest 目标数组
* destPos 目标数据中的起始位置
* length  要复制的数组元素的数量
* */
public class Demo1 {
    public static void main(String[] args) {
//        int[] src = {6, 7, 8, 9, 10};
//        int[] dest = {1, 2, 3};
//        System.out.println("复制前的数组："+Arrays.toString(dest));
//        System.arraycopy(src, 0, dest, 0, 2);
//        System.out.println("复制后的数组："+ Arrays.toString(dest));



        /*练习从1打印到999需要多少时间
        * */

        long  s=System.currentTimeMillis();
        for (int i = 0; i < 999; i++) {
            System.out.println(i);
        }
        long e=System.currentTimeMillis();
        System.out.println("所需时间为："+(e-s)+"毫秒");


    }
}
