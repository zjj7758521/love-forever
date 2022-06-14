package com.itheima.for循环;

public class ForDemo7_3 {
    public static void main(String[] args) {
        //作业练习（5）：
        // 1.打印所有四位数中 个位 + 千位 == 百位 + 十位 的数字
        //    2.最后要打印符合条件的数字的总数量

        int count = 0;
        for (int a =1000;a<=9999;a++){
            int q = a/1000%10;
            int b = a/100%10;
            int s = a/10%10;
            int g = a/1%10;

            if(g+q==b+s){
                count++;
                System.out.println(a );
            }
        }
        System.out.println("所有四位数中,个位 + 千位 == 百位 + 十位 的数字有"+count+"个！");
    }
}
